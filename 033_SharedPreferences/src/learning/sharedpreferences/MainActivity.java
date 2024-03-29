package learning.sharedpreferences;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	EditText etText;
	Button btnSave, btnLoad;

	SharedPreferences sPref;

	final String SAVED_TEXT = "saved_text";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		etText = (EditText) findViewById(R.id.etText);

		btnSave = (Button) findViewById(R.id.btnSave);
		btnSave.setOnClickListener(this);

		btnLoad = (Button) findViewById(R.id.btnLoad);
		btnLoad.setOnClickListener(this);

		loadText();
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnSave:
			saveText();
			break;
		case R.id.btnLoad:
			loadText();
			break;
		default:
			break;
		}
	}

	void saveText() {
		sPref = getPreferences(MODE_PRIVATE);
		Editor ed = sPref.edit();
		ed.putString(SAVED_TEXT, etText.getText().toString());
		ed.commit();
		Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
	}

	void loadText() {
		sPref = getPreferences(MODE_PRIVATE);
		String savedText = sPref.getString(SAVED_TEXT, "");
		etText.setText(savedText);
		Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		saveText();
	}

}
