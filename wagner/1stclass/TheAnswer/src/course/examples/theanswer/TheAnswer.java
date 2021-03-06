package course.examples.theanswer;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class TheAnswer extends Activity {

	public static final int[] answers = { 42, -10, 0, 100, 1000 };
	public static final int answer = 42;
	
	private static final String TAG = "TheAnswer";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		// Required call through to Activity.onCreate()
		// Restore any saved instance state
		super.onCreate(savedInstanceState);

		// Set up the application's user interface (content view)
		setContentView(R.layout.answer_layout);

		// Get a reference to a TextView in the content view
		TextView answerView = (TextView) findViewById(R.id.answer_view);

		int val = findAnswer();
		String output = (val == answer) ? "42" : "We may never know";
		Log.d(TAG, output);
		// Set desired text in answerView TextView
		answerView
				.setText("The answer to life, the universe and everything is:\n\n"
						+ output);
		Log.i(TAG, output);
	}

	private int findAnswer() {
		for (int val : answers) {
			if (val == answer)
				return val;
		}
		return -1;
	}
}
