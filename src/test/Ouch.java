package test;

public class Ouch {
    public static void main(String [] args) {
        int a = 1_000;
        String b = "1_000";
        int c = a + a;
        String d = a + b;
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
