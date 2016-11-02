package pattern.observe.onclicklistener;

import java.util.Observable;
import java.util.Observer;

public class OnClickListener implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(o.getClass().getName());
		System.out.println(arg);
		
	}
	
}
