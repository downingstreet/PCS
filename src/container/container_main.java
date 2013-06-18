package container;

import com.example.pcs.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class container_main extends Activity {
	
private String[] container_list={"Loading/ Dischage Report","Gate Open Report","Empty Container Release Order", "Stock Report", "Equipment Interchange Report", "Job Order", "Load Plan", "Special Handling Order", "Stuffing/De-Stuffing Order", "Advance Container List", "Stuffing/ De-Stuffing Confirmation", "Carting Request/ Confirmation" , "Gate-In/ Gate-out Report"};
	
	protected void onCreate(Bundle savedInstanceState){
			 super.onCreate(savedInstanceState);
			 setContentView(R.layout.arraylist);
			 final ListView v = (ListView)findViewById(R.id.simpleList);
				
			 ArrayAdapter<String> adapter =
						new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, container_list);
					v.setAdapter(adapter);
					v.setOnItemClickListener(new OnItemClickListener() {

						public void onItemClick(AdapterView<?> arg0, View arg1,
								int pos, long arg3) {
							Object g = v.getItemAtPosition(pos);
							       if(g.toString().equals("Loading/ Dischage Report")){
							   
								Intent i = new Intent();
								i.setClass(container_main.this, coarri.class);
								
								startActivity(i);
							    
							}	
							       if(g.toString().equals("Gate Open Report")){
									   
										Intent i = new Intent();
										i.setClass(container_main.this, gocofr.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Empty Container Release Order")){
									   
										Intent i = new Intent();
										i.setClass(container_main.this, coparn.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Stock Report")){
									   
										Intent i = new Intent();
										i.setClass(container_main.this, coedor.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Equipment Interchange Report")){
									   
										Intent i = new Intent();
										i.setClass(container_main.this, eicrep.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Job Order")){
									   
										Intent i = new Intent();
										i.setClass(container_main.this, jobord.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Load Plan")){
									   
										Intent i = new Intent();
										i.setClass(container_main.this, clpmsg.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Special Handling Order")){
									   
										Intent i = new Intent();
										i.setClass(container_main.this, cohaor.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Stuffing/De-Stuffing Order")){
									   
										Intent i = new Intent();
										i.setClass(container_main.this, costor.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Advance Container List")){
									   
										Intent i = new Intent();
										i.setClass(container_main.this, coprar.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Stuffing/ De-Stuffing Confirmation")){
									   
										Intent i = new Intent();
										i.setClass(container_main.this, costco.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Carting Request/ Confirmation")){
									   
										Intent i = new Intent();
										i.setClass(container_main.this, carreq_carcfn.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Gate-In/ Gate-out Report")){
									   
										Intent i = new Intent();
										i.setClass(container_main.this, codeco.class);
										
										startActivity(i);
									    
									}
							       }
					
	});
					
	}




}
