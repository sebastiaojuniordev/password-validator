package br.com.sebastiao.junior.validator.strategies

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MinSpecialCharStrategyTest {

    @Test
    fun `Should return true if password contains exclamation char`() {
        val strategy = MinSpecialCharStrategy(1)
        val valueToTest = "Password!Test"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return false if password does not contains amount of exclamation char`() {
        val strategy = MinSpecialCharStrategy(2)
        val valueToTest = "Password!Test"
        assertFalse(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return true if password contains At char`() {
        val strategy = MinSpecialCharStrategy(1)
        val valueToTest = "Password@Test"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return false if password does not contains amount of At char`() {
        val strategy = MinSpecialCharStrategy(2)
        val valueToTest = "Password@Test"
        assertFalse(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return true if password contains hashtag char`() {
        val strategy = MinSpecialCharStrategy(1)
        val valueToTest = "Password#Test"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return false if password does not contains amount of hashtag char`() {
        val strategy = MinSpecialCharStrategy(2)
        val valueToTest = "Password#Test"
        assertFalse(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return true if password contains dollar sign char`() {
        val strategy = MinSpecialCharStrategy(1)
        val valueToTest = "Password\$Test"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return false if password does not contains amount of dollar sign char`() {
        val strategy = MinSpecialCharStrategy(2)
        val valueToTest = "Password\$Test"
        assertFalse(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return true if password contains percentage char`() {
        val strategy = MinSpecialCharStrategy(1)
        val valueToTest = "Password%Test"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return false if password does not contains amount of percentage char`() {
        val strategy = MinSpecialCharStrategy(2)
        val valueToTest = "Password%Test"
        assertFalse(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return true if password contains circumflex accent char`() {
        val strategy = MinSpecialCharStrategy(1)
        val valueToTest = "Password^Test"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return false if password does not contains amount of circumflex accent char`() {
        val strategy = MinSpecialCharStrategy(2)
        val valueToTest = "Password^Test"
        assertFalse(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return true if password contains ampersand char`() {
        val strategy = MinSpecialCharStrategy(1)
        val valueToTest = "Password&Test"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return false if password does not contains amount of ampersand char`() {
        val strategy = MinSpecialCharStrategy(2)
        val valueToTest = "Password&Test"
        assertFalse(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return true if password contains asterisk char`() {
        val strategy = MinSpecialCharStrategy(1)
        val valueToTest = "Password*Test"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return false if password does not contains amount of asterisk char`() {
        val strategy = MinSpecialCharStrategy(2)
        val valueToTest = "Password*Test"
        assertFalse(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return true if password contains left parentheses char`() {
        val strategy = MinSpecialCharStrategy(1)
        val valueToTest = "Password(Test"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return false if password does not contains amount of left parentheses char`() {
        val strategy = MinSpecialCharStrategy(2)
        val valueToTest = "Password(Test"
        assertFalse(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return true if password contains right parentheses char`() {
        val strategy = MinSpecialCharStrategy(1)
        val valueToTest = "Password)Test"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return false if password does not contains amount of right parentheses char`() {
        val strategy = MinSpecialCharStrategy(2)
        val valueToTest = "Password)Test"
        assertFalse(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return true if password contains subtraction char`() {
        val strategy = MinSpecialCharStrategy(1)
        val valueToTest = "Password-Test"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return false if password does not contains amount of subtraction char`() {
        val strategy = MinSpecialCharStrategy(2)
        val valueToTest = "Password-Test"
        assertFalse(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return true if password contains addition char`() {
        val strategy = MinSpecialCharStrategy(1)
        val valueToTest = "Password+Test"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return false if password does not contains amount of addition char`() {
        val strategy = MinSpecialCharStrategy(2)
        val valueToTest = "Password+Test"
        assertFalse(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return true if password contains underline char`() {
        val strategy = MinSpecialCharStrategy(1)
        strategy.specialChars = "_"
        val valueToTest = "Password_Test"
        assertTrue(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return false if password does not contains amount of underline char`() {
        val strategy = MinSpecialCharStrategy(2)
        val valueToTest = "Password_Test"
        assertFalse(strategy.isValid(valueToTest))
    }

    @Test
    fun `Should return the min special chars`() {
        val strategy = MinSpecialCharStrategy(8)
        var expected = 8
        assertEquals(expected, strategy.minChar)
    }

    @Test
    fun `Should add the min special chars`() {
        val strategy = MinSpecialCharStrategy()
        strategy.minChar = 10
        var expected = 10
        assertEquals(expected, strategy.minChar)
    }

    @Test
    fun `Should return the special chars`() {
        val strategy = MinSpecialCharStrategy(specialChars = "/*-+")
        val expected = "/*-+"
        assertEquals(expected, strategy.specialChars)
    }

    @Test
    fun `Should add the special chars`() {
        val strategy = MinSpecialCharStrategy()
        strategy.specialChars = ",.;]"
        var expected = ",.;]"
        assertEquals(expected, strategy.specialChars)
    }
}