package com.iceroe.linerlayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	private LinearLayout linearLayout;
	private EditText toEditText;
	private EditText subjectEditText;
	private EditText messageEditText;
	private Button sendButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		
		linearLayout = new LinearLayout(this);
		linearLayout.setPadding(16, 16, 16, 16);
		linearLayout.setOrientation(LinearLayout.VERTICAL);
		
		toEditText = new EditText(this);
		toEditText.setHint("To");
		
		subjectEditText = new EditText(this);
		subjectEditText.setHint("Subject");
		
		messageEditText = new EditText(this);
		messageEditText.setHint("Message");
		messageEditText.setGravity(Gravity.TOP);
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.MATCH_PARENT,
				LinearLayout.LayoutParams.WRAP_CONTENT
				);
		params.weight=1;
		messageEditText.setLayoutParams(params);
		
		sendButton = new Button(this);
		sendButton.setText("Send");
		LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.MATCH_PARENT,
				LinearLayout.LayoutParams.WRAP_CONTENT
				);
		params2.gravity=Gravity.RIGHT;
		sendButton.setLayoutParams(params2);
		
		linearLayout.addView(toEditText);
		linearLayout.addView(subjectEditText);
		linearLayout.addView(messageEditText);
		linearLayout.addView(sendButton);
		
		setContentView(linearLayout);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
