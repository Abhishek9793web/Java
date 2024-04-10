package lec_10;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Array_odd_even {
    public static void main(String[] args) {
        int arr[][]={{4,2,3},{1,10,15},{12,9,8}};
        print(arr);


    }

    public static void print(int arr[][]) {
        for(int index=0;index<arr[0].length;index++){
            if(index%2==0){
                for(int row=arr.length-1;row>=0;row--){       //int row=0;row<arr.length;row++  for up to down
                    System.out.print(arr[row][index]+",");

                }

            }
            else{
               for(int row=0;row<arr.length;row++){      //int row=arr.length-1;row>=0;row--  for up to down
                System.out.print(arr[row][index]+",");
               }

            }

        }

    }
}
