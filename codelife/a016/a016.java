import java.util.Scanner;

class a016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = Integer.parseInt(sc.nextLine());

        while (times > 0) {
            int num = Integer.parseInt(sc.nextLine());
            boolean p = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    p = false;
                    break;
                }
            }

            if (p && num != 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            times--;
        }

        sc.close();
    }
}