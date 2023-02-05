import java.util.Scanner;
class display
{
	void disp(int a,int b)
	{
		while( a <=b )
        {
            System.out.println(a++);
        }	
	}
}
class Mton
{
    public static void main(String[] args)
    {
        Scanner obj7=new Scanner(System.in);
		display obj=new display();
        System.out.println("Enter m");
        int m=obj7.nextInt();
        System.out.println("Enter n");
        int n=obj7.nextInt();
        System.out.println("The numbers are ");
        obj.disp(m,n);
    }
}