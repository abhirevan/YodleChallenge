Problem statement: http://www.yodlecareers.com/puzzles/triangle.html

In the Triangle puzzle I am storing the input numbers in a single array of length as (Row * (Row+1)/2). Using the row number and the current index we can find the indices of the children from the parent and vice versa.
Thus the space complexity is O(n) where n is the number of elements.

For solving the puzzle, consider smallest triangles made with 2 consecutive elements of the last row and adding the maximum element to the parent element on the previous node. We solve this iteratively untill we only have the element in the first row.
As we consider each element atmost 2 times, the time complexity is O(n).