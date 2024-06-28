import java.util.Scanner;

public class seeding {
    public static void seedings(int n) {
        // Write your code here
        for (int i =0;i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        seedings(n);
        sc.close();
    }
}
// 12345
// 1234
// 123
// 12
// 1

