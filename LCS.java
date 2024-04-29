public class LCS {
    public static int LCs(String t, String p, int i , int j){
        if (i==t.length() || j==p.length()) {
            return 0;
        }
        if(t.charAt(i)==p.charAt(j)){
            return 1+LCs(t, p, i+1,j+1);
        }else{
            return Math.max(LCs(t, p, i+1, j), LCs(t, p, i, j+1));
        }
    }
    public static void main(String[] args) {
        String t = "abcabaabcabac";
        String p = "abaf";
        System.err.println(LCs(t, p,0,0));
    }
}
