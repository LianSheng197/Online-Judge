import java.util.Scanner;
import java.util.Arrays;

class a004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        String str_array[] = new String[3];
        long num[] = new long[3];

        long times = Integer.parseInt(sc.nextLine());

        while (times > 0) {
            str = sc.nextLine();
            str_array = str.split(" ");
            for (int i = 0; i < 3; i++) {
                num[i] = Integer.parseInt(str_array[i]);
            }

            if (num[2] % 2 == 1) {
                System.out.println((num[0] - num[1]) * (num[2] / 2) + num[0]);
            } else {
                System.out.println((num[0] - num[1]) * (num[2] / 2));
            }

            times--;
        }

        sc.close();
    }
}