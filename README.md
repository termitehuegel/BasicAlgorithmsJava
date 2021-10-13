# BasicAlgorithmsJava
This repository will contain all sorts of different algorithms as a Java implementation.
## Content
### Sorting Algorithms
#### [Bubble Sort](/src/de/termitehuegel/basicAlgorithmsJava/sort/Bubblesort.java)
Bubble sort works by iterating through the array and always comparing two elements. If the element on the left is larger than they are swapped. For each iteration the largest element will end up at the end of the not sorted part. In the next iteration this part does not need to be checked.
#### [Insertions Sort](/src/de/termitehuegel/basicAlgorithmsJava/sort/Insertionsort.java)
Insertions sort works by divideing the array in two parts. The sorted part and a not sorted part. In the beginning the sorted part just contains the first element of the array. Now for every following element all elements, that are in the sorted part of the arreay and are larger get shifed right. Now the element gets inserted in the sorted part.
#### [Selection Sort](/src/de/termitehuegel/basicAlgorithmsJava/sort/Selectionsort.java)
Selection sort works by iterating trough the array and finding the smallest/largest or both element. These elements get shifted to the beginning/end of the part of the array that is to be sorted.
