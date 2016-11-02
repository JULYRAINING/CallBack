package listener;

public class Client_Click {

	public static void main(String[] args) {
		TextView textView = new TextView();
		textView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(String view, int position) {
				System.out.println(view);
				System.out.println(position);
			}
		});
		textView.click();
	}
}
