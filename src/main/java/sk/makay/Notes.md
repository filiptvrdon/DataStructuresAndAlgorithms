# Algorithms

## Stable vs. Unstable sort

- stable sort preserves the relative order of duplicate items (i.e. items that are evaluated as equivalent in the
  sorting process)
- can make a difference when sorting objects
- bubble sort is stable

## Bubble Sort

- two loops -> quadratic O(n2)
- stable
- can be upgraded by Shell sort

## Selection Sort

- two loops -> quadratic O(n2)
- usually a bit better performance than bubble sort due to less swapping taking place
- unstable

## Insertion Sort

- two loops -> quadratic O(n2)
- stable

## Shell Sort

- upgrade over insertion sort
- starts with "gap" (e.g. array.length / 2)
- does preliminary sorting, decreases the gap until 1, then performs insert sort over semi-sorted array in the final
  iteration
- unstable

# Recursive Sorts

## Merge Sort

- divide & conquer algorithm
- recursive
- splits into multiple smaller array that are sorted during the merging phase
- splitting is logical, no new arrays are created
- merging uses temporary arrays
-

## Quick Sort

- divide & conquer algorithm
- recursive
- uses a pivot element to partition the array into 2 parts
    - smaller elements go to the left
    - greater elements go to the right
    - repeat until 1-element arrays
- in-place
- O(nlogn) base 2, worst case O(n2)
- unstable

## Counting Sort

- not in-place
- O(n) -> making assumptions about the data
- works best when range of values is about the same as the number of elements
- can be made stable with some extra steps
 

