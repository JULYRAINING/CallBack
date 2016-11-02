package pattern.observe.myimpl;

public class Stu extends Observable{
	
	public void ask(String question){
		System.out.println("question:" + question);
		setChanged();
		notifyObservers(question);
	}
}
