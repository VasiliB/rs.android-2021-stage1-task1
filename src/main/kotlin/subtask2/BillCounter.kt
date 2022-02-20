package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        lateinit var result: String
        val fullBill = bill.sum()
        val annaToPay = (fullBill - bill[k]) / 2
        if (annaToPay == b) {
            result = "bon appetit"
        } else {
            result = (b-annaToPay).toString()
        }
        println(fullBill)
        println(annaToPay)
        println(bill[k])
        println(b)
        return result
    }
}
