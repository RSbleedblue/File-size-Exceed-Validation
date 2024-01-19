
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {
    @Test
    void fileNotValid(){
        String filePath = "E:/GenPactMeet.mp4";
        File file = new File(filePath);
        Validation test = new Validation(file.length());
        boolean result = test.isValid();
        assertEquals(false,result);
    }
    @Test
    void fileValid(){
        String filePath = "E:/filecheck.txt";
        File file = new File(filePath);
        Validation test = new Validation(file.length());
        boolean result = test.isValid();
        assertEquals(true,result);
    }
    @Test
    void filenotPresent(){
        String filePath = "";
        File file = new File(filePath);
        Validation test = new Validation(file.length());
        boolean result = test.notPresent(file);
        assertEquals(false,result);
    }
}