package lec_10;
import java.util.Arrays;
public class insertion_sort {
    public static void main(String[] args) {
        int arr[]={1,2,12,23,445,67};

        sort(arr);

    }

    public static void  sort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int element=arr[i];
            int j=i-1;
            while (j>=0&& arr[j]>element){
                arr[j+1]=arr[j];
                j--;
            }
            j++;
            arr[j]=element;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
