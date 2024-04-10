package lec_6;

import java.util.Scanner;

public class Bin_to_Dec {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        int n=cs.nextInt();


        int result=0;
        int multiplier=1;
        while(n!=0){
            int rem=n%2;
            result=result+(rem*multiplier);
            multiplier=multiplier*2;
            n=n/10;
        }
        System.out.println(result);
    }
}
