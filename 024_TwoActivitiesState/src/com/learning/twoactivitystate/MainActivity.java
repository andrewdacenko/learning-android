package com.learning.twoactivitystate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	final String TAG = "States";
	Button btnActTwo;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnActTwo = (Button) findViewById(R.id.btnActTwo);
		btnActTwo.setOnClickListener(this);
		Log.d(TAG, "MainActivity: onCreate()");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(TAG, "MainActivity: onRestart()");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d(TAG, "MainActivity: onStart()");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d(TAG, "MainActivity: onResume()");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d(TAG, "MainActivity: onPause()");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d(TAG, "MainActivity: onStop()");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "MainActivity: onDestroy()");
	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(this, SecondActivity.class);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
