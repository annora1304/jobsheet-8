import java.util.Scanner;
public class Square12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        for (int i=1; i<N; i++) {
            for (int a=0; a<N; a++) {
                        System.out.print("*");
            }
            System.out.println("");
            }
        }
    }

