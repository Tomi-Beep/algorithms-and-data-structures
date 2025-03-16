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
