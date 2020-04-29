package fr.jydet.services;

import org.junit.Assert;
import org.junit.Test;

public class SSNCheckerTest {

    private SSNChecker ssnChecker = new SSNChecker();

    @Test
    public void testSize() {
        assertNotValid("COUCOU");
        assertNotValid("00000000000I000");
        assertNotValid("123");
        assertNotValid("123456789101112 ");
        assertNotValid(" 123456789101112");
        assertNotValid("1234567891011121");
    }

    @Test
    public void testValid() {
        assertValid("269054958815780");
        assertNotValid("269054008815780");
        assertValid("269052A88815738");
        assertValid("269052B88815765");
        assertNotValid("2690542C8815780");
        System.out.println("A passé");
        assertValid("269059708815710");
        System.out.println("B passé");
    }

    private void assertValid(String ssn) {
        Assert.assertTrue(ssnChecker.isValid(ssn));
    }

    private void assertNotValid(String ssn) {
        Assert.assertFalse(ssnChecker.isValid(ssn));
    }
}