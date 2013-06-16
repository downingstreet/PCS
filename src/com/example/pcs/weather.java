package com.example.pcs;


import com.actionbarsherlock.app.SherlockFragment;
import com.example.pcs.R;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class weather extends SherlockFragment{
    
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.weather, container, false);
		return view;
	}
	
}
