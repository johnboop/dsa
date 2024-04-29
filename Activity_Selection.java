public class Activity_Selection {
    public static void printMaxActivities(int[] no,int s[], int f[], 
                                          int n) 
    { 
        int i; 

        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n-k-1; l++) {
                if (f[l] > f[l + 1]) {
                    int temp = f[l];
                    f[l] = f[l + 1];
                    f[l + 1] = temp;
                    temp = s[l];
                    s[l] = s[l + 1];
                    s[l + 1] = temp;
                    temp = no[l];
                    no[l] = no[l + 1];
                    no[l + 1] = temp;
                }
            }
        }
        System.out.println( 
            "Following activities are selected"); 
          i = no[0]; 
        System.out.print(i + " "); 
        // for (int b : no) {
        //     System.err.println(b);
        // }
        for (int j: no) { 
            if (s[j] >= f[i]) { 
                System.out.print((j+1) + " "); 
                i = j; 
            } 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int s[] = {4,1,2,0,4,7}; 
        int f[] = {8,2,3,5,6,8}; 
        int[] no = {0,1,2,3,4,5};
        int n = s.length; 
       printMaxActivities(no, s, f, n); 
    } 
}
