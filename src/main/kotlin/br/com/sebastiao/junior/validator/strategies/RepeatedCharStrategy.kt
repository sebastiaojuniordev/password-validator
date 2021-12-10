package br.com.sebastiao.junior.validator.strategies

import br.com.sebastiao.junior.validator.PasswordValidator

class RepeatedCharStrategy : PasswordValidator {

    override fun isValid(password: String): Boolean {
        return password.lowercase()
            .groupingBy { it }
            .eachCount()
            .filter { it.value > 1 }
            .values
            .isEmpty()
    }
}