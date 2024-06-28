import java.util.Scanner;
public class Right {
    public static void nForest(int n) {
        // Write your code here
        int i,j;
        for (i =0;i<n;i++){
            for (j=0;j<=i;j++){
                System.out.print("*" +" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        nForest(n);
        sc.close();
    }
}