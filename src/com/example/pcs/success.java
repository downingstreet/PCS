package com.example.pcs;

import com.example.pcs.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

//TODO discard this activity and make it into just a dialogue box
public class success extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.success);
		new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent("loggedin.DASHBOARD");
                startActivity(i);
            }
        }, 2000);
	}
	
	

}
