package practiceday3unit5;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Mythread mt=new Mythread();
		mt.start();
	   synchronized (mt) {
		   System.out.println("main thread waiting for notification");
		   mt.wait();
		   System.out.println("main thread got the notificaion");
		   
		
	}
	  System.out.println(mt.num);
	}

}
