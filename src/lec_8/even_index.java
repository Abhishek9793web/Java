package lec_8;

public class even_index {
    public static void main(String[] args) {
        int [] arr={5,4,10,0,1};
        for (int i = 0; i < arr.length ;i++){
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }

    }
}
