import java.util.Scanner;
class Teacher
{
    String name,dept;
    void read_data()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Name of the teacher:");
        name=in.nextLine();
        System.out.println("Enter the department of teacher:");
        dept=in.nextLine();
    }
    void display_data()
    {
        System.out.println("The name of the teacher is "+name);
        System.out.println("The department of the teacher is "+dept);
    }
}
class Students extends Teacher
{
	 void read_data()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Name of the student:");
        name=in.nextLine();
        System.out.println("Enter the department of the student:");
        dept=in.nextLine();
    }
    void display_data()
    {
        System.out.println("The name of the student is "+name);
        System.out.println("The department of the student is "+dept);
    }   
}
class overriding
{
    public static void main(String[] args)
    {
        int ch=0;
        Scanner in=new Scanner(System.in);
        Teacher obj=new Teacher();
	    Teacher obj1=new Students();
        while(ch!=5)
        {
            System.out.println("1.Enter detail of Teacher");
            System.out.println("2.Enter detail of Student");
            System.out.println("3.Display the details of Teacher");
            System.out.println("4.Display the details of students");
            System.out.println("5.Exit");
            System.out.println("Enter the Your option");
            ch=in.nextInt();
            switch(ch)
            {
    	        case 1:obj.read_data();
                        break;
                case 2:obj1.read_data();
                        break;
                case 3:obj.display_data();
                        break;
	            case 4:obj1.display_data();
                        break;
                case 5:break;
                default:System.out.println("Worng optio");
            }       
        }
    }
}