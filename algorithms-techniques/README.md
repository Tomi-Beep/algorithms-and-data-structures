# Techniques for creating algorithms
## Problem 1
We are given N digits. Write an algorithm that composes the largest possible number from those digits.

Input: The first number in the input is the number of digits N, then in the next line are the given digits.

Output: The maximum possible number containing those digits

## Problem 2
We are given N trains. Write an algorithm that finds the minimum number of platforms needed to schedule those trains.

Input: The first number in the input is the number of trains N, then in the next N lines are the arrival and departure minutes for each of the trains.

Output: The minimum number of needed platforms to accommodate the trains.

## Problem 3
We are given a street with N possible positions on which we can put a light. A single light will illuminate its own position and 2 more positions to the left and 2 more to the right of it. Our task is to illuminate the street with the minimum possible lights. Not all possible positions must contain light.

Input: The first number in the input is the number of possible positions to put a light bulb N and the length of the street M, then in the next line are the possible positions on which we can put a light. 

Output: The minimum lights we need to illuminate the street.

## Problem 4
We are given N scheduled meetings. Write an algorithm that finds the minimum number of meeting rooms needed to schedule those meetings.

Input: The first number in the input is the number of meetings N, then in the next N lines are the start and end time for each of the meetings.

Output: The minimum number of needed meeting rooms to schedule the meetings.

## Problem 5
You are given a binary string S. A binary string is a string that contains only '1's and '0's. A substring of a binary string is called positive if the number of '1's in the substring is strictly greater than the number of '0's. Print the number of positive substrings for the given string.

Input: The first line of the input contains the length of the string N. The second line contains the binary string S.
5
10011

Output: The output should print the number of positive substrings in S
6

Explanation: For the given string 10011, the positive substrings are:
- 1(position 0)
- 1(position 3)
- 1 (position 4)
- 11 (positions 3 и 4)
- 011 (positions from 2 to 4)
- 10011 (the entire string)

## Problem 6
For a given array of integers, find the maximum product formed by multiplication of the numbers of an increasing subarray of the given array.

Input: The first line of the input contains N, the number of elements of the array. The second line of the input contains the array.

Output: The maximum product formed in the described way.

Example:

Input: 

6

3 100 4 5 150 6

Output: 45000

The maximum product is formed from the increasing subarray 3, 100, 150. Note that the longest increasing subarray is 3, 4, 5, 6.
