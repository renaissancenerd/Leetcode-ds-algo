class ArrayStructures {
    private val theArray = IntArray(50)
    private var arraySize = 10

    fun generateRandomArray() {
        for (i in 0 until arraySize) {
            theArray[i] = (Math.random() * 10).toInt() + 10
        }
    }

    // Prints the Array on the screen in a grid
    fun printArray() {
        println("----------")

        for (i in 0 until arraySize) {
            print("| $i | ")

            println(theArray[i].toString() + " |")

            println("----------")
        }
    }

    // gets value at index
    fun getValueAtIndex(index: Int): Int {
        if (index < arraySize) return theArray[index]
        return 0
    }

    // Returns true or false if a value is in the Array
    fun doesArrayContainThisValue(searchValue: Int): Boolean {
        var valueInArray = false
        for (i in 0 until arraySize) {
            if (theArray[i] == searchValue) {
                valueInArray = true
            }
        }
        return valueInArray
    }

    // to delete a value from the array
    fun deleteIndex(index: Int) {
        if (index < arraySize) {
            for (i in 0 until (arraySize - 1)) {
                theArray[i] = theArray[i + 1]
            }
            arraySize--
        }
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val newArray = ArrayStructures()
            newArray.generateRandomArray()
            newArray.printArray()
            println(newArray.getValueAtIndex((3)))
            newArray.deleteIndex(4)
            newArray.printArray()
        }
    }
}
