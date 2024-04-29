
public class String_Matching {
    public static int normal_string_matching(String t, String p, int n, int m) {
        int i = 0;
        int j = 0;
        while (i < (n - m)) {
            if (t.charAt(i) == p.charAt(0)) {
                j = 0;
                int k = i;
                while (j < m) {
                    if (t.charAt(k) != p.charAt(j)) {
                        break;
                    }
                    j++;
                    k++;
                    if (j == m) {
                        return i;
                    }
                }
            }
            i++;
        }
        return -1;
    }

    public static boolean check(char[] arrt, char[] arrp, int i) {
        for (char c : arrp) {
           if (c!=arrt[i]) {
            return false;
           }
           i++;
        }
        return true;
    }
    public static String Rabin_Karp(String t, String p, int n, int m){
        char[] arrt = t.toCharArray();
        char[] arrp = p.toCharArray();
        int p_value = 0;
        for (int i = 0; i < arrp.length; i++) {
            p_value+= arrp[i];
        }
        p_value = p_value % 13;
        int t_value = 0;
        int crt =0;
        int j=0;
        for (int i = 0; i < arrt.length; i++) {
            if (i>=arrp.length) {
                crt-=arrt[j];
                j++;
            }
            crt+=arrt[i];
            if (crt%13 == p_value && check(arrt, arrp, j) ) {
                System.err.println("finded");
            }
        }

        return "not finded";
    }
    public static void main(String[] args) {
        String t = "abcababcabac";
        String p = "abaa";
        int t_len = t.length();
        int p_len = p.length();
        System.err.println(normal_string_matching(t, p, t_len, p_len));
        System.err.println(Rabin_Karp(t, p, t_len, p_len));
    }
}
