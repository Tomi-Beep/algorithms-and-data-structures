# Hashing

## Problem 1
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

Пример/Еxample:
Влез/Input:
5  
Martin 25 3 100  
Jana 26 4 90  
Martin 25 5 120  
Jana 26 2 95  
Nenad 20 6 80
Излез/Output:
0:<<Nenad, 20>,<6, 80>>
1:
2:
3:
4:<<Jana, 26>,<4, 90>>
5:<<Martin, 25>,<5, 120>>
6:
7:
8:
9:

## Problem 2
At the input of this task you will be given rows with the following format:
First_name Last_name budget ip_address time city price
Example
Jovan Todorov 1000 10.73.112.200 15:30 Bitola 760
Which means that the person with First name and Last name Jovan Todorov, has a budget of 1000 denars, has an IP address with network 10.73.112 and host number 200, and joined at 15:30 to buy a ticked to Bitola which costs 760 denars.

You will be given N such rows, followed by an empty row and M more rows of the same format, which we will use for testing.

From the test line you need to extract the IP address of the network and then answer the following question with this network:

Of the N people at the input, from the ones who connect from the same network (from any host on the network)
how many of them logged in later than 11:59; and
of these, which one logged in the earliest?

(if there are more with the same minimum time then which one is the first one in the input?) (there will always be at least one of them)


You will need to do this for all M rows for testing!

Recommendation, use OBHT and/or CBHT.
