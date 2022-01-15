class SharedBoard {
	private int sum = 0; // 집계판의 합 
	//synchronized public void add() {
	synchronized public void add() {
		int n = sum;
		/* 현재 실행 중인 스레드 양보
		 * -> 스레드의 실행 속도가 빠르기 때문에 충돌 발생이 쉽지 않음 
		 *    고의로 충돌을 발생시키기 위해 yield()호출함 
		 */
		Thread.yield();
		
		n += 10;
		sum = n;	// 증가한 값을 집계합에 기록 
		System.out.println(Thread.currentThread().getName() 
							+" : " + sum);
	}
	public int getSum() {return sum;}	
}

class StudentThread extends Thread {
	private SharedBoard board;
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	@Override
	public void run() {	
		for(int i=0; i<10; i++)
			board.add();
	}	
}

public class SynchronizedEx {
	public static void main(String[] args) {
		SharedBoard board = new SharedBoard();
		Thread t1 = new StudentThread("Kitae", board);
		Thread t2 = new StudentThread("Hyosoo", board);
		
		t1.start();
		t2.start();
	}

}
