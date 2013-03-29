package com.learning.clicklistener;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	TextView tvOut;
	Button btnOk;
	Button btnCancel;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// найдем View-элементы
		tvOut = (TextView) findViewById(R.id.tvOut);
		btnOk = (Button) findViewById(R.id.btnOk);
		btnCancel = (Button) findViewById(R.id.btnCancel);

		btnOk.setOnClickListener(this);
		btnCancel.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// создание обработчика
		// по id определеяем кнопку, вызвавшую этот обработчик
		switch (v.getId()) {
		case R.id.btnOk:
			// кнопка ОК
			tvOut.setText("Нажата кнопка ОК");
			break;
		case R.id.btnCancel:
			// кнопка Cancel
			tvOut.setText("Нажата кнопка Cancel");
			break;
		}

	}
}
