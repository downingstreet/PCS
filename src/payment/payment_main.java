package payment;

import com.example.pcs.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class payment_main extends Activity {
	
private String[] payment_list={"Make Payment","Top Up PD","Verify Payment"};
	
	protected void onCreate(Bundle savedInstanceState){
			 super.onCreate(savedInstanceState);
			 setContentView(R.layout.dashboard);
			 final ListView v = (ListView)findViewById(R.id.simpleList);
				
			 ArrayAdapter<String> adapter =
						new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, payment_list);
					v.setAdapter(adapter);
					v.setOnItemClickListener(new OnItemClickListener() {

						public void onItemClick(AdapterView<?> arg0, View arg1,
								int pos, long arg3) {
							Object g = v.getItemAtPosition(pos);
							       
							if(g.toString().equals("Make Payment")){
							   
								Intent i = new Intent();
								i.setClass(payment_main.this, make_pay.class);
								
								startActivity(i);
							    
							}
							
							if(g.toString().equals("Top Up PD")){
								   
								Intent i = new Intent();
								i.setClass(payment_main.this, top_up.class);
								
								startActivity(i);
							    
							}

							if(g.toString().equals("Verify Payment")){
								   
								Intent i = new Intent();
								i.setClass(payment_main.this, verify.class);
								
								startActivity(i);
							    
							}

							
							
							    }
					
	});
					
	}




}
