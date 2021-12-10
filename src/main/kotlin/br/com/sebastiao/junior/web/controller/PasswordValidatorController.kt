package br.com.sebastiao.junior.web.controller

import br.com.sebastiao.junior.web.dto.PasswordValidationInput
import br.com.sebastiao.junior.web.dto.PasswordValidationOutput
import br.com.sebastiao.junior.service.PasswordValidatorService
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.HttpResponse
import jakarta.inject.Inject

@Controller("/password-validator")
class PasswordValidatorController(
    @Inject
    private val passwordValidatorService: PasswordValidatorService
) {

    @Post("/validate")
    fun validatePassword(@Body passwordInput: PasswordValidationInput): HttpResponse<PasswordValidationOutput> {
        val isValid = passwordInput.password?.let { passwordValidatorService.validatePassword(it) } ?: false
        return HttpResponse.ok(PasswordValidationOutput(isValid))
    }
}