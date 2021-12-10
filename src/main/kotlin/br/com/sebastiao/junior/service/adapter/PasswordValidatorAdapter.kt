package br.com.sebastiao.junior.service.adapter

import br.com.sebastiao.junior.service.PasswordValidatorService
import br.com.sebastiao.junior.validator.PasswordValidator
import br.com.sebastiao.junior.validator.strategies.*
import jakarta.inject.Singleton
import kotlinx.collections.immutable.persistentListOf

@Singleton
class PasswordValidatorAdapter : PasswordValidatorService {

    private val validationStrategies: List<PasswordValidator>

    init {
        this.validationStrategies = persistentListOf(
            BlankCharStrategy(),
            MinLengthStrategy(9),
            MinDigitStrategy(1),
            MinLowercaseLetterStrategy(1),
            MinUppercaseLetterStrategy(1),
            MinSpecialCharStrategy(1),
            RepeatedCharStrategy()
        )
    }

    override fun validatePassword(password: String): Boolean {

        var passwordIsValid = false

        for (validationStrategy in this.validationStrategies) {

            passwordIsValid = validationStrategy.isValid(password)

            if (!passwordIsValid) {
                break
            }
        }

        return passwordIsValid
    }
}