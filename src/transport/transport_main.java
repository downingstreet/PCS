package transport;

import com.example.pcs.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class transport_main extends Activity {
	
private String[] transport_list={"Removal Memo from Rake","Inland Way Bill","Pendency of Containers", "Train Schedule"};
	
	protected void onCreate(Bundle savedInstanceState){
			 super.onCreate(savedInstanceState);
			 setContentView(R.layout.dashboard);
			 final ListView v = (ListView)findViewById(R.id.simpleList);
				
			 ArrayAdapter<String> adapter =
						new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, transport_list);
					v.setAdapter(adapter);
					v.setOnItemClickListener(new OnItemClickListener() {

						public void onItemClick(AdapterView<?> arg0, View arg1,
								int pos, long arg3) {
							Object g = v.getItemAtPosition(pos);
							       
							if(g.toString().equals("Removal Memo from Rake")){
							   
								Intent i = new Intent();
								i.setClass(transport_main.this, rmlmem.class);
								
								startActivity(i);
							    
							}	
							   
							       if(g.toString().equals("Inland Way Bill")){
									   
										Intent i = new Intent();
										i.setClass(transport_main.this, copino.class);
										
										startActivity(i);
									    
									}	
							       
							       if(g.toString().equals("Pendency of Containers")){
									   
										Intent i = new Intent();
										i.setClass(transport_main.this, contpe.class);
										
										startActivity(i);
									    
									}	
							       
							       if(g.toString().equals("Train Schedule")){
									   
										Intent i = new Intent();
										i.setClass(transport_main.this, railsc.class);
										
										startActivity(i);
									    
									}	
							    }
					
	});
					
	}




}
