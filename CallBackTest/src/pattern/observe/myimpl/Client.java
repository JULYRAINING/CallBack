package pattern.observe.myimpl;

public class Client {
	
	public static void main(String[] args) {
		
		Stu stu = new Stu();
		
		Tea_Math tea_Math = new Tea_Math();
		Tea_Art tea_Art = new Tea_Art();
		
		stu.addObserver(tea_Math);
		stu.addObserver(tea_Art);
		
		stu.ask("������˵�������ʲô�أ�");
		
		stu.ask("Ī�ε�˯�������������Ʒ��");
	}
	
}
