package String;

public class SubSequence {
    public static void main(String[] args){
        subSeq("", "abs");
    }
    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        subSeq(p + up.charAt(0), up.substring(1));
        subSeq(p, up.substring(1));
    }
}
