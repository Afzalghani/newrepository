import java.util.*;
public class CodeforcesC {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        long sum=input.nextLong();
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=input.nextLong();
        }
        int l=0;
        int res=0;
        long  x=0;
        for(int i=0;i<n;i++)
        {
            x+=arr[i];
            while(x>sum)
            {
                x=x-arr[l];
                l++;
            }
            res+=i-l+1;

        }
        if(res==0)
        {
            System.out.print(-1);
            return;
        }
        System.out.println(res);
        
    }
    
}
