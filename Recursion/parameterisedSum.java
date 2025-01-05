public class parameterisedSum {
    public static void sum(int n,int s){
        if(n==0){
            System.out.println(s);
            return;
        }
        sum(n-1,s+n);
    }
    public static void main(String[] args) {
        int n;
        n=5;
        sum(n,0);
    }
}
