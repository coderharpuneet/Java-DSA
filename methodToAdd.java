class Calculator{
    int a=10;
    int b=20;
    void add(){
        int res=a+b;
        System.out.println("Sum of "+a+" "+b+" is: "+res);
    }
}
public class methodToAdd {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add();
    }
}
