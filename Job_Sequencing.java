import java.util.Arrays;

public class Job_Sequencing {
    public static int job_sequence(int[] p,int[] d, int n){
        int arr[][]=new int[n][2];
        for(int i=0;i<arr.length;i++)
        {
            arr[i][0]=p[i];
            arr[i][1]=d[i];
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int slots = 0;
        for (int s : d) {
            if(s>slots){
                slots = s;
            }
        }
        boolean allslots[] = new boolean[slots];
        int ans =0;
        for (int i = n-1; i >=0; i--) {
            if (!allslots[arr[i][1]-1]) {
                ans+=arr[i][0];
                allslots[arr[i][1]-1] = true;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] p = {100, 10,15, 27};
        int[] d = {2, 1,2, 1};
        int n = p.length;
        System.out.println(job_sequence(p,d,n));
        
    }
}