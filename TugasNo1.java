import java.util.Scanner;
public class TugasNo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = input.nextInt();
        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
        } else {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    System.out.print(j + " "); 
                }
                System.out.println(); 
            }
        }
    }
}