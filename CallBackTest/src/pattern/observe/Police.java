package pattern.observe;

import java.util.Observable;
import java.util.Observer;

public class Police implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(String.format("The prison %s was run away", arg));
	}

}
