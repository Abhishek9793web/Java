package lec_10;

import java.util.Scanner;

public class User_input_2D {
    public static void main(String[] args) {
        int arr[][]=new int[4][4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
    }
}
