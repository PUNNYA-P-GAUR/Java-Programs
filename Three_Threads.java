class Three_Threads implements Runnable
{
    Thread t;
    Three_Threads(String name)
    {
        t = new Thread(this, name);
        t.start();
    }
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try
            {
                if(t.getName().equals("First Thread"))
                {
                    Thread.sleep(1000);
                    System.out.println(t.getName()+": Hello");
                }
                else if(t.getName().equals("Second Thread"))
                {
                    Thread.sleep(2000);
                    System.out.println(t.getName()+": Wear Mask");
                }
                else
                {
                    Thread.sleep(5000);
                    System.out.println(t.getName()+": Use Sanitizer");
                }
            }
            catch(InterruptedException e)
            {
                System.out.println(t.getName()+" is interrupted");
            }
        }
    }
}
class ThreeThreads
{
    public static void main(String[] args)
    {
        Three_Threads one = new Three_Threads("First Thread");
        Three_Threads two = new Three_Threads("Second Thread");
        Three_Threads three = new Three_Threads("Third Thread");
    }
}
