package cargo;


import com.example.pcs.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class cargo_main extends Activity {
	
private String[] transport_list={"Application for Log Entry/Grant of Log Entry","Mate Recipt","Bill of Lading/Agent Delivery Order"};
	
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
							       
							if(g.toString().equals("Application for Log Entry/Grant of Log Entry")){
							   
								Intent i = new Intent();
								i.setClass(cargo_main.this, rloent_gloent.class);
								
								startActivity(i);
							    
							}
							
							if(g.toString().equals("Mate Recipt")){
								   
								Intent i = new Intent();
								i.setClass(cargo_main.this, matrec.class);
								
								startActivity(i);
							    
							}
							
							if(g.toString().equals("Bill of Lading/Agent Delivery Order")){
								   
								Intent i = new Intent();
								i.setClass(cargo_main.this, agdord.class);
								
								startActivity(i);
							    
							}
							    }
					
	});
					
	}




}
