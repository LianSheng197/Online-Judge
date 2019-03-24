import java.util.Scanner;

class a001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        while (sc.hasNext()) {
            s = sc.nextLine();
            System.out.println("hello, " + s);
        }

        sc.close();
    }
}