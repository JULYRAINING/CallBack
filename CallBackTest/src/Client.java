
public class Client {
	public static void main(String[] args) {
		Stuff stuff = new Stuff();
		
		Boss boss = new Boss();
		
		stuff.setCallBack(boss);
		
		stuff.doSomething();
		new Client().a("", "");
	}
	public void a(String ...a){
		
	}
}
