package com.example.introductiontokotlin.repository

import com.example.introductiontokotlin.model.User

object RepositoryKotlin {

    private val _users = mutableListOf<User>()
    val users: List<User>
        get() = _users

    val formattedUserNames: List<String>
        get() {
            return _users.map { user ->
                if (user.lastName != null) {
                    if (user.firstName != null) {
                        "${user.firstName} ${user.lastName}"
                    } else {
                        user.lastName ?: "Unknown"
                    }
                }  else {
                    user.firstName ?: "Unknown"
                }
            }
        }

    init {
        val user1 = User("Jane", "")
        val user2 = User("John", null)
        val user3 = User("Anne", "Doe")

        _users.add(user1)
        _users.add(user2)
        _users.add(user3)
    }
}