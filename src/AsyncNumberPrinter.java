package src;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AsyncNumberPrinter {
    private static final AtomicInteger number = new AtomicInteger(1);

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        Runnable printOdd = () -> {
            while (number.get() <= 100) {
                int num = number.get();
                if (num % 2 == 1) { // Check if odd
                    System.out.println(Thread.currentThread().getName() + " → " + num);
                    number.incrementAndGet();
                }
            }
        };

        Runnable printEven = () -> {
            while (number.get() <= 1000) {
                int num = number.get();
                if (num % 2 == 0) { // Check if even
                    System.out.println(Thread.currentThread().getName() + " → " + num);
                    number.incrementAndGet();
                }
            }
        };

        executor.submit(printOdd);
        executor.submit(printEven);

        executor.shutdown();
    }
}
