package primefactor;
import java.lang.Math;
class primefact
{
    void factor(int n)
    {
        while(n%2==0)
        {
            System.out.println(2+ " ");
        }
        for(int i=3;i<=Math.sqrt(n);i=i+2)
        {
            while(n%i==0)
            {
                System.out.print(i+" ");
                n=n/i;
            }
        }
        if(n>2)
        {
            System.out.print(2);
        }

    }
}