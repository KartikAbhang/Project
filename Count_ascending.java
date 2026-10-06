import java.util.Scanner;
public class Count_ascending
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n=sc.nextInt();
        int a[]=new int[n];

        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int max=a[0];

        for(int i=1;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }

        int count[]=new int[max+1];

        for(int i=0;i<n;i++)
        {
            count[a[i]]++;
        }

        System.out.println("Ascending order : ");
        for(int i=0;i<=max;i++)
        {
            while(count[i]>0)
            {
                System.out.print(i+" ");
                count[i]--;
            }
        }
    }
}