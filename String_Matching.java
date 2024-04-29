
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

    public static int Rabin_Karp(String t, String p, int n, int m){
        return 0;
    }
    public static void main(String[] args) {
        String t = "abcabaabcabac";
        String p = "abaa";
        int t_len = t.length();
        int p_len = p.length();
        System.err.println(normal_string_matching(t, p, t_len, p_len));
    }
}