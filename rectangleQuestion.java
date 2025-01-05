public class rectangleQuestion {
    public static void main(String[] args) {
        int l=45;
        int b=30;
        int area=l*b;
        int peri=2*(l+b);
        if(area>peri) System.out.println("Area is greater.");
        else System.out.println("Perimeter is greater.");
    }
}
