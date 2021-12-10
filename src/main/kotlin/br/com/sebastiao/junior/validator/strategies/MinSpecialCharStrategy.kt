package br.com.sebastiao.junior.validator.strategies

import br.com.sebastiao.junior.validator.PasswordValidator

class MinSpecialCharStrategy(var minChar: Int = 0, var specialChars: String = "!@#$%^&*()-+") :
    PasswordValidator {

    override fun isValid(password: String): Boolean {
        return password.filter { this.specialChars.indexOf(it) > -1 }.length >= minChar
    }
}