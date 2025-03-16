# Graphs

## Problem 1
You're given objects connected by streets and grouped into cities. A group of objects is considered to belong to the same city if each object is connected to at least one other object in that city and is not connected to any object from another city. Determine how many cities the given objects are grouped into.

Input: The first line contains the number of objects N. The next N lines contain the names of the objects. The next line contains the number of streets M, followed by M lines that specify the objects connected by each street.

Output: The number of cities the given objects are grouped into.

Example:

Input:

5  
School1  
ApartmentBuilding1  
Park1  
Supermarket1  
Hospital1  
2  
School1 ApartmentBuilding1  
Park1 Supermarket1  

Output: 3 (Explanation: School1 and ApartmentBuilding1 are in one city, Park1 and Supermarket1 in another, and Hospital1 in a third.)

## Problem 2
You're given a group of people, some of whom know each other. The task is to organize New Year's Eve gatherings such that every person in a group celebrating together knows at least one other person in that group, and no one in the group knows anyone outside of it. Determine how many New Year's Eve gatherings will be organized by the given people.



Input: The first line contains the number of people N. The next N lines contain the names of the people. The next line contains the number of connections M, followed by M lines that specify the pairs of people who know each other.

Output: The number of cities the given objects are grouped into.

Example:

Input:

6
Alice
Bob
Charlie
Diana
Eve
Frank
3
Alice Bob
Charlie Diana
Eve Frank   

Output: 3 (Explanation: Alice and Bob are one group, Charlie and Diana a second group, and Eve and Frank a third group)

## Problem 3
Given an undirected unweighted graph whose vertices are positive integers, find the number of paths in the graph, starting from a fixed vertex V, such that the sum of the vertices is N. The vertices in the path can be repeated.



Input: The first line contains the number of edges in the graph M, followed by the edges in the next M lines. The edges are given in the format vertex1 vertex2. The second-to-last line contains the start vertex V and the last line contains the wanted sum N.  

Output: The number of paths where the sum of the vertices is N.

Example:

Input:

6
2 5
2 3
5 3
5 1
3 1
3 4
5
10

Output: 3 (Explanation: the paths are 5-2-3, 5-3-2, 5-1-3-1)

## Problem 4
Santa Claus lives in Lapland. In his free time when it is not around New Year, while the elves are working on toys for next year, Santa Claus has a hobby. He likes to raise fish. But he does this in natural lakes. The ponds are interconnected by creeks, and the creeks flow from one pond to another. Fish from one lake can freely go to another lake through the streams. Every spring Santa Claus likes to stock the ponds with new fish. Your task is to tell Santa Claus, if he releases new fishes into pond X, how many other ponds the fishes will be able to reach on their own, so that there is no need for him to stock those ponds himself.

Input: In the first line of the input, the number N < 15 is given, the number of ponds. In the second line, the number U < 20 is given, the number of rivers between the lakes. In the following U lines, pairs of 2 numbers R and Q are given, which means there is a river flowing from R to Q, where R and Q are pond numbers. In the last line, the number L is given, in which pond Santa Claus will release the fish.

Output: The number of ponds that will be stocked except the initial one is printed out.

Example: 

Input: 

11 

19 

3 3 

7 8 

7 3 

1 7 

0 0 

7 2 

6 3 

2 0 

0 9 

6 10 

1 2 

2 8 

5 7 

4 3 

10 4 

3 9 

7 10 

9 4 

4 10 

7 

Output: 

7
