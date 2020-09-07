# Collection Exercise 2 on 07/09/2020

### Problem 1: 
- Given an array of numbers, find the maximum count of unique numbers in a
subarray of a given length using Dequeue.
- Create a class named **`UniqueNumbersCounter`** with the following method:
+**findUniqueNumbersCount(int[],int)** : String
	- Should accept int array of numbers, length of subarray as input
	 - Should find the maximum count of unique numbers in a subarray of a given length
	 - Should return "Give proper input not empty array" if the given array is empty
	 - Should return "Give proper input not a null array" if the given array is null
	 - Should return "Give proper input, sub-array length exceeds array length" if the length of the subarray is greater than the length of the array
	 - Should return "Give proper input, sub-array length can not be negative or zero" if given sub-array length is zero or negative
	 - Should return "Count of Unique Numbers is 2" if the count of unique numbers in a subarray of a given length is 2
***Example***
~~~
Sample Input:
array = {4,5,2,1,2}
sub array length = 3
Expected Output:
Count of Unique Numbers is 3
~~~
~~~
Sample Input:
array = {6,10,4,5,2,1,2}
sub array length = 7
Expected Output:
Count of Unique Numbers is 6
~~~
~~~
Sample Input:
array = {6,10,4,5,2,1,2}
sub array length = 10
Expected Output:
Give proper input, sub array length exceeds array length
~~~
~~~
Sample Input:
array = {7,10,2,1,2}
sub array length = -4
Expected Output:
Give proper input, sub-array length can not be negative or zero
~~~

### Problem 2: 
- Given a number(N), generate the binary numbers from 1 to N using queue
- Create a class named **`BinaryNumberGenerator`** with the following method:
**+findBinaryNumbersSequence(int)** : String
	- Should accept number as input
	 - Should generate the binary numbers from 1 to N and return as a result
	 - Should return "Give proper input not zero or negative" if the given number is zero or negative
	 - Should return "Give proper input not greater than 20" if the given number is greater than 20
*Example*
~~~
Sample Input:
4
Expected Output:
1 10 11 100 --------------------------------------------------------
~~~
~~~
Sample Input:
-5
Expected Output:
Give proper input, not zero or negative --------------------------------------------------------
~~~
~~~
Sample Input:
44
Expected Output:
Give proper input not greater than 20
~~~