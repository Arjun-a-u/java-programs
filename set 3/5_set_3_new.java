    import java.util.Scanner;
class CircleArea
{
    double r,pi;
    CircleArea(double x)
    {
        r=x;
        pi=3.14;
    }
    void area_circle()
    {
        double area=0;
        area=pi*r*r;
        System.out.println("The area of circle of radius "+r+" is:"+area);
    }
}
class Area
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r=in.nextDouble();
        CircleArea obj=new CircleArea(r);
        obj.area_circle();
    }
}