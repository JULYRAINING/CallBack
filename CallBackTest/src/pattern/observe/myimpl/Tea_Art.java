package pattern.observe.myimpl;

public class Tea_Art implements Observer{

	private String name = "������ʦ��";
	@Override
	public void update(Observable observable, Object object) {
		String question = (String) object;
		if(question.equals("Ī�ε�˯�������������Ʒ��")){
			System.out.println(name +"��������һϵ�е���Ʒ");
		}else {
			System.out.println(name +"�Ҳ�̫����� ������������ʦ");
		}
		
	}
	
}
