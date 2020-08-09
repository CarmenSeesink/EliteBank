fun main() {
    val name = "Elite Bank"
    val availableClients = listOf("Bill", "Sam", "Will", "Pieter")
    val availableAccounts = listOf("Gold Cheque", "Diamond Cheque", "Tax Free Savings", "Easy Access Savings")
    println("Enter client name")
//    printClients(availableClients)
    printAccounts(availableAccounts)

    accounts@while (true) {
        var accountChosen = readLine().toString()
        when(accountChosen){
            "0" -> {
                Cheque()
                break@accounts
            }
            "1" -> {
                Savings()
                break@accounts
            }
            else -> {
                println("Sorry don't seem to have that account")
                println("Please choose again")
                printAccounts(availableAccounts)
                continue@accounts
            }
        }
    }
}

fun printAccounts(accounts: List<String>){
    for((index, account) in accounts.withIndex()) println("${index} -> ${account}")
}



