import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

class a017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int ori = str.length();
        int max = 0;

        // 取得不重複的字元
        Set<String> temp = new LinkedHashSet<String>(Arrays.asList(str.split("")));
        String[] unique = temp.toArray(new String[temp.size()]);

        for (int i = 0; i < unique.length; i++) {
            int tmp = ori - str.replaceAll(unique[i], "").length();
            if (tmp > max) {
                max = tmp;
            }
        }
        System.out.println(ori - max);
        sc.close();
    }
}