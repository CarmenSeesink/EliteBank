// Super class
open class Account(val type : String, val balance : Int) {
//    var holder = Client()
    open fun deposit() {
        println("Deposit")
    }

    open fun withdraw() {
        println("Withdraw")
    }

    open fun closeOff() {
        println("Withdraw")
    }
}