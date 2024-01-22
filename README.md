# Java Threads 1

### Introducing Threads

Threads in Java are the smallest unit of execution within a process. Java uses threads to enable the entire environment to be asynchronous, which helps to perform multiple operations simultaneously. Each thread has its own call stack. Threads can be created by using the `Thread` class or implementing the `Runnable` interface.

#### Code Example:
```java
// Creating a thread by extending the Thread class
class HelloThread extends Thread {
    public void run() {
        System.out.println("Hello from a thread!");
    }
}

public class Main {
    public static void main(String args[]) {
        // Creating and starting the thread
        HelloThread thread = new HelloThread();
        thread.start();
    }
}
```

### Distinguishing Thread Types

There are two types of threads in Java: user threads and daemon threads. User threads are high-priority threads. The JVM will wait for any user thread to complete its task before terminating. On the other hand, daemon threads are low-priority threads that the JVM does not wait for, and they are used for background supporting tasks.

#### Code Example:
```java
// Creating a daemon thread
class DaemonThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running...");
        }
    }
}

public class Main {
    public static void main(String args[]) {
        DaemonThread daemon = new DaemonThread();
        daemon.setDaemon(true); // Setting the thread as daemon
        daemon.start();
    }
}
```
