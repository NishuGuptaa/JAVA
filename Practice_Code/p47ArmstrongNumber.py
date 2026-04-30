# Write a program to print out all Armstrong numbers between 1 and N.
# A number is called an Armstrong number if the sum of cubes of each digit of the number is equal to the number itself.
# For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
# Input Format
# The input contains a single integer representing N.
# Output Format
# Print all the Armstrong numbers from 1 to N in separate lines.
# Example 1
# Input
# 200
# Output
# 1
# 153
# Explanation
# 1 and 153 are only Armstrong numbers between 1 to 200.
# Example 2
# Input
# 1000
# Output
# 1
# 153
# 370
# 371
# 407
# Explanation
# 1, 153, 370, 371, 407 are only Armstrong numbers between 1 to 1000.
# Constraints
# 1 <= N <= 10^6
# Topics
# Number System: Number Problems
# Math
# Companies
# Oracle
# VMware

class Solution:    
    def printArmstrongNumbers(self,n):
        #Write your code here.
        for i in range(1, n + 1):
            num = i
            s = 0
            while num > 0:
                digit = num % 10
                s += digit * digit * digit
                num //= 10
            if s == i:
                print(i)

if __name__=='__main__':
    n = int(input())
    Obj = Solution()
    Obj.printArmstrongNumbers(n)
    