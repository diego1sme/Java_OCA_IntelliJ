class Cool2{
    enum CoolSize{Cool,Coolio,Cooool}
    CoolSize size;
}
enum CoolSize{SUPERCOOL,COOL,UNCOOL}
class Zoo{
    public String coolMethod(){
        return "Wow baby";
    }
}
public class Moo extends Zoo{
    public void useMyCoolMethod(){
        System.out.println("Moo says, "+ coolMethod());
    }
    public static void main(String ...args){
        Moo m = new Moo();
        m.useMyCoolMethod();
        CoolSize cs = CoolSize.SUPERCOOL;
        System.out.println(cs);
        Cool2 co = new Cool2();
        System.out.println(co.size.Coolio);
    }
}
