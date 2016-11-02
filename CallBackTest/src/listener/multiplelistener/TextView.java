package listener.multiplelistener;

import java.util.Vector;

public class TextView {
	
	private Vector<OnClickListener> onClickListeners = new Vector<>();
	
	public void addOnClickListener(OnClickListener onClickListener){
		this.onClickListeners.add(onClickListener);
		
		
	}
	
	public void click(){
		onClickListeners.forEach(onClickListener -> onClickListener.onClick("view", 1));
		
		
	}
	
	
}
