import java.util.Scanner;
interface Geometry 
{
    void area(int l,int b,int h);
}
class Triangle implements Geometry 
{
    public void area(int l, int b, int h) {
        double area = 0.5 * l * b * h;
        System.out.println("Area is "+area);
    }
}
class Area 
{
    public static void main(String[] args) 
    {
        Geometry t = new Triangle();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the l");
        int l=in.nextInt();
        System.out.println("Enter the b");
        int b=in.nextInt();
        System.out.println("Enter the h");
        int h=in.nextInt();
        t.area(l,b,h);
    }
}