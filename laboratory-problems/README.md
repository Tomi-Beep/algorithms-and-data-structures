# Laboratory Problems
## Doubly-linked list
For a given doubly-linked list with N integers, you need to find the number of elements such that the average of all elements before it is bigger than the average of all elements after it in the list. 

Input: The first number in the input is the number of integers in the list N, then in the next line the elements are given, separated by spaces.

Output: The number of elements that satisfy the condition.

## Knapsack problem
We are given N tasks with estimated completion time and the amount we can earn from that task. Write an algorithm that finds the maximum earnings we can have for 40 hours. Note that we can have a partial earning from a partially completed task.

Input: The first number in the input is the number of tasks N, then in the next N lines are the time needed for the task and the amount of money we can earn from it.

Output: The maximum amount we can earn in 40 hours

## Divide and conquer problem
We are given an array of N numbers. Using the method "divide and conquer" write a binary search algorithm that searches for a given number M. If the number is found, print the position of the number in the array. If the number is not in the array, print "Ne postoi".

Input: The first number in the input is the size of the array N, and the number we are searching M. Then in the next line are the array elements.

Output: The position of the number we are searching, or "Ne postoi" if no such number exists in the array.

## Dynamic programming problem
What is the minimum number of times we need to subtract the square of an integer for a number X to become 0?

Input: Integer X from 1 to 10^5.

Output: The desired result.
Examples:

![image](https://github.com/user-attachments/assets/d1257fdd-4942-4f01-b0b3-180f36a6ee1a)

## Modified programming language (Stack)
We are given code in a modified programming language is given, where functions are represented by an opening and closing tag ("functionName" and "endfunctionName"). Your task is to determine whether the given code is valid.

Example of valid code:
```
func1
func2
endfunc2
func3
endfunc3
endfunc1
```

Example of invalid code (missing closing tag for func3):
```
func1
func2
endfunc2
func3
endfunc1
```

Input: Code in a modified programming language, where each tag is written in a new line. Tags are entered until "x" is entered.

Output: "Valid" if the code is valid, "Invalid" if the code is not valid.

## Employees and projects (Hash Table)
In this task, you will work with two objects "Employees" and "Projects".

An employee is defined with 2 values: Name (String), Age (integer).

A project is defined with 2 values: Working Time (integer), Hourly Salary (integer).

For a given project, the total salary is calculated as the product of the working time and the hourly salary.

Employees will be offered projects, and they should choose the project from which they will receive the highest salary (if they have a choice of multiple projects with the same highest salary, then the first one).

Your task will be to help employees by using CBHT with 10 buckets where for each employee you will store their best offer.

For the hash function, use the product of the employee's age and the ASCII value of the first letter of the employee's name.

Input:
The first line contains an integer N that indicates the number of offers. Then, in the next N rows, 4 values ​​are given, the information about the offers, the name and age of the employee and the working hours and hourly wage of the project respectively:

N
name_1 age_1 time_1 rate_1
name_2 age_2 time_2 rate_2
...
name_N age_N time_N rate_N
Output:

Print the entire table (with the ready-made toString method).

Each employee should be printed in the format "<name, age>" where in place of name and age should be the name and age of the employee respectively (implement this in the toString method)

Each project should be printed in the format "<time, rate>" where in place of time and rate should be the working hours and hourly wage of the project respectively (implement this in the toString method)

## SLLTree problem - find leaves in a subtree of a given node
In the following task you need to build an unordered (general) tree with N nodes, for which you will need to answer Q questions of the type "how many leaves does the subtree of a selected node have".

Each node will have a unique index from 1 to N. The root of the tree will always have an index 1. All children will have indices greater than the parent indices.

The input will contain N+Q rows of the type
- root 1 - You need to set the root of the tree to be the node with index 1
- add parent_index child_index - You need to add a child node with index child_index to the node with index parent_index
- ask node_index - You need to answer how many leaves are in the subtree of the node with index node_index

## Binary tree problem - nodes with two children
In the following task, you need to build a binary tree with N nodes, for which you will need to answer Q questions of the type "how many nodes with exactly two children are there in the subtree of a selected node"..

Each node will have a unique name. The name of the root of the tree will always be given to you first.

The input will contain N+Q rows of the type

- root name - You need to set the root of the tree to be the node named name
- add parent_name child_name - You need to add a child node named child_name to the node named parent_name
- ask node_name - We need to answer the question about the subtree of the node named node_name

## Binary search tree combined with Hash Maps - find depth of element T in tree
You are given a binary search tree with N integers.

Write a function that, for a binary search tree and a selected element T from the tree will:

- find the depth of element T in the tree
You will need to use that function Q times when building the tree.

The input will contain N+Q rows of the type 

- insert value - You need to insert the value value into the tree.
- ask value - You need to answer at what depth in the tree is the node with value value

## Binary search tree combined with Hash Maps - greater value than given value
You are given a binary search tree with N integers.

Write a function that, for a binary search tree and a selected element T from the tree will:

- you will find how many elements in the tree are greater than T
You will need to use that function Q times when building the tree.

The input will contain N+Q rows of the type 

- insert value - You need to insert the value value into the tree.
- ask value- You need to answer how many elements in the tree have a value greater than value

## Undirected unweighted graph problem
Given an undirected unweighted graph whose vertices are positive integers, find the number of paths in the graph, starting from a fixed vertex V, such that the sum of the vertices is N. The vertices in the path can be repeated.

Input: The first line contains the number of edges in the graph M, followed by the edges in the next M lines. The edges are given in the format vertex1 vertex2. The second-to-last line contains the start vertex V and the last line contains the wanted sum N.  

Output: The number of paths where the sum of the vertices is N.

Example:

Input:
```
6
2 5
2 3
5 3
5 1
3 1
3 4
5
10
```
Output: 3 (Explanation: the paths are 5-2-3, 5-3-2, 5-1-3-1)

## Depth first search problem: Routers
Given routers labeled from 0 to N−1 that are connected in a network, the failure of a specific router R may split the network into groups of routers that are no longer connected. Each router in a group is connected to at least one other router from that group, and isn't connected to any routers outside of that group. Determine the number of such groups that will form if router R fails.

Input: The first line contains the number of routers N. The next line contains the number of connections between the routers M, followed by M lines that specify which routers are connected with each connection. The last line contains the router R that failed.

Output: The number of groups of routers.

Example:

Input:
```
5  
4
0 1
1 2
2 3
2 4  
1 
```
Output: 2 (Explanation: If router 1 fails, the network will split into two groups: 0 and 2,3,4.)

