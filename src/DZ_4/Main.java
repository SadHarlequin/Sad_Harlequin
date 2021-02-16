package DZ_4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;


public class Main {

    public static void main(String[] args) {
        final ThreadGroup threadGroup = new ThreadGroup("DZ");
        ExecutorService executor = Executors.newCachedThreadPool(new ThreadFactory() {
            public Thread newThread(Runnable r) {
                return new Thread(threadGroup, r);
            }
        });
        System.out.println(threadGroup.activeCount());
    }
}

