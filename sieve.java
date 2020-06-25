import java.io.*;
import java.util.*;
class sieveclass
{
  int arr[];
  int n;
  sieveclass(int i)
  {
    n=i;
    arr=new int[n+1];
  }
  void primeno()
  {
    for(int i=0;i<n;i++)
           arr[i] = 1;

           for(int p = 2; p*p <=n; p++)
           {
               // If prime[p] is not changed, then it is a prime
               if(arr[p] == 1)
               {
                   // Update all multiples of p
                   for(int i = p*p; i <= n; i += p)
                       arr[i] = 0;
               }
           }
           for(int i = 2; i <= n; i++)
       {
           if(arr[i] == 1)
               System.out.print(i + " ");
       }
  }
}
class sieve{
   public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    sieveclass sv=new sieveclass(n);
    sv.primeno();
  }
}
