package firstexample;

public class Main {

  public static void main(String[] args) {
    // Creating an instance of the HelloThread
    HelloThread thread = new HelloThread();

    // Starting the thread; the run() method of HelloThread will be called
    thread.start();

    //Optional: wait for the thread to finish
    try{
      thread.join(); // Waits for this thread to die
    }catch(InterruptedException e){
        e.printStackTrace();
    }

    // Print a message after the thread has finished execution
    System.out.println("HelloThread has finished execution :) ");

    // other tasks in main thread ....
  }
}
