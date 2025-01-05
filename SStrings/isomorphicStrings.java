public class isomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        if(s.length()!=t.length()) System.out.println(false);
        int[] freq= new int[26];
        for(int i=0;i<s.length();i++){
            if(freq[(int)s.charAt(i)-97]!=0){
                System.out.println(false);
                break;
            }
            else if (freq[(int)s.charAt(i)-97]==0){
                freq[(int)(s.charAt(i))-97]=t.charAt(i);
                System.out.println(true);
            }
        }
        
        

    }
    // public static boolean isIsomorphic(String s, String t){
    //     if(s.length()!=t.length()) return false;
    //     int[] freq= new int[26];
    //     for(int i=0;i<s.length();i++){
    //         if(freq[(int)s.charAt(i)-97]!=0){
    //             return false;
    //         }
    //         else if (freq[(int)s.charAt(i)]==0){
    //             freq[(int)(s.charAt(i))-97]=t.charAt(i);
    //         }
    //     }
    //     return true;
    // }
}
