package lec_8;

public class max_of_array {
    public static void main(String[] args) {
         int arr[]={11,1,2,23,-10,200,11,25,334,2000003};
          max(arr);

    }

    public static void max(int arr[]) {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);

    }

}
