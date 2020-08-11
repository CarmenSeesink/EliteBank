
data class Client(var name: String, val id: Int) {
    private var accounts = mutableListOf<Account>()

    fun changeName(string: String) {
        name = string
    }

    fun getClientName(): String {
        return name
    }

//    fun getType(): String{
//        val typeName = when(type){
//            1 -> "Student"
//            2 -> "Admin"
//            3 -> "Lecturer"
//            else -> ""
//        }
//
//        return type.toString()
//    }
//
//    fun getMoneyAmount(): Float{
//        return money
//    }
//
    fun addAccount(){

    }
}


