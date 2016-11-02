package pattern.observe;

import java.util.Observable;

public class Prison extends Observable{

	private String name = "Katherine";
	public void  escape(){
		setChanged();
		notifyObservers(name);
	}
}
