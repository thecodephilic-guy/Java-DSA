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
}

const sol = new Solution()
console.log("Bruteforce check for ith Set bit or not: ",sol.checkIthBit(5, 1));
console.log("Optimised check for ith Set bit or not: ",sol.checkIthBit2(5, 0));
console.log("Is 3 odd? : ", sol.isOdd(3));
console.log("Is 6 odd? : ", sol.isOdd(6));
