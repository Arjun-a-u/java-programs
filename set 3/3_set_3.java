import java.util.Scanner;
class Display
{
    void dis(int n)
    {
        int sum=0;
        int i=1;
        while(i<=n+1)
        {
           
                sum=sum+i;
            i++;
        }
        System.out.println("The sum of the Series is "+sum);
    }
}
class Series1
{
    public static void main(String[] args)
    {
        Display obj=new Display();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n");
        int n=in.nextInt();
        obj.dis(n);
    }
}
