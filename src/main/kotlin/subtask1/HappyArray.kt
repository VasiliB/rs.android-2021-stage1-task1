package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var i: Int
        var c: Int
        var b = intArrayOf()
        lateinit var d: IntArray
        if (b.contentEquals(sadArray)) {
            return b
        } else {  // Ready
            b = sadArray
            b[0] = sadArray[0]
            i = 1
            c = 1
            while (i < sadArray.size - 1) {
                if (((sadArray[i + 1] + sadArray[i - 1])) > sadArray[i]) {
                    b[c] = sadArray[i]
                    c++
                }
                i++
            }
            b[c] = sadArray[sadArray.size - 1]
            d = IntArray(c + 1)
            i = 0
            while (i <= c) {
                d[i] = b[i]
                i++
            }
            d.forEach(System.out::print)
// Second step
            c = 0
            b = d
            b[0] = d[0]
            println(b[c])
            i = 1
            c = 1
            while (i < d.size - 1) {
                if (((d[i + 1] + d[i - 1])) > d[i]) {
                    b[c] = d[i]
                    println(b[c])
                    c++
                }
                i++
            }
            b[c] = d[d.size - 1]
            println(b[c])
            d = IntArray(c + 1)
            i = 0
            while (i <= c) {
                d[i] = b[i]
                i++
            }
//          Third  step
            c = 0
            b = d
            b[0] = d[0]
            println(b[c])
            i = 1
            c = 1
            while (i < d.size - 1) {
                if (((d[i + 1] + d[i - 1])) > d[i]) {
                    b[c] = d[i]
                    println(b[c])
                    c++
                }
                i++
            }
            b[c] = d[d.size - 1]
            println(b[c])
            d = IntArray(c + 1)
            i = 0
            while (i <= c) {
                d[i] = b[i]
                i++
            }
        }
        d.forEach(System.out::print)
        return d

    }
}
//
//fun convertToHappy(sadArray: IntArray): IntArray {
//    return if (sadArray.isEmpty()) {
//        sadArray
//    } else {
//        return if (ifArrayHappy(sadArray)) {
//            sadArray
//        } else {
//            convert(sadArray)
//        }
//    }
//}
//
//private fun ifArrayHappy(array: IntArray) : Boolean {
//    array.forEachIndexed { index, element  ->
//        if (index != 0  && index != array.lastIndex) {
//            val isHappy = isElementHappy(element, array[index -1], array[index +1])
//            if (!isHappy) return false
//        }
//    }
//    return true
//}
//
//fun convert(sadArray: IntArray): IntArray {
//    var result = sadArrayConvert(sadArray)
//    var happy = result.happy
//    return if (happy) {
//        result.array
//    } else {
//        while (!happy) {
//            result = sadArrayConvert(result.array)
//            happy = result.happy
//        }
//        result.array
//    }
//}
//
//private fun isElementHappy (element: Int, previous: Int, next:Int): Boolean {
//    return previous + next > element
//}
//
//class Result(var array:IntArray, var happy: Boolean)
//
//private fun sadArrayConvert(sadArray: IntArray) : Result {
//    val happyList = mutableListOf<Int>()
//    val sadList = sadArray.toMutableList()
//
//    sadArray.forEachIndexed { index, element->
//        if (index == 0 ) {
//            happyList.add(sadArray[0])
//        }
//        if (index != 0 && index != sadArray.lastIndex) {
//            if (isElementHappy(element, sadArray[index -1], sadArray[index +1])) {
//                happyList.add(element)
//            } else {
//                sadList.remove(element)
//                return Result(sadList.toIntArray(), false)
//            }
//        }
//        if (index == sadArray.lastIndex) {
//            happyList.add(sadArray[sadArray.lastIndex])
//        }
//
//    }
//    return Result(happyList.toIntArray(), true)
//}