# 2 [Sorting](https://algs4.cs.princeton.edu/20sorting/)

## Overview

Sorting is the process of rearranging a sequence of objects so as to put them in some logical order. Sorting plays a major role in commercial data processing and in modern scientific computing. Applications abound in transaction processing, combinatorial optimization, astrophysics, molecular dynamics, linguistics, genomics, weather prediction, and many other fields.

In this chapter, we consider several classical sorting methods and an efficient implementation of a fundamental data type known as the priority queue. We discuss the theoretical basis for comparing sorting algorithms and conclude the chapter with a survey of applications of sorting and priority-queue algorithms. 

- 2.1 [Elementary Sorts](2.1%20Elementary%20Sorts) introduces selection sort, insertion sort, and shellsort.
- 2.2 [Mergesort](2.2%20Mergesort) describes megesort, a sorting algorithm that is guaranteed to run in linearithmic time.
- 2.3 [Quicksort](2.3%20Quicksort) describes quicksort, which is used more widely than any other sorting algorithm.
- 2.4 [Priority Queues](2.4%20Priority%20Queues) introduces the priority queue data type and an efficient implementation using a binary heap. It also introdues heapsort.
- 2.5 [Applications]() describes applications of sorting, including using alternate orderings, selection, the system sort, and stability. 

## Programs

|Status|Program|Description|
|:----:|:-----:|:---------:|
|✅|[Insertion.java](2.1%20Elementary%20Sorts/Insertion.java)|insertion sort|
|✅|[InsertionX.java](2.1%20Elementary%20Sorts/InsertionX.java)|insertion sort(optimized)|
|➖|BinaryInsertion.java|binary insertion sort|
|✅|[Selection.java](2.1%20Elementary%20Sorts/Selection.java)|selection sort|
|✅|[Shell.java](2.1%20Elementary%20Sorts/Shell.java)|shell sort|
|✅|[Merge.java](2.2%20Mergesort/Merge.java)|top-down merge sort|
|✅|[MergeBU.java](2.2%20Mergesort/MergeBU.java)|bottom-up merge sort|
|✅|[MergeX.java](2.2%20Mergesort/MergeX.java)|optimized merge sort|
|✅|[Inversions.java](2.2%20Mergesort/Inversions.java)|number of inversions|
|✅|[Quick.java](2.3%20Quicksort/Quick.java)|quick sort|
|➖|Quick3way.java|quick sort with 3-way partitioning|
|➖|QuickX.java|optimized 2-way quick sort|
|➖|QuickBentleyMcIlroy.java|optimized 3-way quick sort|
|➖|TopM.java|priority queue client|
|➖|MaxPQ.java|max heap priority queue|
|➖|MinPQ.java|min heap priority queue|
|➖|IndexMinPQ.java|index min heap priority queue|
|➖|IndexMaxPQ.java|index max heap priority queue|
|➖|Multiway.java|multi way merge|
|➖|Heap.java|heap sort|
