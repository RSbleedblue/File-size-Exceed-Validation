import java.io.File;

public class Validation {
    long size = 25 * 1024 * 1024;
    private long fileSize;
    public Validation(long fileSize){
         this.fileSize = fileSize;
    }

    public boolean isValid(){
        if(fileSize > size){
            return false;
        }
        return true;
    }
    public boolean notPresent(File file){
        return file.exists();
    }
}
