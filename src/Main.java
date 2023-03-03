package src;

import src.newRunnable;

public class Main {

    public static void main(String args[]) {

        newRunnable R1 = new newRunnable("Thread-1");
        newRunnable R2 = new newRunnable("Thread-2");
        newRunnable R3 = new newRunnable("Thread-3");

        R1.start();
        R2.start();
        R3.start();

    }
}
