# BasicAlgorithmsJava
This repository will contain all sorts of different algorithms as a Java implementation.
## Content
### Binary
#### [Hamming Weight](/src/de/termitehuegel/basicAlgorithmsJava/binary/HammingWeight.java)
The hamming weight is the number of set bits (bits set to `1`) in a String of bits represented in an `int`. The method `getHammingWeight(int x)` calculates the hamming weight of `x`. The class also contains the `getHammingDistance(int x, int y)` that calculates the number of bits that are different in `x` and `y`.
### Math
#### [Advanced Euclidean Algorithm](/src/de/termitehuegel/basicAlgorithmsJava/math/numberTheory/AdvancedEuclideanAlgorithm.java)
The advanced euclidean algorithm is used to solve diophantine equations of the following form: `s*a+t*b=ggT(a, b)` with known `a` and `b`. The algorithm like the euclidean algorithm but at the end each row is solved for t with s being the t from the next row. The last row has the form `a=ggT(a, b)`, `b=0`, `s=1`, `t=0`.
#### [Euclidean Algorithm](/src/de/termitehuegel/basicAlgorithmsJava/math/numberTheory/EuclideanAlgorithm.java)
The euclidean Algorithm is used to calculate the largest common divisor of `a` and `b`. a and b therefore need to be positive integers. The functionality of the euclidean algorithm is very simple. If `b` is 0 than `a` is the largest common divisor. Else the largest common divisor is the same as the largest common divisor of `b` and `a` modulo `b`. This largest common divisor can be calculated with the euclidean algorithm.
#### [Power](/src/de/termitehuegel/basicAlgorithmsJava/math/basic/Power.java)
Power iteratively calculates the powers.
#### [Square Root](/src/de/termitehuegel/basicAlgorithmsJava/math/basic/SquareRoot.java)
This implementation of the square root approximates the square root of `a` with the newton approximation. The function `f(x)=x^2-a` is `0` when `x=a^(1/2)`. Therefore `a^(1/2)` can be approximated with `x_n+1 = x_n - ((x_n)^2-a) / (2x_n)`. For higher `n` `x_n` will approximate `a^(1/2)`.
##### [Vector](/src/de/termitehuegel/basicAlgorithmsJava/math/geometry/Vector.java)
Vectors are used to describe a displacement in space. A vector allows for all kinds of operations.
### Search Algorithms
#### [Binary Search](/src/de/termitehuegel/basicAlgorithmsJava/array/search/BinarySearch.java)
The binary search algorithm searches through a sorted array. Begin by comparing the element in the middle with the element that is searched. If the element is larger repeat for that part. If the element is smaller thant repeat for the smaller part.
#### [Sequential Search](/src/de/termitehuegel/basicAlgorithmsJava/array/search/SequentialSearch.java)
Iterate through the array and return if the element is found. If the element isn't found return -1.
### Sorting Algorithms
#### [Bubble Sort](/src/de/termitehuegel/basicAlgorithmsJava/array/sort/Bubblesort.java)
Bubble sort works by iterating through the array and always comparing two elements. If the element on the left is larger than they are swapped. For each iteration the largest element will end up at the end of the not sorted part. In the next iteration this part does not need to be checked.
#### [Counting Sort](/src/de/termitehuegel/basicAlgorithmsJava/array/sort/Countingsort.java)
Counting sort is used to sort an int array. It is known that all numbers in the int array are element of an interval which is limited by `lowerBound` and `upperBound`. The algorithm counts the frequency of every element and builds a new array which is sorted.
#### [Heap Sort](/src/de/termitehuegel/basicAlgorithmsJava/array/sort/Heapsort.java)
The heap sort algorithm makes use of the heap data structure. Out of the array a max-heap is generated. Then the root of the heap is swapped with the last element of the array. This last element is now a part of the sorted part of the array. This procedure is repeated for every element in the array.
#### [Insertions Sort](/src/de/termitehuegel/basicAlgorithmsJava/array/sort/Insertionsort.java)
Insertions sort works by dividing the array in two parts. The sorted part and a not sorted part. In the beginning the sorted part just contains the first element of the array. Now for every following element all elements, that are in the sorted part of the array and are larger get shifted right. Now the element gets inserted in the sorted part.
#### [Merge Sort](/src/de/termitehuegel/basicAlgorithmsJava/array/sort/Mergesort.java)
Merge sort works by dividing and conquering. Firstly the array is split in two. The left and the right side are now sorted recursively. An array with less than two elements is already sorted. The two sorted sub-arrays are then merged. In this process the first elements of the array are compared against each other. The smaller element gets added to the result array and removed from the sub-array. This process is repeated until both sub-arrays are empty. This result-array itself will then be merged with a corresponding array. This is repeated until all sub-arrays are merged into one array.
#### [Radix Sort](/src/de/termitehuegel/basicAlgorithmsJava/array/sort/Radixsort.java)
Sorts int arrays by using counting sort. It starts by sorting the array by the first digit. Then it repeats this with the second, third, ... digit.
#### [Selection Sort](/src/de/termitehuegel/basicAlgorithmsJava/array/sort/Selectionsort.java)
Selection sort works by iterating through the array and finding the smallest/largest or both element. These elements get shifted to the beginning/end of the part of the array that is to be sorted.
#### [Swap Sort](/src/de/termitehuegel/basicAlgorithmsJava/array/sort/Swapsort.java)
Swapsort swaps every element with its position. Its position is determined by counting the elements that are smaller. Swap sort thereby only works for arrays without duplicates.
#### [Tree Sort](/src/de/termitehuegel/basicAlgorithmsJava/array/sort/BinaryTreeSort.java)
Binary tree sort works by utilising the binary tree structure. Every node has a value and two children. From a root sort all elements as following: Elements smaller than the element are left children an elements that are larger are right children. By starting from the rightmost child and ending at the leftmost child the elements can be read out as sorted.
#### [Parallel Quick Sort](/src/de/termitehuegel/basicAlgorithmsJava/array/sort/ParallelQuicksort.java)
Parallel quick sort is an implementation of quick sort that relies on multithreading. Each recursive call of quick sort thereby opens a new Thread.
#### [Quick Sort](/src/de/termitehuegel/basicAlgorithmsJava/array/sort/Quicksort.java)
Quick sort use the divide and conquer approach. The Array is split in two: The elements smaller than the pivot and the elements larger than the pivot. These array parts are sorted again in a recursive style. If an array is empty or only contains one element it is already sorted.