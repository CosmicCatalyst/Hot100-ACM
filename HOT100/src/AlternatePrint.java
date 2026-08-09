import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AlternatePrint {
    private static final Lock lock = new ReentrantLock();
    private static final Condition letterCondition = lock.newCondition();
    private static final Condition numberCondition = lock.newCondition();
    private static boolean isLetterTurn = true;
    public static void main(String[] args) {
        Thread letterThread = new Thread(() -> {
            for (char c = 'A'; c <= 'Z'; c++) {
                lock.lock();
                try {
                    while (!isLetterTurn) {
                        letterCondition.await();
                    }
                    System.out.print(c + " ");
                    isLetterTurn = false;
                    numberCondition.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });
        Thread numberThread = new Thread(() -> {
            for (int i = 1; i <= 26; i++) {
                lock.lock();
                try {
                    while (isLetterTurn) {
                        numberCondition.await();
                    }
                    System.out.print(i + " ");
                    isLetterTurn = true;
                    letterCondition.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });
        letterThread.start();
        numberThread.start();
    }
}
