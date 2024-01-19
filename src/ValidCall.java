import org.testng.annotations.Test;

import java.io.*;

public class ValidCall {
    public static void main(String args[]) throws FileNotFoundException {
//        File file = new File("E:/filecheck.txt");
        String filePath = "E:/GenPactMeet.mp4";
        File file = new File(filePath);
        try{
            if(file.exists()){
                long size = file.length();
                Validation check = new Validation(size);
                System.out.println(size);
                boolean result = check.isValid();
                if(result){
                    System.out.println("Size is correct Thanks!");
                }
                else{
                    System.out.println("Size is not appropriate");
                }
            }
            else{
                System.out.println("File Doesn't Exist");
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
