# You are given marks of a student as input. Display a correct message based on the following rules:
# for marks above 90, print "Excellent".
# for marks above 80 and less than equal to 90, print "Good"
# for marks above 70 and less than equal to 80, print "Fair".
# for marks above 60 and less than equal to 70, print "Meets Expectations".
# for marks below 60, print "Below Expectations".
# Input Format
# There is a single integer N.
# Output Format
# Print a single string in a line.
# Example 1
# Input
# 95
# Output
# Excellent
# Explanation
# As according to the given condition, for N (marks) >90 - Excellent is printed
# Example 2
# Input
# 75
# Output
# Fair
# Explanation
# As according to the given condition, for 70 < N (marks) <= 80 - Fair is printed
# Constraints
# 1 <= |N| <= 100
# Topics
# Conditionals
# Basics

if __name__=='__main__':
    marks = int(input())
    #Write your code here
    if marks > 90:
        print('Excellent')
    elif marks > 80 and marks <= 90:
        print('Good')
    elif marks > 70 and marks <= 80:
        print('Fair')
    elif marks > 60 and marks <= 70:
        print('Meets Expectations')
    else:
        print('Below Expectations')    