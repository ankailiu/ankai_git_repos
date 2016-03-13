package threads.test;
import java.util.concurrent.*;

/**
 *  Java5中，添加了障碍器类，为了适应一种新的设计需求，比如一个大型的任务，常常需要分配好多子任务去执行，只有当所有子任务都执行完成时候，才能执行主任务，这时候，就可以选择障碍器了。
 *	CountDownLatchu是所有子程序执行完以后，再执行主线程。关注的是主线程。
 *	CyclicBarrier是多有子线程都执行到某一点后，在继续执行。关注的是子线程。
 * @author Ankai Liu
 *
 */
public class CyclicBarrierTest {

	public static void main(String[] args) {
		CyclicBarrierTest test = new CyclicBarrierTest();
        // 创建障碍器，并设置MainTask为所有定数量的线程都达到障碍点时候所要执行的任务(Runnable)
        CyclicBarrier cb = new CyclicBarrier(7, test.new MainTask());
        test.new SubTask("A", cb).start();
        test.new SubTask("B", cb).start();
        test.new SubTask("C", cb).start();
        test.new SubTask("D", cb).start();
        test.new SubTask("E", cb).start();
        test.new SubTask("F", cb).start();
        test.new SubTask("G", cb).start();

	}
	
	
	/**
     * 主任务
     */
    class MainTask implements Runnable {
        public void run() {
            System.out.println(">>>>主任务执行了！<<<<");
        }
    }
 
    /**
     * 子任务
     */
    class SubTask extends Thread {
        private String name;
        private CyclicBarrier cb;
 
        SubTask(String name, CyclicBarrier cb) {
            this.name = name;
            this.cb = cb;
        }
 
        public void run() {
            System.out.println("[子任务" + name + "]开始执行了！");
            for (int i = 0; i < 999999; i++)
                ; // 模拟耗时的任务
            System.out.println("[子任务" + name + "]开始执行完成了，并通知障碍器已经完成！");
            try {
                // 通知障碍器已经完成
                cb.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

}
