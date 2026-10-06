import java.util.Scanner;
public class Radix_ascending
{
    static int getMax(int a[],int n)
    {
        int max=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }

    static void sort(int a[],int n)
    {
        int max=getMax(a,n);

        for(int place=1;max/place>0;place=place*10)
        {
            int output[]=new int[n];
            int count[]=new int[10];

            for(int i=0;i<n;i++)
            {
                count[(a[i]/place)%10]++;
            }

            for(int i=1;i<10;i++)
            {
                count[i]=count[i]+count[i-1];
            }

            for(int i=n-1;i>=0;i--)
            {
                output[count[(a[i]/place)%10]-1]=a[i];
                count[(a[i]/place)%10]--;
            }

            for(int i=0;i<n;i++)
            {
                a[i]=output[i];
            }
        }
    }

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

        sort(a,n);

        System.out.println("Ascending order : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}