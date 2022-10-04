package com.example.myfirstkotlin

data class User(var firstName: String?, var lastName: String? = null)

val user1 = User("Jane", "Doe")
val user2 = User("Jane", "Doe")
val structurallyEqual = user1 == user2 // true
val referentiallyEqual = user1 === user2 // false

val jane = User("Jane")
val joe = User("Joe", "Doe")