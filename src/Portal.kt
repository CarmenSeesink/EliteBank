fun gold() = Account("Gold", 300 )
fun diamond() = Account("Diamond", 300 )

fun main() {
//    val availableClients = listOf(Client("James", 569, listOf(gold(), diamond())), Client("James", 569, listOf(gold(), diamond())))
    println("Choose a client name")
//    printClient(availableClients)
//    client@while (true) {
//        var clientChosen = readLine().toString()
//        when(clientChosen){
//            "1" -> {
//                Client("James", 569, listOf(gold(), diamond()))
//                break@client
//            }
//            "2" -> {
//                Client("James", 569, listOf(gold(), diamond()))
//                break@client
//            }
//            in listOf("q", "quite", "exit") -> {
//                println("quiting game!")
//                break@client
//            }
//            else -> {
//                println("There is no such client")
//                println("Please choose again")
//                printClient(availableClients)
//                continue@client
//            }
//        }
//    }
}
//
//fun printClient(clients: List<Client>){
//    for((index, client) in clients.withIndex()) println("${index} -> ${client}")
//}