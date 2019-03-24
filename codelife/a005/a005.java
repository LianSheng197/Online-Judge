import java.util.Scanner;

class a005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean p = true;

        for (int i = 2; i < Math.pow(a, 0.5); i++) {
            if (a % i == 0) {
                p = false;
                break;
            }
        }

        if (p && a != 1) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

        sc.close();
    }
}