package br.com.sebastiao.junior.validator.strategies

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MinDigitStrategyTest {

    @Test
    fun `Should return false if password does not contains digits`() {
        val strategy = MinDigitStrategy(1)
        val valueToTest = "PasswordWithoutDigit"
        assertFalse(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return true if password digits are equal to required`() {
        val strategy = MinDigitStrategy(1)
        val valueToTest = "Password1"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return false if password does not contains the required digits`() {
        val strategy = MinDigitStrategy(2)
        val valueToTest = "Password2"
        assertFalse(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return the min digits`() {
        val strategy = MinDigitStrategy(8)
        val expected = 8
        assertEquals(expected, strategy.minDigit)
    }

    @Test
    fun `Should add the min digits`() {
        val strategy = MinDigitStrategy()
        strategy.minDigit = 10
        val expected = 10
        assertEquals(expected, strategy.minDigit)
    }
}