
import java.util.*;
/**
 *Class Mytask's purpose is to get user input using multithreading. 
 */
class Mytask extends Thread {
	char s;
	public void run(){
		Scanner sc = new Scanner(System.in);
		boolean ex = false;

		while(ex==false) {
			s = sc.next().charAt(0);

			if(s=='z'){
					ex=true;
			}
		}
	}
	/**
	 *This method returns the user's input
	 */
	public char Input() {
	return s;
	}
}
