package com.virtualpairprogrammers.isbntools;

import org.junit.Test;

import static org.junit.Assert.*;


public class ValidateISBNTest {

        @Test
        public void checkA10DigitsValidISBN() {
            ValidateISBN validator = new ValidateISBN();
            boolean result = validator.checkISBN("0140449116");
            assertTrue(result);
        }

        @Test
        public void checkAValid13DigitISBNNumber () {
            ValidateISBN validator = new ValidateISBN();
            boolean result = validator.checkISBN("1234567891234");
        }

        @Test
        public void TenDigitsISBNNumberEndingWithXAreValid() {
            ValidateISBN validator = new ValidateISBN();
            boolean result = validator.checkISBN("012000030X");
            assertTrue(result);
        }

        @Test
        public void checkAnInvalid10DigitsISBN() {
            ValidateISBN validator = new ValidateISBN();
            boolean result = validator.checkISBN("0140449117");
            assertFalse(result);
        }

        @Test
        public void checkAnInvalid13DigitsISBNNumber() {
            ValidateISBN validator = new ValidateISBN();
            boolean result = validator.checkISBN("9781853267338");
            assertFalse(result);
        }


        @Test(expected = NumberFormatException.class)
        public void nonNumericISBNAreNotAllowed() {
            ValidateISBN validator = new ValidateISBN();
            validator.checkISBN("helloworld");
        }
}

//0140449116