package actionsSeleniumWd.Implements;

import actionsSeleniumWd.Interfaces.ModelAssertInterface;

public class ModelAssertImpl implements ModelAssertInterface {


    /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - ModelAssertImpl              #
    #  Se crean una Implementación Objetos   #
    #  mediante una interface que hace que   #
    #  Estos metodos se inicialicen.         #
    #                                        #
    #  Con el Objetico de crear              #
    #  Metodos JAVA a partir de los Assert´s #
    #  de TestNG - Selenium.                 #
    #                                        #
    ##########################################
    */


    public void assertTrue(boolean condition, String message) {
        assertTrue(condition, message);
    }

    public void assertFalse(boolean condition) {
        assertFalse(condition);
    }


    public void assertFalse(boolean condition, String message) {
        assertFalse(condition, message);
    }

    public void assertEquals(boolean actual, boolean expected) {
        assertEquals(actual, expected);
    }


    public void assertEquals(Object actual, Object expected) {
        assertEquals(actual, expected);
    }


    public void assertEquals(Object[] actual, Object[] expected) {
        assertEquals(actual, expected);
    }


    public void assertEquals(String condition, String message) {
        assertEquals(condition, message);
    }


    public void assertEquals(Object actual, Object expected, String message) {
        assertEquals(actual, expected,message);
    }

    public void verifyTrue(boolean condition, String message) {
        try {
            assertTrue(condition, message);
        } catch(Throwable e) {
            e.getMessage();
        }
    }

    public void verifyFalse(boolean condition) {
        try {
            assertFalse(condition);
        } catch(Throwable e) {
            e.getMessage();
        }
    }

    public void verifyFalse(boolean condition, String message) {
        try {
            assertFalse(condition, message);
        } catch(Throwable e) {
            e.getMessage();
        }
    }

    public void verifyEquals(boolean actual, boolean expected) {
        try {
            assertEquals(actual, expected);
        } catch(Throwable e) {
            e.getMessage();
        }
    }

    public void verifyEquals(String actual, String expected) {
        try {
            assertEquals(actual, expected);
        } catch(Throwable e) {

            e.getMessage();

        }
    }

    public void verifyEquals(int actual, int expected) {
        try {
            assertEquals(actual, expected);
        } catch(Throwable e) {

            e.getMessage();

        }
    }

    public void verifyEquals(Object actual, Object expected) {
        try {
            assertEquals(actual, expected);
        } catch(Throwable e) {
            e.getMessage();
        }
    }

    public void verifyEquals(Object[] actual, Object[] expected) {
        try {
            assertEquals(actual, expected);
        } catch(Throwable e) {
            e.getMessage();
        }
    }
}
