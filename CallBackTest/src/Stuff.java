
public class Stuff {
	private CallBackInterface callBackInterface = null;
	
	public void setCallBack(CallBackInterface callBackInterface){
		this.callBackInterface = callBackInterface;
	}
	
	public void doSomething(){
		for(int i = 0; i<5; i++){
			System.out.println("完成第"+i+"件事情");
		}
		callBackInterface.execute();
	}
}
