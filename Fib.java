import java.util.Arrays;

public class Fib {
    public static int fib(int n, int[] store) {
        if(store[n]!=-1){
            return store[n];
        }else if (n == 1){
            return 1;
        }else if(n==0){
            return 0;
        }else{
        int result = fib(n-1,store) + fib(n-2,store);
        store[n]= result;
        return result;
    }

    }
    public static void main(String[] args) {
        int store[] = new int[11];
        Arrays.fill(store, -1);
        System.out.println(fib(4, store));
    }

    
}
