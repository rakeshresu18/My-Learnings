import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int ans=ArrayProblem1(n,arr);
        System.out.println(ans);
    }

    public static int ArrayProblem1(int n, int[] arr){
        
        // STEP 1: To find the largest Element 
        int largestElement = arr[0];
        int answer = 0;
        for(int i=1; i<n; i=i+1)
        {
            // If current element > largestElement then largestElement needs to be updated 
            if(arr[i] > largestElement)
            {
                // Updating the largest element 
                largestElement = arr[i];
                answer = i;
            }
        }
        
        return answer;
    }
}