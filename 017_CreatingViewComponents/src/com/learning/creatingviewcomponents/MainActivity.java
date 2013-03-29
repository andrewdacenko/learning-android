package com.learning.creatingviewcomponents;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class MainActivity extends Activity implements OnClickListener {
	LinearLayout llMain;
	RadioGroup rgGravity;
	EditText etName;
	Button btnCreate;
	Button btnClear;
	int wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		llMain = (LinearLayout) findViewById(R.id.llMain);
		rgGravity = (RadioGroup) findViewById(R.id.rgGravity);
		etName = (EditText) findViewById(R.id.etName);
		btnCreate = (Button) findViewById(R.id.btnCreate);
		btnCreate.setOnClickListener(this);
		btnClear = (Button) findViewById(R.id.btnClear);
		btnClear.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
