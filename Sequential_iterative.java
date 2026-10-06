import java.util.Scanner;
public class Sequential_iterative
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

        System.out.println("Enter the element to search : ");
        int key=sc.nextInt();
        int flag=0;

        for(int i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                flag=1;
                System.out.println("Element found at position "+(i+1));
                break;
            }
        }

        if(flag==0)
        {
            System.out.println("Element not found.");
        }
    }
}