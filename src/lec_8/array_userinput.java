package lec_8;

import java.util.Scanner;

public class array_userinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[] =new int[size];
        for(int index=0;index<size;index++){
            arr[index]=sc.nextInt();
        }
        System.out.println("<<===========>>");
        for (int i : arr) {

            System.out.println(i);
//            for(int index=0;index<arr.length;index++) {
//                System.out.println(arr[index]);
        }
       // int arr2[]={1,2,12,34,5,6};

    }
}
