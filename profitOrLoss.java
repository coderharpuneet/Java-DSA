import java.util.Scanner;

public class profitOrLoss {
    public static void main(String[] args) {
        int cp,sp;
        int total;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Cost Price: ");
        cp=sc.nextInt();
        System.out.print("Enter the Selling Price: ");
        sp=sc.nextInt();
        System.out.println();
        if(sp>cp){
            System.out.println("Profit");
            total=sp-cp;
            System.out.println("A profit of "+total+" was made.");
        }
        if(cp>sp)
        {
            System.out.println("Loss");
            total=cp-sp;
            System.out.println("A loss of "+total+" was incurred.");
        }
        if(sp==cp){
            System.out.println("There is no profit or loss.");
        }
    }
}
