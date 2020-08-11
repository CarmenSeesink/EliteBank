import java.lang.Exception

// Derived class
class Cheque(type: String, balance: Int, val name : String, val transactionFee : Int, val freeTransactions : Int): Account(type, balance) {
    fun addTransactionFee() {

    }
}
