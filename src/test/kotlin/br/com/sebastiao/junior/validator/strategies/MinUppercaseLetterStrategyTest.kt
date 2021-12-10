package br.com.sebastiao.junior.validator.strategies

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MinUppercaseLetterStrategyTest {

    @Test
    fun `Should return false if password does not contains uppercase letters`() {
        val strategy = MinUppercaseLetterStrategy(1)
        val valueToTest = "only lowercase"
        assertFalse(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return true if password contains more than required uppercase letters`() {
        val strategy = MinUppercaseLetterStrategy(2)
        val valueToTest = "OK UPPERCASE LETTERS"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return true if password uppercase letters is equals the required`() {
        val strategy = MinUppercaseLetterStrategy(4)
        val valueToTest = "FIVE"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return true if password uppercase letters are merged with lowercase`() {
        val strategy = MinUppercaseLetterStrategy(3)
        val valueToTest = "testUPPERCASE"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return the min lowercase letters`() {
        val strategy = MinUppercaseLetterStrategy(11)
        var expected = 11
        assertEquals(expected, strategy.minLetters)
    }

    @Test
    fun `Should add the min lowercase letters`() {
        val strategy = MinUppercaseLetterStrategy()
        strategy.minLetters = 12
        var expected = 12
        assertEquals(expected, strategy.minLetters)
    }
}