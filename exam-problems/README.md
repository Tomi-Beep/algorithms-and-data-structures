# Exam Problems

## Problem 1
Given a binary search tree, you need to write a recursive function inorderSuccessor that will return the successor of a given value.

## Problem 2
You are given a dictionary of words in Kumanovo's dialect, and how they are written in formal macedonian language. Then, you are given a text that is written in the dialect. You need to replace all occurances of the words in the dialect that are given in the dictionary, with the corresponding words in the formal language.

Note: You need to ignore punctuation marks dot(.), comma(,), exclamation mark(!) and question mark(?). Also, the words might appear with a capital first letter in the text and in that case the synonym in the formal macedonian language should also be printed capitalized.

## Problem 3
Given a string, you need to find the most frequent sub-string that is a part of the original and print it. If two sub-strings are equally frequent, you should print the longer one. If they are with the same length as well, then you should print the one that is lexicographically smaller.

Example: Sub-strings of the string "abc" are "a", "b", "c", "ab", "bc", "abc". They all have the same frequency, so the longest one is printed - "abc".
For example:

## Problem 4
You are given a complete tree where each edge has a weight of 2. For each pair of nodes you should find the shortest distance between them. If there is no solution for some pair you should print "Error".

## Problem 5
You need to do a spell check of a text written in English, if it's correctly written. For that, first you are given a dictionary of words (i.e. a list of all the words that are used), and then you are given a text. As a result you should print all the words that are spelled incorrectly or are not present in the dictionary.

Input: First you are given an integer N - number of terms in the dictionary, and then in the next N rows you have the words themselves. Then you are given a text, which should be spell-checked.

Output: You should print a list of words that are written incorrectly (each in a separate row). If all words are written correctly you should print: Bravo.

Note: You should ignore punctual marks such as dot(.), comma(,), exclamation mark(!) and question mark(?). You should also take in consideration uppercase / lowercase letters, i.e. if the words in the dictionary are with only lowercase letters, in a sentence they can appear with a capitalized first letter, and that should be considered as correct. Work with an Open bucket hash table. You should determine the number of buckets and the hash function yourselves.
