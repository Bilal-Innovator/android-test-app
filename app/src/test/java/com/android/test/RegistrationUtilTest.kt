package com.android.test

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun validUsername(){

        val result = RegistrationUtil.validateRegistrationInput(
            "sunkist",
            "123",
            "123")

        assertThat(result).isTrue()

    }

    @Test
    fun invalidUsername(){

        val result = RegistrationUtil.validateRegistrationInput(
            "bilal",
            "123",
            "123")

        assertThat(result).isFalse()
    }

    @Test
    fun validPassword(){

        val result = RegistrationUtil.validateRegistrationInput(
            "sunkist",
            "123",
            "123")

        assertThat(result).isTrue()

    }

    @Test
    fun invalidPassword(){

        val result = RegistrationUtil.validateRegistrationInput(
            "sunkist",
            "abc",
            "abc")

        assertThat(result).isFalse()

    }

    @Test
    fun correctConfirmPassword(){

        val result = RegistrationUtil.validateRegistrationInput(
            "sunkist",
            "123",
            "123")

        assertThat(result).isTrue()

    }

    @Test
    fun incorrectConfirmPassword(){

        val result = RegistrationUtil.validateRegistrationInput(
            "sunkist",
            "123",
            "122")

        assertThat(result).isFalse()

    }

}