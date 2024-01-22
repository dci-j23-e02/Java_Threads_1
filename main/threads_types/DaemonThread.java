package threads_types;

public class DaemonThread extends Thread {

  @Override
  public void run() {
    while(true){

      System.out.println("Daemon thread is running...");

      try{
        //Sleep for 1 second
        Thread.sleep(1000);
      }catch(InterruptedException e){
        // Handle interruption
        System.out.println("Daemon thread interrupted");
      }
    }

  }

}
