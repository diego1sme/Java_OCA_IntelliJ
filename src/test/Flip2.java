package test;

public class Flip2 {
    public static void main(String[] args){
        String o = "-";
        String [] sa = new String[4];
        try{
            for(int i = 0; i < args.length; i++){
                sa[i] = args[i];
            }
            for(String s : sa){
                switch(s.toLowerCase()){
                    case "yellow": o += "y";
                    case "red": o += "r";
                    case "green": o += "g";

                }
                System.out.println(o);
            }
        }catch(NullPointerException e){
            e.printStackTrace();
            return;
        }
    }
}
