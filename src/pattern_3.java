public class pattern_3 {
    public static void main(String[] args) {
        int n=5;


        int row_no=1;
        int cstar=n;
        while (row_no<=n){
            int star=1;
            while (star<=cstar) {
                System.out.print("* ");
                star = star + 1;

            }
            row_no=row_no+1;
            cstar=cstar-1;
            System.out.println();
        }


    }
}
