package loggedin;

import com.example.pcs.R;

import payment.payment_main;
import transport.transport_main;
import upload.upload_main;
import vcn.vcn_main;
import vessel.vessel_main;

import cargo.cargo_main;


import container.container_main;
import finance.finance_main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class dashboard extends Activity {
	
private String[] fields ={"Vessel","Container", "Finance", "Transport", "Cargo", "Upload", "VCN Link", "Payment"};
	
	protected void onCreate(Bundle savedInstanceState){
		 super.onCreate(savedInstanceState);
		 setContentView(R.layout.dashboard);
		 final ListView v = (ListView)findViewById(R.id.simpleList);
			
		 ArrayAdapter<String> adapter =
					new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fields);
				v.setAdapter(adapter);
				v.setOnItemClickListener(new OnItemClickListener() {

					public void onItemClick(AdapterView<?> arg0, View arg1,
							int pos, long arg3) {
						Object g = v.getItemAtPosition(pos);
						       if(g.toString().equals("Vessel")){
						   
							Intent i = new Intent();
							i.setClass(getApplicationContext(), vessel_main.class);
							startActivity(i);
						    
						}	
						       if(g.toString().equals("Container")){
								   
									Intent i = new Intent();
									i.setClass(getApplicationContext(), container_main.class);
									startActivity(i);
								    
								}		
						       
						       if(g.toString().equals("Finance")){
								   
									Intent i = new Intent();
									i.setClass(getApplicationContext(), finance_main.class);
									startActivity(i);
								    
								}	
						       
						       if(g.toString().equals("Transport")){
								   
									Intent i = new Intent();
									i.setClass(getApplicationContext(), transport_main.class);
									startActivity(i);
								    
								}	
						       
						       if(g.toString().equals("Cargo")){
								   
									Intent i = new Intent();
									i.setClass(getApplicationContext(), cargo_main.class);
									startActivity(i);
								    
								}	
						       
						       if(g.toString().equals("Upload")){
								   
									Intent i = new Intent();
									i.setClass(getApplicationContext(), upload_main.class);
									startActivity(i);
								    
								}	
						       
						       if(g.toString().equals("VCN Link")){
								   
									Intent i = new Intent();
									i.setClass(getApplicationContext(), vcn_main.class);
									startActivity(i);
								    
								}	
						       
						       if(g.toString().equals("Payment")){
								   
									Intent i = new Intent();
									i.setClass(getApplicationContext(), payment_main.class);
									startActivity(i);
								    
								}	
						       }
				
});
				
}
}