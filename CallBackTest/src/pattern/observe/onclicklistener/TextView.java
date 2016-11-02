package pattern.observe.onclicklistener;

import java.util.Observable;

public class TextView extends Observable{
	
	private String name = "first TextView";

	public void click(){
		setChanged();
		notifyObservers(name);
	}
	
	
}
