/*
 * WAP to create one thread by implementing Runnable interface in
Class
 */
package AssignmentModule3;
class First implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("This is First Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}
	
}
public class ThreadbyimplementingrunnablePro20 {

	public static void main(String[] args) {
		First f1=new First();
		Thread t1= new Thread();
		t1.setName("twinkle");
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1);
		t1.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("This is Main Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
