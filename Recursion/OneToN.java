public class OneToN {
    static int n;
    public static void print(int num) {
        if(num>n) return;
        System.out.println(num);
        print(num+1);
    }
    public static void main(String[] args) {
        n=10;
        print(1);
    }
}
