package com.example.pcs;



import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.example.pcs.R;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

	public class login extends SherlockFragment {
		TextView registerScreen;
		Button login;
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			View view = inflater.inflate(R.layout.login, container, false);
			registerScreen = (TextView) view.findViewById(R.id.link_to_register);
	        // Listening to register new account link
	        registerScreen.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					// Switching to Register screen
					//Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
					//startActivity(i);
				}
			});
	        
	        login =(Button)view.findViewById(R.id.btnLogin);
	        login.setOnClickListener(new View.OnClickListener()
	        {
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent log = new Intent ( );
					startActivity(log);
				}
	        	
	        });
			
		return view;
		}
		
	   
	}
