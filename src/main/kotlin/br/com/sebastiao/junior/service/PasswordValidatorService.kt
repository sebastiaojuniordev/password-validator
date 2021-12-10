package br.com.sebastiao.junior.service

interface PasswordValidatorService {
    fun validatePassword(password: String): Boolean
}