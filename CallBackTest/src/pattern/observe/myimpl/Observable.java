package pattern.observe.myimpl;

import java.util.Vector;

/**
 * �̲߳���ȫ����Ҫ���ƣ� ����Ҫ����
 * @author TF
 *
 */
public abstract class Observable {

	private Vector<Observer>observers = new Vector<>();
	private boolean isChanged;
	
	public void addObserver(Observer observer){
		observers.add(observer);
	}
	
	public void setChanged(){
		isChanged = true;
	}
	public void notifyObservers(Object object){
		if (isChanged) {
			observers.forEach(observer -> observer.update(this, object));
			isChanged = false;
		}
		
		
	}
}
