package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        val b = intArrayOf()
        var i = 1
//        var c = 1
        if (!b.contentEquals(sadArray)) {
            println("success")
            println(sadArray[0])
//            b[0] = sadArray[0]
            while (i <= sadArray.size) {
                if ((sadArray[i + 1] + sadArray[i - 1]) > sadArray[i]) {
//                    b[c] = sadArray[i]
                    print(sadArray[i])
                    i++
////                    c++
                }
//
            }

        }

//        b.forEach(::print)
        return b
//        throw NotImplementedError("Not implemented")
    }

}
