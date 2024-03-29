package com.learning.simpleanimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends Activity {

	// ��������� ��� ID ������� ����
	final int MENU_ALPHA_ID = 1;
	final int MENU_SCALE_ID = 2;
	final int MENU_TRANSLATE_ID = 3;
	final int MENU_ROTATE_ID = 4;
	final int MENU_COMBO_ID = 5;
	TextView tv;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.tv);
		// ������������ ����������� ���� ��� ���������� tv
		registerForContextMenu(tv);
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.tv:
			// ��������� ������
			menu.add(0, MENU_ALPHA_ID, 0, "alpha");
			menu.add(0, MENU_SCALE_ID, 0, "scale");
			menu.add(0, MENU_TRANSLATE_ID, 0, "translate");
			menu.add(0, MENU_ROTATE_ID, 0, "rotate");
			menu.add(0, MENU_COMBO_ID, 0, "combo");
			break;
		}
		super.onCreateContextMenu(menu, v, menuInfo);
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		Animation anim = null;
		// ���������� ����� ����� ��� �����
		switch (item.getItemId()) {
		case MENU_ALPHA_ID:
			// ������� ������ �������� �� ����� anim/myalpha
			anim = AnimationUtils.loadAnimation(this, R.anim.myalpha);
			break;
		case MENU_SCALE_ID:
			anim = AnimationUtils.loadAnimation(this, R.anim.myscale);
			break;
		case MENU_TRANSLATE_ID:
			anim = AnimationUtils.loadAnimation(this, R.anim.mytrans);
			break;
		case MENU_ROTATE_ID:
			anim = AnimationUtils.loadAnimation(this, R.anim.myrotate);
			break;
		case MENU_COMBO_ID:
			anim = AnimationUtils.loadAnimation(this, R.anim.mycombo);
			break;
		}
		// ��������� �������� ��� ���������� tv
		tv.startAnimation(anim);
		return super.onContextItemSelected(item);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
