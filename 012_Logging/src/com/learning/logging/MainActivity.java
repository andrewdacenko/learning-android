package com.learning.logging;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	TextView tvOut;
	Button btnOk;
	Button btnCancel;

	private static final String TAG = "myLogs";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// найдем View-элементы
		Log.d(TAG, "найдем View-элементы");
		tvOut = (TextView) findViewById(R.id.tvOut);
		btnOk = (Button) findViewById(R.id.btnOk);
		btnCancel = (Button) findViewById(R.id.btnCancel);

		// присваиваем обработчик кнопкам
		Log.d(TAG, "присваиваем обработчик кнопкам");
		btnOk.setOnClickListener(this);
		btnCancel.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// по id определяем кнопку, вызвавшую этот обработчик
		Log.d(TAG, "по id определяем кнопку, вызвавшую этот обработчик");
		switch (v.getId()) {
		case R.id.btnOk:
			// кнопка ОК
			Log.d(TAG, "кнопка ОК");
			tvOut.setText("Нажата кнопка ОК");
			Toast.makeText(this, "Нажата кнопка ОК", Toast.LENGTH_LONG).show();
			break;
		case R.id.btnCancel:
			// кнопка Cancel
			Log.d(TAG, "кнопка Cancel");
			tvOut.setText("Нажата кнопка Cancel");
			Toast.makeText(this, "Нажата кнопка Cancel", Toast.LENGTH_LONG)
					.show();
			break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
