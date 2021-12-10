package br.com.sebastiao.junior.validator.strategies

import br.com.sebastiao.junior.validator.PasswordValidator

class MinLengthStrategy(var minLength: Int = 0) : PasswordValidator {

    override fun isValid(password: String): Boolean {
        return password.length >= this.minLength
    }
}
