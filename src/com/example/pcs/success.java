package com.example.pcs;

import com.actionbarsherlock.app.SherlockActivity;
import com.example.pcs.R;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;

//TODO discard this activity and make it into just a dialogue box
public class success extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.success);
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {

				Intent i = new Intent("loggedin.DASHBOARD");
				startActivity(i);
				finish();
			}
		}, 2000);
	}

	/*@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			
		}
		return super.onKeyDown(keyCode, event);
	}
	*/
	

}
