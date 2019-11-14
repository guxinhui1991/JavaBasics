public class MultiThreading {
}

class MultithreadingDemo extends Thread{
    public void run(){
        System.out.println("My thread is in running state.");
    }
    public static void main(String args[]){
        MultithreadingDemo obj=new MultithreadingDemo();
        obj.start();
    }
}

class Count extends Thread
{
    Count()
    {
        super("my extending thread");
        System.out.println("my thread created" + this);
        start();
    }
    public void run()
    {
        try
        {
            for (int i=0 ;i<10;i++)
            {
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("my thread interrupted");
        }
        System.out.println("My thread run is over" );
    }
}
class ExtendingExample
{
    public static void main(String args[])
    {
        Count cnt = new Count();
        try
        {
            while(cnt.isAlive())
            {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread's run is over" );
    }
}


class Count_2 implements Runnable
{
    Thread mythread ;
    Count_2()
    {
        mythread = new Thread(this, "my runnable thread");
        System.out.println("my thread created" + mythread);
        mythread.start();
    }
    public void run()
    {
        try
        {
            for (int i=0 ;i<10;i++)
            {
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("my thread interrupted");
        }
        System.out.println("mythread run is over" );
    }
}
class RunnableExample
{
    public static void main(String args[])
    {
        Count_2 cnt = new Count_2();
        try
        {
            while(cnt.mythread.isAlive())
            {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over" );
    }
}