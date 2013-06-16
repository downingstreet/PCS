package finance;

import com.example.pcs.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class finance_main extends Activity {
	
private String[] finance_list={"Assessment-Vessel Charges","Assessment-Stevedore Charges","Assessment-Cargo Charges", "Assessment-Container Charges", "Assessment-Container-Cargo Charges", "Confirmation Assessment", "PD Account Balance Details", "Daily Transaction Summary", "Invoice", "Invoice Report"};
	
	protected void onCreate(Bundle savedInstanceState){
			 super.onCreate(savedInstanceState);
			 setContentView(R.layout.dashboard);
			 final ListView v = (ListView)findViewById(R.id.simpleList);
				
			 ArrayAdapter<String> adapter =
						new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, finance_list);
					v.setAdapter(adapter);
					v.setOnItemClickListener(new OnItemClickListener() {

						public void onItemClick(AdapterView<?> arg0, View arg1,
								int pos, long arg3) {
							Object g = v.getItemAtPosition(pos);
							       if(g.toString().equals("Assessment-Vessel Charges")){
							   
								Intent i = new Intent();
								i.setClass(finance_main.this, reqvac.class);
								
								startActivity(i);
							    
							}	
							       if(g.toString().equals("Assessment-Stevedore Charges")){
									   
										Intent i = new Intent();
										i.setClass(finance_main.this, reqsac.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Assessment-Cargo Charges")){
									   
										Intent i = new Intent();
										i.setClass(finance_main.this, reqcac.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Assessment-Container Charges")){
									   
										Intent i = new Intent();
										i.setClass(finance_main.this, reqctc.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Assessment-Container-Cargo Charges")){
									   
										Intent i = new Intent();
										i.setClass(finance_main.this, reqcoc.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Confirmation Assessment")){
									   
										Intent i = new Intent();
										i.setClass(finance_main.this, cnfasc.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("PD Account Balance Details")){
									   
										Intent i = new Intent();
										i.setClass(finance_main.this, pdabal.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Daily Transaction Summary")){
									   
										Intent i = new Intent();
										i.setClass(finance_main.this, dlysum.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Invoice")){
									   
										Intent i = new Intent();
										i.setClass(finance_main.this, invoice.class);
										
										startActivity(i);
									    
									}
							       
							       if(g.toString().equals("Invoice Report")){
									   
										Intent i = new Intent();
										i.setClass(finance_main.this, invoice_report.class);
										
										startActivity(i);
									    
									}
							       
							    }
					
	});
					
	}




}
