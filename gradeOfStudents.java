import java.util.Scanner;

public class gradeOfStudents {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        marks = sc.nextInt();
        if(marks>80) System.out.println("Very Good");
        else if(marks>60) System.out.println("Good");
        else if(marks>40) System.out.println("Average");
        else System.out.println("Fail");
    }
}
