import java.io.File;
import java.util.Scanner;

public class fileHandling3 {
    public static void main(String[] args) {
        File file =new File("file.txt");
        try{
            Scanner read=new Scanner(file);
            while(read.hasNextLine()){
                String line=read.nextLine();
                System.out.println(line);
            }
            read.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
