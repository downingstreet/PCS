package com.example.pcs;

import com.actionbarsherlock.app.SherlockFragment;
import com.example.pcs.R;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends SherlockFragment implements OnClickListener {
	TextView registerScreen;
	Button login;
	EditText username;
	EditText pass;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.login, container, false);
		
		username = (EditText) view.findViewById(R.id.text_user);
		pass = (EditText) view.findViewById(R.id.text_pwd);
		login = (Button) view.findViewById(R.id.btnLogin);
		login.setOnClickListener(this);
		
		return view;
		}
	
	@Override
	public void onSaveInstanceState(Bundle outState)
	{
	    super.onSaveInstanceState(outState);
	    outState.putString("DO NOT CRASH", "OK");
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
								
		
		case R.id.btnLogin : 
			Log.d("username : " , username.getText().toString());
			Log.d("pass : " , pass.getText().toString());
			if(username.getText().toString().equals("admin") && pass.getText().toString().equals("admin")){
			Intent i = new Intent(getActivity(), success.class);
								startActivity(i);
								
			}
			else{
				Toast.makeText(getActivity().getApplicationContext(),"incorrect user/pass", Toast.LENGTH_SHORT).show();
				Log.d("login.java" , "after toast");
				
			}
				break;
		}
	}

}
