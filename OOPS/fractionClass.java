class fraction{
    int num;
    int den;
    public fraction(int num,int den){
        this.num=num;
        this.den=den;
        simplify();
    }
    public fraction add(fraction f1,fraction f2){
        int numerator=(f1.num*f2.den)+(f2.num*f1.den);
        int denominator=f1.den*f2.den;
        fraction f3=new fraction(numerator,denominator);
        return f3;
    }
    public void simplify(){
        int hcf=gcd(num,den);
        num/=hcf;
        den/=hcf;
    }
    public  int gcd(int a,int b){
        int min=Math.min(a,b);
        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return min;
    }
}
public class fractionClass {
    public static void main(String[] args) {
        fraction f1=new fraction(7,21);
        System.out.println(f1.num+"/"+f1.den);
        fraction f2=new fraction(14,21);
        System.out.println(f2.num+"/"+f2.den);
        fraction f3=f1.add(f1,f2);
        System.out.println(f3.num+"/"+f3.den);
    }
}
