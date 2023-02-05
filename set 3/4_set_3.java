import java.util.Scanner;
class Series2disp
{
    static int factorial(float number)
    {
        int fact=1;
        for(int i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}
class Series
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=in.nextInt();
        Series2disp obj=new Series2disp();
        float sum=0;
        for(float i=1;i<=n;i++)
        {
            sum=sum+i/obj.factorial(i);
        }   
        System.out.println("The sum of series is "+sum);
    }
}