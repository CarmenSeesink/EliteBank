class Bank {
    val name = "Elite Bank"
    val clients = mutableListOf<Client>()
    val accounts = mutableListOf<Account>()

    // Clients
    fun getClients(): String {
        return clients.size.toString()
    }

    fun addClient(name: String, id: Int) {
        var int = clients.size
        clients.add(Client(name,id))
    }

    fun getClientName(): String {
        return clients[0].getClientName()
    }

    // Accounts
    fun getAccounts(): String {
        return accounts.size.toString()
    }

    fun addAccount(type: String, balance: Int) {
        accounts.add(Account(type, balance))
    }

    fun listAccounts() {
        println("Accounts: ")
        accounts.forEach(){
            println(it.type + " " + " R" + it.balance)
        }
    }
}
