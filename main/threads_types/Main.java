package threads_types;

public class Main {

  public static void main(String[] args) {
    // Create and start the daemon thread
    DaemonThread daemon = new DaemonThread();
    daemon.setDaemon(true);// Setting the thread as daemon
    daemon.start();

    // Create the user thread
    UserThread userThread = new UserThread();
    userThread.start();

    // Wait for the uer thread to finish
    try{
      userThread.join(); // Waits for this thread to die
    }catch(InterruptedException e){
      e.printStackTrace();
    }

    // The JVM will exit after the user thread finishes,
    // and the daemon thread will be terminated
    System.out.println("Main thread is finishing.");

  }
}
