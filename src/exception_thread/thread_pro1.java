package exception_thread;



class ThreadNew  extends Thread{
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println("New thread");
			try {
				Thread.sleep(2000);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			
			}
		}
	}
}

public class thread_pro1 {

	public static void main(String[] args) throws InterruptedException{
		ThreadNew ob = new ThreadNew();
		ob.start();
		for(int i=1;i<=5;i++){
			System.out.println("main thread ");
			Thread.sleep(2000);
		}
		

	}

}
