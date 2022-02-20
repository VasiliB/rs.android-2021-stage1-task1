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
