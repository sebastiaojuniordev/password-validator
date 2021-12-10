package br.com.sebastiao.junior.validator.strategies

import br.com.sebastiao.junior.validator.PasswordValidator

class BlankCharStrategy : PasswordValidator {

    override fun isValid(password: String): Boolean {
        return password.contains(" ").not()
    }
}