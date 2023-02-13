class Implementthreads implements Runnable 
{
    int n;
    Implementthreads(int n) 
    {
        this.n = n;
    }
    public void run() 
    {
        for (int i = 0; i < n; i++) 
        {
            System.out.println(i);
            try 
            {
                Thread.sleep(1000);
            } catch (InterruptedException e) 
            {
                System.out.println("Something went Wrong " + e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        Implementthreads s1 = new Implementthreads(5);
        Implementthreads s2 = new Implementthreads(10);
        new Thread(s1).start();
        new Thread(s2).start();
    }
}