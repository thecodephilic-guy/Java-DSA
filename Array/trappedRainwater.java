public class trappedRainwater {

    public static int trappedWater(int height[]){
        
        //step-1: calculate maxLeftBoundary
        //step-2: calculate maxRightBoundary
        //step-3: determine the waterLevel (as waterLevel = min(maxLeftBoundary, maxRightBoundary))
        //step-4: calculate trappedWater = waterLevel - barHeight

        int len = height.length;
        int maxLeftBoundary[] = new int[len];
        int maxRightBoundary[] = new int[len];
        int waterLevel;
        int trappedWater = 0;

        maxLeftBoundary[0] = height[0];
        for(int i = 1; i<len; i++){
            maxLeftBoundary[i] = Math.max(maxLeftBoundary[i-1], height[i]);
        }

        maxRightBoundary[len - 1] = height[len - 1];
        for(int i = len-2; i>=0; i--){
            maxRightBoundary[i] = Math.max(maxRightBoundary[i+1], height[i]);
        }

        //loop for the calculations
        for (int i = 0; i < len; i++) {
            waterLevel = Math.min(maxLeftBoundary[i], maxRightBoundary[i]);
            trappedWater += (waterLevel - height[i]);
        }


        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("The trapped rainwater is: "+trappedWater(height));

    }
}

//Time Complexity = O(n) this means time Complexity is proportional to the number of bar in the array named height[]