import java.io.*;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) {
        File file =new File("Harpuneet.txt");

        //Creating a File
        try{
            if(!file.exists()){
                file.createNewFile();
                System.out.println("File created successfully.");
            }
            else{
                System.out.println("File already exists.");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }


        //Writing to a File
        try{
            FileWriter writer=new FileWriter(file,true);
            writer.write("This is harpuneet's file");
            System.out.println("Data written to file successfully.\n");
            writer.write("dgkcbedb");
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }


        //Reading from a File
        try{
            Scanner reader=new Scanner(file);
            while(reader.hasNextLine()){
                String line=reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
