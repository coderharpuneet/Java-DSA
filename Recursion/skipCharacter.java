public class skipCharacter {
    public static void traverse(int i,String name,String res){
        if(i==name.length()){
            System.out.println(res);
            return;
        }
        if(name.charAt(i)!='e'){
            res+=name.charAt(i);
        }
        traverse(i+1,name,res);
    }
    public static void main(String[] args) {
        String name="Harpuneet Singh";
        traverse(0,name,"");
    }
}
