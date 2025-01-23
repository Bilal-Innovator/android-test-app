package com.android.test

object RegistrationUtil {

    private val existingUsers = listOf("bilal","naman","naveed")

    /***
     * The input is not valid if..
     * ..the username/password is empty
     * ..the username is already exists
     *..the confirm password is not equal to new password
     * ..the password contains less then 2 digits
     */

    fun validateRegistrationInput(
        userName:String,
        password:String,
        confirmPassword:String
    ):Boolean {

        if (userName.isEmpty() || password.isEmpty()){
            return false
        }

        if (userName in existingUsers ) {
            return false
        }

        if (password != confirmPassword ) {
            return false
        }

        if (password.count { it.isDigit() } <2 ) {
            return false
        }

        return true

    }
}