data class Client(var name: String, val id: Int) {
    private var accounts = mutableListOf<Account>()

    fun changeName(string: String) {
        name = string
    }

    fun getClientName(): String {
        return name
    }

    fun addAccount(){
    }
}


