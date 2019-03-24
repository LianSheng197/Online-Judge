import java.util.Scanner;
import java.util.Arrays;

class a010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str_array = new String[2];
        int[] num = new int[2];
        int mod = 998224350;

        int times = Integer.parseInt(sc.nextLine());
        while (times > 0) {
            String s = sc.nextLine();
            long answer = 1;
            str_array = s.split(" ");
            for (int i = 0; i < 2; i++) {
                num[i] = Integer.parseInt(str_array[i]);
            }

            int n = num[0];
            long lmax = Long.MAX_VALUE;
            long lmod = lmax % mod;

            // 判斷分母何者較大 (d1>d2)
            int d1 = (num[1] >= (num[0] - num[1])) ? num[1] : (num[0] - num[1]);
            int d2 = (num[1] >= (num[0] - num[1])) ? (num[0] - num[1]) : num[1];

            // boolean default is false
            boolean[] divided = new boolean[d2 + 1];
            int overflow = 0;

            for (int i = n; i > d1; i--) {
                // 判斷溢位次數
                if (answer > 0 && lmax / answer < i) {
                    overflow++;
                    answer = 1;
                }
                answer *= i;
                for (int j = 1; j <= d2; j++) {
                    if ((!divided[j]) && (answer % j == 0)) {
                        answer /= j;
                        divided[j] = true;
                    }
                }
            }

            for(int i=1; i<divided.length; i++){
                if(!divided[i]){
                    System.out.println(i);
                }
            }
            
            System.out.println((answer % mod + overflow * lmod) % mod);
            System.out.println(994392229 % 49);
            times--;
        }

        sc.close();
    }
}