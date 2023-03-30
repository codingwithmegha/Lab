package lab_9Mar_30;
class ListLoader{
	 int array[];
	public void loadList(int startNumber, int lastNumber) {
		for(int i=startNumber; i<=lastNumber; i++) {
			try {
				Thread.sleep(50);
			}
			catch(Exception e) {
				}
		}
	}
}
class LoaderThread implements Runnable{
	ListLoader ld;
	int startNumber;
	int lastNumber;
	int array[];
	LoaderThread(int startNumber,int lastNumber,int array[]){
		this.startNumber=startNumber;
		this.lastNumber=lastNumber;
		this.array=array;
	}
	public void run() {
	    for(int i=startNumber; i<=lastNumber; i++) {
	    	array[i]=i;
	    }
	}
}
public class MainThread{
public static void main(String[] args) throws InterruptedException{
	ListLoader ld=new ListLoader();
	long startTime=System.currentTimeMillis();
	System.out.println("StartTime: "+startTime);
	ld.loadList(0,100);
	 long endTime=System.currentTimeMillis();
	 System.out.println("EndTime: "+endTime);
  System.out.println("Time taken in miliseconds"+(endTime-startTime));
	 int array[]=new int[1000];
	LoaderThread l1=new LoaderThread(0,50,array);
	LoaderThread l2=new LoaderThread(50,100,array);
 Thread thread1=new Thread(l1);
 Thread thread2=new Thread(l2);
 thread1.start();
 thread2.start();
 thread1.join();
 thread2.join();
	
}
}
