package src;

public class newRunnable implements Runnable {
    private Thread t;
    private String threadName;

    newRunnable(String name) {
        threadName = name;
        System.out.println("Creating " + threadName );
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for(int i = 4; i > 0; i--) {
                LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance();
                System.out.println(threadName + " hash code: " + singleton.hashCode());

                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + "exiting.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName );
        if(t == null) {
            t = new Thread (this, threadName);
            t.start();
        }
    }
}
