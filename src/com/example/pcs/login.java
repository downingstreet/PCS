package com.example.pcs;

import com.actionbarsherlock.app.SherlockFragment;
import com.example.pcs.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class login extends SherlockFragment implements OnClickListener {
	TextView registerScreen;
	Button login;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.login, container, false);
		
		
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
		
		case R.id.btnLogin : Intent i = new Intent(getActivity(), success.class);
								startActivity(i);
								break;

		}
	}

}
