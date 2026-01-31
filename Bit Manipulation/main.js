class Solution{
    //bruteforce - O(lon n)
    checkIthBit(n, i){
        let binary = n.toString(2);

        if(i >= binary.length) return false;

        return binary[binary.length-1-i] === '1';
    }

    //optimized - O(1)
    checkIthBit2(n, i){
        const mask = 1 << i;
        return (n & mask) !== 0;
    }

    //optimized - O(1)
    isOdd(num){
        //using the fact binary representation of all the odd numbers has 1 as LSB:
        //so we can use 1 as mask
        //XOR of a number with 1 increase the number by 1 if it is even and decrease the number by 1 if
        //the number is odd
        return (num^1) === (num-1);
    }

    //Bruteforce - O(n)
    countSetBits(n){
        const binary = n.toString(2);
        var count = 0;

        for (let i = 0; i < binary.length; i++) {
            if(binary[i] === '1') count++;            
        }

        return count;
    }

    //Opitmized - O(k) k is the number of set bits
    countSetBits2(n){
        var count = 0;

        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }

        return count;
    }
}

const sol = new Solution()
console.log("Bruteforce check for ith Set bit or not: ",sol.checkIthBit(5, 1));
console.log("Optimised check for ith Set bit or not: ",sol.checkIthBit2(5, 0));
console.log("Is 3 odd? : ", sol.isOdd(3));
console.log("Is 6 odd? : ", sol.isOdd(6));
console.log("Total set bits in 15 = ", sol.countSetBits(15)); //1111
console.log("Total set bits in 16 = ", sol.countSetBits(16)); //10000
console.log("Total set bits in 15 = ", sol.countSetBits2(15)); //1111
console.log("Total set bits in 16 = ", sol.countSetBits2(16)); //10000
