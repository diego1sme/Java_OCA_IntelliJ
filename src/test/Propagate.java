package test;

public class Propagate {
    public static void main(String [] args){
        String s = null;
        try {
            reverse(s);
        }catch (Exception e){
            System.out.println("problem");
        }
        finally{
            System.out.println("String was reversed");
        }
    }
    static String reverse(String s) throws Exception{
        if(s == null){
            throw new Exception();
        }
        String reverseStr = "";
        for(int i = s.length()-1;i>=0; i--){
            reverseStr += s.charAt(i);
        }
        return reverseStr;
    }
}
