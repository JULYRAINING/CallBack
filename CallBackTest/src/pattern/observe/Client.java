package pattern.observe;

public class Client {
	public static void main(String[] args) {
		Police police = new Police();
		Prison prison = new Prison();
		prison.addObserver(police);
		prison.escape();
	}
}
