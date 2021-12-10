package br.com.sebastiao.junior.validator.strategies

import br.com.sebastiao.junior.validator.PasswordValidator

class MinLowercaseLetterStrategy(var minLetters: Int = 0) : PasswordValidator {

    override fun isValid(password: String): Boolean {
        return password.filter { it.isLowerCase() }.length >= minLetters
    }
}