import java.io.File;
import java.io.FileWriter;

public class fileHandling2 {
    public static void main(String[] args) {
        File file=new File("file.txt");
        try{
            FileWriter writer=new FileWriter(file, true); // true for append mode
            writer.write("this is a file");
            writer.write("\n");
            writer.write("this is a new line");
            writer.close();
            System.out.println("Data written to file successfully.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
