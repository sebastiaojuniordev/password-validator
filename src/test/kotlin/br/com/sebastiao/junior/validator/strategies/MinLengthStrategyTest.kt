package br.com.sebastiao.junior.validator.strategies

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MinLengthStrategyTest {

    @Test
    fun `Should return false if password does not match minimum required length`() {
        val strategy = MinLengthStrategy(2)
        val valueToTest = "a"
        assertFalse(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return true if password length is greater than the required`() {
        val strategy = MinLengthStrategy(5)
        val valueToTest = "password"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return true if password length is equals required`() {
        val strategy = MinLengthStrategy(3)
        val valueToTest = "abc"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return the min length`() {
        val strategy = MinLengthStrategy(8)
        var expected = 8
        assertEquals(expected, strategy.minLength)
    }

    @Test
    fun `Should add the min length`() {
        val strategy = MinLengthStrategy()
        strategy.minLength = 10
        var expected = 10
        assertEquals(expected, strategy.minLength)
    }
}