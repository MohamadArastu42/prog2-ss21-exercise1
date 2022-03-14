import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Mein Github Link :) => https://github.com/MohamadArastu42/prog2-ss21-exercise1

public class MyTestModelTest {
    @Test
    void checkPasswordTooShort() {
        boolean actual = MyTestModel.checkLength("1234567");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void checkPasswordCorrectLength() {
        boolean actual = MyTestModel.checkLength("12345678910");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void checkPasswordTooLong() {
        boolean actual = MyTestModel.checkLength("12345678123456781234567812345678");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void checkPasswordUpperCase() {
        boolean actual = MyTestModel.checkIfUpper("KKKKKKKKKKKKKKKKK");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void checkPasswordLowerCase() {

        boolean actual = MyTestModel.checkIfLower("kkkkkkkkkkkkkkkkkkkkk");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void checkPasswordUpperCase_False() {
        boolean actual = MyTestModel.checkIfUpper("kkkkkkkk");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void checkPasswordLowerCase_False() {

        boolean actual = MyTestModel.checkIfLower("KKKKKKK");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void hasDigit() {
        boolean actual = MyTestModel.checkIsDigit("asd123");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void hasNoDigit() {
        boolean actual = MyTestModel.checkIsDigit("asdsde");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void hasSpecialSymbol() {
        boolean actual = MyTestModel.checkIfSpecialCharacter("das@!$2()");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void hasNoSpecialSymbol() {
        boolean actual = MyTestModel.checkIfSpecialCharacter("das123");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void iscorrectPassword() {
        boolean actual = MyTestModel.checkPassword("123dasDkwW@($!");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isNotCorrectPassword() {
        boolean actual = MyTestModel.checkPassword("asldklaskdlakksdlkasldkalskdlaksldklkalskd@23SDK");
        boolean expected = false;
        assertEquals(expected, actual);
    }
}