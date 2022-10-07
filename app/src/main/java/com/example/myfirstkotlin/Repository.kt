import java.util.ArrayList

object Repository  {

    private var users: MutableList<User>? = null
    fun getUsers(): List<User>? {
        return users
    }

    // keeping the constructor private to enforce the usage of getInstance
    init {
        val user1 = User("Jane", "")
        val user2 = User("John", null)
        val user3 = User("Anne", "Doe")
        users = ArrayList<Any?>()
        users.add(user1)
        users.add(user2)
        users.add(user3)
    }

    val formattedUserNames: List<String>
        get() {
            val userNames: MutableList<String> =
                ArrayList(users!!.size)
            for (user in users) {
                var name: String
                name = if (user.getLastName() != null) {
                    if (user.getFirstName() != null) {
                        user.getFirstName() + " " + user.getLastName()
                    } else {
                        user.getLastName()
                    }
                } else if (user.getFirstName() != null) {
                    user.getFirstName()
                } else {
                    "Unknown"
                }
                userNames.add(name)
            }
            return userNames
        }
    // keeping the constructor private to enforce the usage of getInstance
    init {
        val user1 = User("Jane", "")
        val user2 = User("John", null)
        val user3 = User("Anne", "Doe")
        users = ArrayList<Any?>()
        users.add(user1)
        users.add(user2)
        users.add(user3)
    }


}

val formattedUserNames = Repository.formattedUserNames