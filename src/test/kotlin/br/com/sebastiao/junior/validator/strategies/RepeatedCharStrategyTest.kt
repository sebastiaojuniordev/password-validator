package br.com.sebastiao.junior.validator.strategies

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class RepeatedCharStrategyTest {

    @Test
    fun `Should return true if password does not contains repeated chars`() {
        val strategy = RepeatedCharStrategy()
        val valueToTest = "abcdfg"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return false if password contains repeated chars`() {
        val strategy = RepeatedCharStrategy()
        val valueToTest = "success"
        assertFalse(strategy.isValid(valueToTest))
    }
}
