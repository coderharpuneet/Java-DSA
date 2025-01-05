public class updateEvenPositions {
    public static void main(String[] args) {
        String str="Harpuneet Singh";
        String newstr="";
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                newstr+='a';
            }
            else{
                newstr+=str.charAt(i);
            }
        }
        System.out.println(newstr);
    }
}
