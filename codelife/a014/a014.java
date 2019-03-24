import java.util.Scanner;

class a014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        String s[] = new String[12];
        
        int times = Integer.parseInt(sc.nextLine());
        while (times > 0) {
            boolean f = false;
            str = sc.nextLine();
            s = str.replace(" ", "").split("");

            // check color
            for (int i = 2; i < 12; i += 2) {
                if (s[0].equals(s[i])) {
                    f = true;
                    break;
                }
            }

            if (f) {
                System.out.println("YES");
                times--;
                continue;
            }

            // check number
            for (int i = 3; i < 12; i += 2) {
                if (s[1].equals(s[i])) {
                    f = true;
                    break;
                }
            }

            if (f) {
                System.out.println("YES");
                times--;
                continue;
            } else {
                System.out.println("NO");
                times--;
                continue;
            }
        }

        sc.close();
    }
}