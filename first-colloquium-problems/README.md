# First Colloquium Problems

## Problem 1
A single linked list of duplicate numbers is given. For a given value of an info field in the list, ensure that the number of repetitions (duplicates) of that number is even. If for the given value of the info field, the number of elements with that value is odd, an element with the same value should be added before the first appearance of the value.

Note: 0 is an even number.

Input: In the first line, the number of elements in the list are given, then the elements themselves, and finally, the number (value) that will ensure that it appears an even number of times.

Output: The list with an even number of duplicates for a given value is printed on output.

Examples:

Input:
6
1 2 5 7 9 12
7

Output:
1 2 5 7 7 9 12

Input:
8
7 1 2 7 5 9 7 12
7

Output:
7 7 1 2 7 5 9 7 12

## Problem 2
A double linked list of double linked lists is given. Find the sum of each sub-list, and then the product of all those sums.

Input:

An integer N that tells us how many lists there are.

An integer M that tells us how many elements there are in each list.

Output:

The product of the sums of the sub-lists.

Example:

Input:

3

4

1 2 3 4

2 3 4 5

6 7 8 9

Output:

1400

## Problem 3
There were N adults and M children that wanted to travel from the bus station in FinTown to the neighbouring city MinTown. The price of one ticket is 100 den. If an adult wants to travel with K children, he would need to pay one ticket for him and K-1 tickets for the children (the ticket for one of the children is free). The adults can also travel by themselves, in which case they only pay one ticket. Additionally we know that the children can't travel without being accompanied by an adult.

In the first row the number N is given, and then in the second row the number M. You need to calculate the minimum and the maximum value in den. that the passengers can pay for their tickets, and print them in two separate lines. There will be at least one adult in the bus.

## Problem 4
Find the longest decreasing sequence in an array. The numbers in the sequence don't need to be on consecutive indices in the array.

## Problem 5
Write an algorithm that will calculate (evaluate) a mathematical expression that consists of numbers and operations for adding (*) and multiplying (*).

Note: The operation of multiplying has precedence before the operation of adding.
