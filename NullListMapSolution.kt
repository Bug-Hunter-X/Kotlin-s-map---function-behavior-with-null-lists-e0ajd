fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val emptyList = emptyList<Int>()
    val emptyResult = emptyList.map { it * 2 }
    println(emptyResult) // Output: []

    val nullList: List<Int?>? = null
    val safeResult = nullList?.map { it * 2 } ?: emptyList<Int>() //Handles null case
    println(safeResult) // Output: []
    
    val nullListWithNulls = listOf<Int?>(1, null, 3)
    val safeResultWithNulls = nullListWithNulls.map { it?.times(2) ?: 0} //Handles nulls within the list
    println(safeResultWithNulls) // Output: [2, 0, 6] 
} 