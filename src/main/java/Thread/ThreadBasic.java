package Thread;

/*
Thread:
Code line: 1-50 //for hero
Code line: 51 - 100 //for villain

Multiprocessing
    Example: Listening to music + coding in 
    NetBeans at the same time.

Multiple processes run independently.

Each process allocates its own memory (resources are not shared).

Multithreading

    -Example: In NetBeans, you can write code, compile, and execute simultaneously.

Multiple threads run within a single process.

Threads share resources of the parent process.

Relationship → Multi-tasking

***** Multiprocessing + Multithreading = Multi-tasking *****

Achieves efficient use of CPU for multiple activities.

Key Terminology:

    -Task → A unit of work.

    -Process → A program that uses system resources (e.g., NetBeans, Browser).

    -Sub-Process → A division inside a process (e.g., tabs in a browser).

Thread → Functional units inside a process that share the same resources

Example: Inside a Facebook tab → messaging,
posting, watching reels.

Parallelism:

Performing multiple tasks at the same time.

We can't achieve real parallelism by thread
Can be achieved via:

Multiprocessing → CPU handles multiple processes.
                → notepad++, zoom, IDE at the same time

Multithreading → Threads inside
a single process run concurrently.
     → batch61c.java
     → line: 1-10, line 23 - 50, line 55 - 67(those lines will run parallelly)

*/
//

//Two Ways using Thread:
//1)Extending Thread Class(class MyThread extends Thread)
//2)Implementing Runnable Interface (class MyThread implements Runnable)
////
//
//Thread Lifecycle
//1.New → Thread t = new Thread()
//2.Runnable → t.start() called (Application to Thread scheduler)
//3.Running → Scheduler gives CPU time
//4.Waiting/Blocked → Waiting for another thread/event
//5.Terminated/Dead → After finishing execution
//
//
//
//Thread Methods
//start() → begins a new thread
////
////
//run() → thread’s job (executed internally by start())
//
//
//sleep(ms) → pause thread temporarily
//
//
//join() → wait for another thread to finish
//
//
//isAlive() → check if thread is alive
//
//
//yield() → hint scheduler to switch
//
//
//setPriority(int) → priority between 1–10
//



//Start() method  contributes(Of super class):
//- Application to Thread Scheduler for enlisting
//- Call run() method


/*
Daemon Thread:
 If all user threads finish but daemon threads are 
still running, the JVM will kill the daemon thread and exit.

So the daemon is like a background assistant—it works 
while user threads are alive, but it doesn’t block 
JVM shutdown.


Why this is important:

Without daemon threads, background services 
(like GC) would keep JVM alive forever.
But by marking them daemon, JVM ensures → “Don’t 
wait for these when user work is done.”
*/

//Thread Creation:
//create Custom Thread class 
//Extend Thread Class
//Overriding run() method
//Creation of object
//calling the start() method


public class ThreadBasic extends Thread{
    
    /////
    //Thread Class
//    start(){
//        run();
//    }
//    
//    run(){
//        
//    }
    
    
    //run() of child --->run of parent --->run of gPa
    ////
    
 //   @Override
//    public void start(){
//        System.out.println("local start");
//        super.start();
//        run();
//    }
    
    @Override
    public void run(){
        //super.run();
        //System.out.println("inside run");
        //System.out.println("Name: "+ Thread.currentThread().getName());
  
        for(int i=0;i<4;i++){
            System.out.println(i+" : Name: "+ Thread.currentThread().getName());
           try{
            Thread.sleep(8);
           }catch(Exception e){
               System.out.println("Exception"); 
           }
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        ThreadBasic tb1 = new ThreadBasic();
        tb1.setName("A");
        tb1.start();// Application to thread Scheduler to be enlisted
        //tb1.run();
        tb1.join();//Helps to hold esource untill finished
        //tb1.join(500);//Holds for 500 ms
        
        ThreadBasic tb2 = new ThreadBasic();
        tb2.setName("B");
        //tb2.run();
        tb2.start();
        tb2.join();
        
        ThreadBasic tb3 = new ThreadBasic();
        tb3.setName("Daemon");
        tb3.setDaemon(true);
        //tb2.run();
        tb3.start();
        
    }
    
}



        //Thread x = Thread.currentThread();//return an object
        //String name =  x.getName();
