// VNA00-J: Ensure visibility when accessing shared primitive variables
public class R08_VNA00_J {
    static final class ControlledStop implements Runnable {
        private volatile boolean done = false;
        long iterations = 0;

        @Override
        public void run() {
            while (!done) {
                iterations++;
            }
        }

        public void shutdown() {
            done = true;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ControlledStop task = new ControlledStop();
        Thread t = new Thread(task);
        t.setDaemon(true);
        t.start();
        Thread.sleep(500);
        task.shutdown();
        t.join(2000);
        System.out.println(t.isAlive() ? "Worker is STILL running" : "Worker stopped");
    }
}
