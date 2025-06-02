import java.util.Scanner;
import java.io.*;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        String inputFile=sc.nextLine();
        String outputFile=sc.nextLine();
        sc.close();
        removeComments(inputFile, outputFile);
        try {
        Scanner outputReader = new Scanner(new File(outputFile));
        while (outputReader.hasNextLine()) {
            System.out.println(outputReader.nextLine());
        }
        outputReader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
        
    }
    
    public static void removeComments(String inputFile,String outputFile){
        try{
            FileWriter writer=new FileWriter(new File(outputFile),true);
        Scanner reader=new Scanner(new File(inputFile));
        StringBuilder sb=new StringBuilder("");
            boolean insideBlock=false;
        while(reader.hasNextLine()){
            String line=reader.nextLine();
            int i=0;
            int len=line.length();
            
            while(i<len){
                if(!insideBlock){
                    if(i+1<len && line.charAt(i)=='/' && line.charAt(i+1)=='/'){
                        break;
                    }
                    else if(i+1<len && line.charAt(i)=='/' && line.charAt(i+1)=='*'){
                        i+=2;
                        insideBlock=true;
                    }
                    else{
                        sb.append(line.charAt(i));
                        i++;
                    }
                }
                else{
                    if(i+1<len && line.charAt(i)=='*' && line.charAt(i+1)=='/'){
                        i+=2;
                    }
                    else i++;
                }
                
            }
            sb.append("\n");
            
        }
            writer.write(sb.toString().trim());
            reader.close();
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        int x=10;
        if(x>5){
            if(x<10){
                x=15;
            }
            else{
                x=20;
            }
        }
        else{
            x=5;
        }
        
    }
    
}