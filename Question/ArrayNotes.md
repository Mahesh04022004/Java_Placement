Algorithm Used in Array

    -> Reversal Algorithm : used to left rotate the array d times
            Working : 
                1-> reverse starting d element 
                2-> then remaining element
                3-> reverse entire array

                if d>n reduce d d = d%n because at time d == n the array will remain same so why include extra n cases.

    
    -> Kadane's Algorithm  : used to find the max sum of subarray in O(n) TC
            Working : 
                1->take maxSum
                2->take currentSum
                3->traverse array and calculate sum 
                4->update maxSum using max()
                5->whenever currentSum < 0 : currentSum = 0
