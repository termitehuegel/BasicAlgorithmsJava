# BasicAlgorithmsJava
This repository will contain all sorts of different algorithms as a Java implementation.
## Content
### Sorting Algorithms
#### [Bubble Sort](/src/de/termitehuegel/basicAlgorithmsJava/sort/Bubblesort.java)
Bubble sort works by iterating through the array and always comparing two elements. If the element on the left is larger than they are swapped. For each iteration the largest element will end up at the end of the not sorted part. In the next iteration this part does not need to be checked.
#### [Insertions Sort](/src/de/termitehuegel/basicAlgorithmsJava/sort/Insertionsort.java)
Insertions sort works by dividing the array in two parts. The sorted part and a not sorted part. In the beginning the sorted part just contains the first element of the array. Now for every following element all elements, that are in the sorted part of the array and are larger get shifted right. Now the element gets inserted in the sorted part.
#### [Selection Sort](/src/de/termitehuegel/basicAlgorithmsJava/sort/Selectionsort.java)
Selection sort works by iterating through the array and finding the smallest/largest or both element. These elements get shifted to the beginning/end of the part of the array that is to be sorted.
#### [Parallel Quick Sort](/src/de/termitehuegel/basicAlgorithmsJava/sort/ParallelQuicksort.java)
Parallel quick sort is a implementation of quick sort that relies on multithreading. Each recursive call of quick sort thereby opens a new Thread.
#### [Quick Sort](/src/de/termitehuegel/basicAlgorithmsJava/sort/Quicksort.java)
Quick sort use the divide and conquer approach. The Array is split in two: The elements smaller than the pivot and the elements larger than the pivot. These array parts are sorted again in a recursive style. If an array is empty or only contains one element it is already sorted.
