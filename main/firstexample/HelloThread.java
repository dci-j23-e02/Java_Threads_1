package firstexample;

// Creating a thread by extending the Thread class
public class HelloThread extends Thread{

@Override
public  void run(){
  //Print a message to the console
  System.out.println("Hello from a thread!");
}
}
