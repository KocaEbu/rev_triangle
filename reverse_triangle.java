import java.util.Scanner;

public class reverse_triangle {

    public static void main(String[] args) {

        int num, bas, tot = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        num = input.nextInt();


        while (num != 0) {

            bas = num % 10;
            num = num / 10;
            tot++;

        }

        for (int i = tot ; i >= 1; i--) {
            for (int c = 0; c < tot; c++) {
                System.out.print(" ");
            }
            tot ++;
            for (int b = 1; b <= (i * 2 - 1); b++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}