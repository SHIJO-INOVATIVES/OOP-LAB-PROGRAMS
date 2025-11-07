 import java.util.Random;

// Shared class for number generation and processing
class NumberGenerator {
    private int value;
    private boolean flag = false; // false means no number is ready

    public synchronized void put() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        Random random = new Random();
        value = random.nextInt(10); // generates 0 to 9
        System.out.println("The generated Number is:" + value);
        flag = true;
        notifyAll();
    }

    public synchronized void getEven() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        if (value % 2 == 0) {
            System.out.println("Second Thread is executing now...");
            int ans = value * value;
            System.out.println(value + "is Even Number and its square is:" + ans);
        }
        flag = false;
        notifyAll();
    }

    public synchronized void getOdd() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        if (value % 2 != 0) {
            System.out.println("Third Thread is executing now...");
            int ans = value * value * value;
            System.out.println(value + "is Odd Number and its cube is:" + ans);
        }
        flag = false;
        notifyAll();
    }
}

// Main class to run the threads
public class TestNumber {
    public static void main(String[] args) {
        NumberGenerator obj = new NumberGenerator();

        Thread producerThread = new Thread(() -> {
            for (int i = 1; i <= 6; i++) {
                System.out.println("Main thread started...");
                obj.put();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread consumerEven = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                obj.getEven();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread consumerOdd = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                obj.getOdd();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        producerThread.start();
        consumerEven.start();
        consumerOdd.start();
    }
}
