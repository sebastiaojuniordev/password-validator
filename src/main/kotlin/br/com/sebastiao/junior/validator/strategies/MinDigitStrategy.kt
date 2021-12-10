package br.com.sebastiao.junior.validator.strategies

import br.com.sebastiao.junior.validator.PasswordValidator

class MinDigitStrategy(var minDigit: Int = 0) : PasswordValidator {

    override fun isValid(password: String): Boolean {
        return password.filter { it.isDigit() }.length >= this.minDigit
    }
}