package vessel;

import com.example.pcs.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class vessel_main extends Activity {
	
private String[] vessel_list={"Vessel Profile List","Voyage List/VCN","Passengers/ Crew List", "Berth Request/Allotment", "Dangerous Goods Ack", "Un-Berthing/ Re-Berthing", "Resourse Requisition/Allotment", "Stowage Plan", "Terminal Performance Report", "Stowage Instruction", "Bay Plan", "Vessel Movement" , "Pilot Memo", "Pre-Arrival", "MMD Inspection", "PHO", "Expected Timings", "Change of Agency", "Stowage Plan for Cargo"};
	
	protected void onCreate(Bundle savedInstanceState){
			 super.onCreate(savedInstanceState);
			 setContentView(R.layout.dashboard);
			 final ListView v = (ListView)findViewById(R.id.simpleList);
				
			 ArrayAdapter<String> adapter =
						new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, vessel_list);
					v.setAdapter(adapter);
					v.setOnItemClickListener(new OnItemClickListener() {

						public void onItemClick(AdapterView<?> arg0, View arg1,
								int pos, long arg3) {
							Object g = v.getItemAtPosition(pos);
							       if(g.toString().equals("Vessel Profile List")){
							   
								Intent i = new Intent();
								i.setClass(vessel_main.this, vespro.class);
								
								startActivity(i);
							    
							}	
							       if(g.toString().equals("Voyage List/VCN")){
									   
										Intent i = new Intent();
										i.setClass(vessel_main.this, calinf_calinv.class);
										
										startActivity(i);
									    
									}	
							      	
							       if(g.toString().equals("Passengers/ Crew List")){
									   
										Intent i = new Intent();
										i.setClass(vessel_main.this, paxlst.class);
										
										startActivity(i);
									    
									}	
							       
							       if(g.toString().equals("Berth Request/Allotment")){
									   
										Intent i = new Intent();
										i.setClass(vessel_main.this, berman_beralt.class);
										
										startActivity(i);
									    
									}	
							       
							       if(g.toString().equals("Dangerous Goods Ack")){
									   
										Intent i = new Intent();
										i.setClass(vessel_main.this, iftdgn_dgnack.class);
										
										startActivity(i);
									    
									}	
							       
							       if(g.toString().equals("Un-Berthing/ Re-Berthing")){
									   
										Intent i = new Intent();
										i.setClass(vessel_main.this, unbert.class);
										
										startActivity(i);
									    
									}	
							       
							       if(g.toString().equals("Resourse Requisition/Allotment")){
									   
										Intent i = new Intent();
										i.setClass(vessel_main.this, resreq_alores.class);
										
										startActivity(i);
									    
									}	
							       
							       if(g.toString().equals("Stowage Plan")){
									   
										Intent i = new Intent();
										i.setClass(vessel_main.this, stopln.class);
										
										startActivity(i);
									    
									}	
							       
							       if(g.toString().equals("Bay Plan")){
									   
										Intent i = new Intent();
										i.setClass(vessel_main.this, baplie.class);
										
										startActivity(i);
									    
									}	
							       
							       if(g.toString().equals("Vessel Movement")){
									   
										Intent i = new Intent();
										i.setClass(vessel_main.this, vesdep.class);
										
										startActivity(i);
									    
									}	
							       
							       if(g.toString().equals("Pilot Memo")){
									   
										Intent i = new Intent();
										i.setClass(vessel_main.this, pltmem_ackplm.class);
										
										startActivity(i);
									    
									}	
							       
							       if(g.toString().equals("Pre-Arrival")){
									   
										Intent i = new Intent();
										i.setClass(vessel_main.this, paisps.class);
										
										startActivity(i);
									    
									}	
							       
							       if(g.toString().equals("MMD Inspection")){
									   
										Intent i = new Intent();
										i.setClass(vessel_main.this, mmd.class);
										
										startActivity(i);
									    
									}	
							       
							       if(g.toString().equals("PHO")){
									   
										Intent i = new Intent();
										i.setClass(vessel_main.this, pho.class);
										
										startActivity(i);
									    
									}	
							       
							       if(g.toString().equals("Expected Timings")){
									   
										Intent i = new Intent();
										i.setClass(vessel_main.this, etaetd_acktad.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Change of Agency")){
									   
										Intent i = new Intent();
										i.setClass(vessel_main.this, agnchg.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Stowage Plan for Cargo")){
									   
										Intent i = new Intent();
										i.setClass(vessel_main.this, stpcgo.class);
										
										startActivity(i);
									    
									}
							       
							       }
					
	});
					
	}




}
