package br.com.sebastiao.junior.validator.strategies

import br.com.sebastiao.junior.validator.PasswordValidator

class MinUppercaseLetterStrategy(var minLetters: Int = 0) : PasswordValidator {

    override fun isValid(password: String): Boolean {
        return password.filter { it.isUpperCase() }.length >= minLetters
    }
}