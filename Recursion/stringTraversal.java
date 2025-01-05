public class stringTraversal {

    public static void traverse(int i,String name){
        if(i==name.length()){
            return;
        }
        System.out.print(name.charAt(i)+" ");
        
        traverse(i+1,name);
    }
    public static void main(String[] args) {
        String name="Harpuneet Singh";
        traverse(0,name);
    }
}
