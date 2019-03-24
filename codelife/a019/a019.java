import java.util.Scanner;

class a019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int times = Integer.parseInt(sc.nextLine());
        while (times > 0) {
            int number = Integer.parseInt(sc.nextLine());

            while(number>9){
                number = getsum(number);
            }

            System.out.println(number);

            times--;
        }

        sc.close();
    }

    static int getsum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}