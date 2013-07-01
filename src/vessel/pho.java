package vessel;

import pho.pho_1;
import pho.pho_2;

import com.example.pcs.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class pho extends Activity{
	
	private String[] pho_list={"Health Declaration","Free Pratique"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.arraylist);
		 final ListView v = (ListView)findViewById(R.id.simpleList);
			
		 ArrayAdapter<String> adapter =
			    new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pho_list);
				v.setAdapter(adapter);
				v.setOnItemClickListener(new OnItemClickListener() {

					public void onItemClick(AdapterView<?> arg0, View arg1,int pos, long arg3) {
						Object g = v.getItemAtPosition(pos);
						
						if(g.toString().equals("Health Declaration")){
						   
							Intent i = new Intent();
							i.setClass(pho.this, pho_1.class);
							startActivity(i);
						    }	
						       
						if(g.toString().equals("Free Pratique")){
								   
									Intent i = new Intent();
									i.setClass(pho.this, pho_2.class);
									startActivity(i);
							}	
			       }
				
});

	}
	
	

}
