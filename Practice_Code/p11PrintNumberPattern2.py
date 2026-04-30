# Given an integer n, print a pattern of n lines, where the ith line has the numbers i to 1 printed in descending order. Check the sample cases for a better understanding.
# Input Format:
# Input consists of an integer N.
# Output Format:
# Print the pattern as described above.
# Example 1
# Input:
# 5
# Output:
# 1
# 21
# 321
# 4321
# 54321
# Example 2
# Input:
# 3
# Output::
# 1 
# 21 
# 321 
# Constraints
# 1 <= n <= 9
# Topics
# Loops

if __name__ == '__main__':
    n = int(input())
    #your code here
    for i in range(1, n + 1):
        for j in range(i, 0, -1):
            print(j, end = "")
        print()
