package lec_7;

public class global_variable {
    static int val =100;
    public static void main(String[] args) {
        System.out.println("hey");
        int x=20;
        fun(x=12);
        System.out.println(val);
        System.out.println("hello");
    }

    public static void fun(int x) {
       // int val =19;
         val = 120;
        System.out.println(val);
        //   System.out.println(x);

    }
}