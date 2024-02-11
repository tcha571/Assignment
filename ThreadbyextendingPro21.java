/*
 * WAP to create one thread by extending Thread class in another
Class
 */
package AssignmentModule3;


class TDemo extends Thread
{

	public void run() {
		// TODO Auto-generated method stub
	for (int i = 0; i < 5; i++) {
		System.out.println("This is Tdemo thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	}

}
    public class ThreadbyextendingPro21 {

	public static void main(String[] args) {
		TDemo td= new TDemo();
		td.start();
		for(int i =0;i<5;i++)
		{
		System.out.println("this is main thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		e.printStackTrace();
		}

		}  

	}

}

