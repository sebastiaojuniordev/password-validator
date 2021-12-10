package br.com.sebastiao.junior.validator.strategies

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MinLowercaseLetterStrategyTest {

    @Test
    fun shouldReturnFalseIfPasswordDoesNotContainLowercaseLetters() {
        val strategy = MinLowercaseLetterStrategy(1)
        val valueToTest = "UPPERCASE"
        assertFalse(strategy.isValid(valueToTest))
    }

    @Test
    fun shouldReturnTrueIfPasswordContainsMoreThanRequiredLowercaseLetters() {
        val strategy = MinLowercaseLetterStrategy(2)
        val valueToTest = "password"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun shouldReturnTrueIfPasswordLowercaseLettersIsEqualsTheRequired() {
        val strategy = MinLowercaseLetterStrategy(4)
        val valueToTest = "test"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun shouldReturnTrueIfPasswordLowercaseLettersAreMergedWithUppercase() {
        val strategy = MinLowercaseLetterStrategy(2)
        val valueToTest = "TOtest"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return the min lowercase letters`() {
        val strategy = MinLowercaseLetterStrategy(8)
        var expected = 8
        assertEquals(expected, strategy.minLetters)
    }

    @Test
    fun `Should add the min lowercase letters`() {
        val strategy = MinLowercaseLetterStrategy()
        strategy.minLetters = 10
        var expected = 10
        assertEquals(expected, strategy.minLetters)
    }
}

