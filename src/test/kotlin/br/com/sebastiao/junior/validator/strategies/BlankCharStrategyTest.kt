package br.com.sebastiao.junior.validator.strategies

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BlankCharStrategyTest {

    @Test
    fun `Should return false if password contains spaces`() {
        val strategy = BlankCharStrategy()
        val valueToTest = "Password With Space "
        assertFalse(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return true if password do not contains spaces`() {
        val strategy = BlankCharStrategy()
        val valueToTest = "Password"
        assertTrue(strategy.isValid(valueToTest))
    }
}
