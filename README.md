# Kotlin Null List Map Bug

This repository demonstrates an uncommon behavior in Kotlin when using the `map()` function with potentially null lists.  The `map()` function, when applied to a null list, returns null instead of an empty list. This behavior can be unexpected and lead to NullPointerExceptions if not carefully addressed.

The `NullListMapBug.kt` file shows the issue, while `NullListMapSolution.kt` provides a solution to handle null lists gracefully.

## Solution
The solution involves using the safe call operator (`?.`) along with the elvis operator (`?:`) to provide a default empty list when the list is null.