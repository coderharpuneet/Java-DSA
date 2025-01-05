public class hcf {
    public static void gcd(int a,int b){
        if(b%a==0) {
            System.out.println(a);
            return;
        }
        gcd(b%a,a);
    }
    public static void main(String[] args) {
        int a=12,b=15;
        if(a>b){
            gcd(b,a);
        }
        else{
            gcd(a,b);
        }
    }
}
