package lec_7;

public class function4 {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(add(18,9));
        System.out.println("world");

    }

    public static int add(int a,int b) {
        subtract (a,b);
        return (a+b);

    }

    public static void subtract (int a,int b){
        System.out.println(a-b);
    }
}
