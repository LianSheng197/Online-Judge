import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

class a027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        int result = 1000000;

        // 取得不重複的字元
        // 不重複 ua, ub = [...]
        // 對應次數 ca, cb = [...]
        Set<String> ta = new LinkedHashSet<String>(Arrays.asList(a.split("")));
        String[] ua = ta.toArray(new String[ta.size()]);
        int[] ca = new int[ua.length];
        Set<String> tb = new LinkedHashSet<String>(Arrays.asList(b.split("")));
        String[] ub = tb.toArray(new String[tb.size()]);
        int[] cb = new int[ub.length];

        // 計算各字元重複次數
        for (int i = 0; i < ua.length; i++) {
            ca[i] = a.length() - a.replace(ua[i], "").length();

        }
        for (int i = 0; i < ub.length; i++) {
            cb[i] = b.length() - b.replace(ub[i], "").length();
        }

        // 計算結果（外層B、內層A）
        for (int i = 0; i < ub.length; i++) {
            boolean found = false;
            int temp = 0;
            for (int j = 0; j < ua.length; j++) {
                if (ub[i].equals(ua[j])) {
                    found = true;
                    temp = (int) (ca[j] / cb[i]);
                    if (temp < result) {
                        result = temp;
                    }
                    break;
                }
            }

            if (!found) {
                result = 0;
                break;
            }
        }

        System.out.print(result);
        sc.close();
    }
}