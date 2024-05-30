import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

class Solution {
    
    public static void peek100(Queue<Integer> progress, 
                                         Queue<Integer> speed, 
                                         int cycle, 
                                         Stack<Integer> done) {
		while (!progress.isEmpty() && progress.peek() >= 100) {
	        progress.poll();
	        speed.poll();
	        done.push(cycle);
		}
	}
	
	public static int[] setResult(Stack<Integer> calc) {
		int[] result = new int[calc.size()];
		int i = 0;
		while(!calc.isEmpty()) {
			result[i++] = calc.pop();
		}
		return result;
	}
	
    public int[] solution(int[] progresses, int[] speeds) {
		int cycle = 0;
		int i = 0;
		Queue<Integer> progress = new LinkedList<Integer>();
		Queue<Integer> speed  = new LinkedList<Integer>();
		Stack<Integer> done = new Stack<Integer>();
		Stack<Integer> calc = new Stack<Integer>();
		
		for(int idx = 0; idx < progresses.length; idx++) {
			progress.offer(progresses[idx]);
			speed.offer(speeds[idx]);
		}
		
		while(!progress.isEmpty()) {
			for(int idx = 0; idx < progress.size(); idx++) {
				int spd = speed.poll();
				int now = progress.poll() + spd;
				progress.offer(now);
				speed.offer(spd);
			}
            cycle++;
			if(progress.peek() >= 100)
			    peek100(progress, speed, cycle, done);
		}
		int cycles = done.peek();
		
		while(!done.isEmpty()) {
			// System.out.println(cycles);
			if(cycles == done.peek()) {
				i++;
				done.pop();
				// System.out.println("i++");
			}else {
				calc.push(i);
				// System.out.println(i);
				cycles = done.peek();
				i = 0;
			}
		}
		calc.push(i);
		
		return setResult(calc);
    }   
}
/*
큐 2개, 스택 1개 생성
progress queue
run queue
done stack

while(!progress.isEmpty())
    progress >poll> a + speed >= 100 ? >push> done(count) : >offer> progress
*/