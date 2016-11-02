package pattern.observe.onclicklistener;

import java.util.Observable;
import java.util.Observer;

public class Client_Click {

	public static void main(String[] args) {
		TextView textView = new TextView();
		
		
		textView.addObserver(new Observer() {
			
			@Override
			public void update(Observable o, Object arg) {
				System.out.println("return");
				
			}
		});
		textView.addObserver(new OnClickListener(){

			@Override
			public void update(Observable o, Object arg) {
				// TODO Auto-generated method stub
				super.update(o, arg);
			}
			
		});
		textView.click();
	}
}
