package HW3;

public class Directory {
    public static AudioFile getFileValue() {
        AudioFile a = new AudioFile();
        if(a = null) {
            throw new IllegalArgumentException ("Audio File must not be empty");
        }
        return a;
    }
    try {
        throw new RuntimeException();
        } 
        catch (Exception e) {
            if (e instanceof RuntimeException) {                
                System.err.print("It is a RuntimeException");              
            } else {
                System.err.print("Something wrong but it is not a RuntimeException");              
            }            
        }
}
