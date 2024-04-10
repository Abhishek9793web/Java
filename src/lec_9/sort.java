package lec_9;

public class sort {
    public static void main(String[] args) {
        int []arr={0,1,2,2,1,2,1,0,1,0};
        int  zeroCount=0,oneCount=0,twoCount=0;

        for(int i=0;i<arr.length;i++){


            if(arr[i]==0){
                zeroCount++;
            }
            if(arr[i]==1){
                oneCount++;
            }
            if(arr[i]==2){
                twoCount++;
            }

        }
        for(int i=0; i<zeroCount;i++){
            System.out.print(0+" ");
        }
        for(int i=0; i<oneCount;i++){
            System.out.print(1+" ");
        }

        for(int i=0; i<twoCount;i++){
            System.out.print(2+" ");
        }


    }
}
