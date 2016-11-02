package listener;

public class TextView {
	
	private OnClickListener onClickListener;
	
	public void setOnClickListener(OnClickListener onClickListener){
		this.onClickListener = onClickListener;
		
		
	}
	
	public void click(){
		onClickListener.onClick("textview", 1);
	}

	
	
	
}
