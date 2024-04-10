package lec_8;

public class Arrays {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println(arr);
       arr[0]=5;
       arr[1]=4;
       arr[2]=10;
       arr[3]=0;
       arr[4]=1;

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
        for(int index=0;index<arr.length;index++){

            System.out.println(arr[index]);
        }



    }
}
