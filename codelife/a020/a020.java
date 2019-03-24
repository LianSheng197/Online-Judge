import java.util.Scanner;

class a020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        
        int times = Integer.parseInt(sc.nextLine());
        while (times > 0) {
            str = sc.nextLine();

            for(int i=0; i<str.length(); i++){
                for(int j=i;j<str.length(); j++){
                    System.out.print(str.charAt(j));
                }
                System.out.println();
            }

            times--;
        }

        sc.close();
    }
}