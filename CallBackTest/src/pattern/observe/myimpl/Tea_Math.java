package pattern.observe.myimpl;

public class Tea_Math implements Observer{

	private String name = "��ѧ��ʦ��";
	@Override
	public void update(Observable observable, Object object) {
		String question = (String) object;
		if(question.equals("������˵�������ʲô�أ�")){
			System.out.println(name +"��ĳ�ֽǶ���˵�� ������ı任");
		}else {
			System.out.println(name +"�Ҳ�̫����� ������������ʦ");
		}
		
	}
	
}
