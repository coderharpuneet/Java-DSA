public class maxInStringArray {
    public static void main(String[] args) {
        String [] nums={"12345","00000078","1832541"};
        String maxS = nums[0];
        for(int i=0;i<nums.length;i++){
            maxS=max(maxS,nums[i]);
        }
        System.out.println(maxS);
    }
    public static String max(String a, String b){
        String s=purify(a),t=purify(b);
        if(s.length()>t.length()) return a;
        if(s.length()<t.length()) return b;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=t.charAt(i)){
                if(s.charAt(i)>t.charAt(i)) return a;
                else return b;
            }
        }
        if(a.length()>=b.length()) return a;
        else return b;

    }
    public static String purify(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0') return s.substring(i);
        }
        return "0";  
    }
}
