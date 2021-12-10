package br.com.sebastiao.junior.validator

interface PasswordValidator {

    fun isValid(password: String): Boolean;
}