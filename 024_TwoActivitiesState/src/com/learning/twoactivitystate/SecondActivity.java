package com.learning.twoactivitystate;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class SecondActivity extends Activity {

	final String TAG = "States";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);
		Log.d(TAG, "SecondActivity: onCreate()");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(TAG, "SecondActivity: onRestart()");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d(TAG, "SecondActivity: onStart()");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d(TAG, "SecondActivity: onResume()");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d(TAG, "SecondActivity: onPause()");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d(TAG, "SecondActivity: onStop()");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "SecondActivity: onDestroy()");
	}

}
