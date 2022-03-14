import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTestModelTest {
    @Test
    void checkPassword_too_short(){
        boolean actual = MyTestModel.checkPassword("1234");
    }
}