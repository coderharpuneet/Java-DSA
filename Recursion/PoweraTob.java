public class PoweraTob {
    public static int power(int a,int b){
        if(b==0) return 1;
        return a*power(a,b-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(power(2,5 ));
    }
}
