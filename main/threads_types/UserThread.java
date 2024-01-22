package threads_types;

public class UserThread extends Thread {

  @Override
  public void run(){
    for (int i = 0; i < 5; i++) {
      System.out.println("User thread is running ...");
      try{
        //Sleep for 1 second
        Thread.sleep(1000);
      }catch(InterruptedException e){
        // Handle the exception
        System.out.println("User thread interrupted !");
      }

    }
    System.out.println("User thread has completed execution.");
  }

}
