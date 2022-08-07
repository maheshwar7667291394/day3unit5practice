package practiceday3unit5;

public class Mythread extends Thread{
	int num=0;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("child thread performing calculation sum");
			for(int i=0;i<100;i++) {
				num+=i;
			}
			System.out.println("child thread give the notification ");
			this.notify();
			
		}
	}
	

}
