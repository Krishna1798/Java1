import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

//By extending Thread class
public class Practice4 extends Thread{
    private static final Logger logger = LogManager.getLogger(Practice4.class);

    @Override
    public void run(){
        BasicConfigurator.configure();
        logger.info("Thread is running by extending Thread class.");
    }
    public static void main(String[] args){
        Practice4 p= new Practice4();
        p.start();
        // It will through an exception because you are calling start() method more than one time
        p.start();
    }
}

//By implementing Runnable interface
class Practice5 implements Runnable{
    private static final Logger log = LogManager.getLogger(Practice5.class);
    @Override
    public void run() {
        log.info("Thread is running by impementing Runnable interface.");
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Practice5 p=new Practice5();
        Thread t1=new Thread(p);
        t1.start();
    }
}

//
class ThreadInterrupt extends Thread{
    private static final Logger log1 = LogManager.getLogger(ThreadInterrupt.class);
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            log1.info("This thread is going to be interrupted.");
        }
        catch (InterruptedException e){
            throw new RuntimeException("Thread interrupted!");
        }
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        ThreadInterrupt interruptThread=new ThreadInterrupt();
        interruptThread.start();
        try {
            interruptThread.interrupt();
        }catch (Exception e) {
            log1.info("Interruption Handled!");
        }
    }
}
class ThreadJoin extends Thread{
    private static final Logger log2 = LogManager.getLogger(ThreadJoin.class);

    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){log2.info(e);}
            log2.info(i);
        }
    }
    public static void main(String[] args){
        ThreadJoin t1=new ThreadJoin();
        ThreadJoin t2=new ThreadJoin();
        ThreadJoin t3=new ThreadJoin();

        BasicConfigurator.configure();
        t1.start();
        try{
            t1.join();
        }catch(Exception e){log2.info(e);}

        t2.start();
        t3.start();
    }
}

