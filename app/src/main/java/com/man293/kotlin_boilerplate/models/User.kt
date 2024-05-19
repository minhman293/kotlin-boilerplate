package com.man293.kotlin_boilerplate.models

class User {
    private var name : String = ""
    private var email : String = ""
    private var password : String = ""

    constructor(name: String, email: String, password: String) {
        this.name = name
        this.email = email
        this.password = password
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getName() : String {
        return this.name
    }

    fun setEmail(email: String) {
        this.email = email
    }

    fun getEmail() : String {
        return this.email
    }

    fun setPassword(password: String) {
        this.password = password
    }

    fun getPassword() : String {
        return this.password
    }
}