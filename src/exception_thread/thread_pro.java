package exception_thread;

public class thread_pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String threadname = Thread.currentThread().getName();
		System.out.println("current thread name ="+ threadname);
		
		System.out.println("display current thread = "+Thread.currentThread());
		
		Thread t =new Thread();
		
		System.out.println(t);
		
		for (int i=1;i<=5;i++) {
			
			System.out.println(i);
			
		}

	}

}
