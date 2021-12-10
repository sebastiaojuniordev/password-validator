package br.com.sebastiao.junior.web.controller

import br.com.sebastiao.junior.web.dto.PasswordValidationInput
import br.com.sebastiao.junior.web.dto.PasswordValidationOutput
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

@MicronautTest
internal class PasswordValidatorControllerTest(
    @Inject
    @Client("/")
    val client: HttpClient
) {

    @Test
    fun `Should return true on valid password`() {
        val body = PasswordValidationInput("AbTp9!fok")
        val request = HttpRequest.POST("/password-validator/validate", body)
        val response: HttpResponse<PasswordValidationOutput> = client.toBlocking().exchange(request)
        assertEquals(200, response.status.code)
    }

    @Test
    fun `Should return false on invalid password`() {
        val body = PasswordValidationInput("a1N)")
        val request = HttpRequest.POST("/password-validator/validate", body)
        val response: HttpResponse<PasswordValidationOutput> = client.toBlocking().exchange(request)
        assertEquals(200, response.status.code)
    }

    @Test
    fun `Should return false on null password`() {
        val body = PasswordValidationInput(null)
        val request = HttpRequest.POST("/password-validator/validate", body)
        val response: HttpResponse<PasswordValidationOutput> = client.toBlocking().exchange(request)
        assertEquals(200, response.status.code)
    }
}