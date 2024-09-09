package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.UserValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"user123", "user.name", "user_Name", "user-name", "12345"})
    public void testValidateValidUsername(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"u1", "u$ername", "username ", "12345!", "@username"})
    public void testValidateInvalidUsername(String username) {
        assertFalse(validator.validateUsername(username));      // assertFalse, ponieważ oczekujemy, że metoda validateUsername
                                                                // zwróci false dla błędnych nazw użytkowników
    }

//    @ParameterizedTest
//    @ValueSource(strings = {"user@pl", "user@com", "whatever.pl", "user@name@domain.com"})
//    @NullAndEmptySource
//    public void shouldReturnFalseForInvalidEmails(String email) {
//        assertFalse(validator.validateEmail(email));
//    }

    @ParameterizedTest
    @ValueSource(strings = {"user@example.com", "user.name@example.com", "user-name@example.co.uk"})
    public void testValidateValidEmail(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"userexample.com", "user@.com", "user@com", "user@com.", "user@com..com"})
    public void testValidateInvalidEmail(String email) {
        assertFalse(validator.validateEmail(email));
    }

}



/*
validateUsername:
Nazwa użytkownika musi mieć co najmniej 3 znaki i może zawierać tylko litery (małe i duże), cyfry, kropki, myślniki oraz podkreślenia.

validateEmail:
Format e-maila powinien być w postaci nazwa@domena.com, gdzie nazwa może zawierać litery, cyfry, kropki, myślniki i podkreślenia,
a domena powinna mieć prawidłową strukturę.


Walidacje dla nazwy użytkownika:
długość (min i max znaków)
dozwolone znaki (niedozwolone- znaki specjalne)
brak znaków na początku i końcu
zakaz spacji
niepowtarzalność nazwy (w bazie danych)
brak obrażliwych i zakazanych słów

Walidacje dla adresu e-mail:
poprawny format: (znak @, poprawna domena, 'kropka' po @)
niepowtarzalność nazwy
właściwa domena
potwierdzenie e-maila
weryfikacja przez e-mail
sprawdzanie istniejących błędów literowych

inne:
CAPTCHA

polskie znaki?
 */
