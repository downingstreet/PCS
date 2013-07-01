package vessel;



import mmd.mmdinp;
import mmd.mmdvdo_mmdvro;

import com.example.pcs.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class mmd extends Activity{
	
	private String[] mmd_list={"Inspection Report","Vessel Detention Order/Release Order"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.arraylist);
		 final ListView v = (ListView)findViewById(R.id.simpleList);
			
		 ArrayAdapter<String> adapter =
			    new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mmd_list);
				v.setAdapter(adapter);
				v.setOnItemClickListener(new OnItemClickListener() {

					public void onItemClick(AdapterView<?> arg0, View arg1,int pos, long arg3) {
						Object g = v.getItemAtPosition(pos);
						
						if(g.toString().equals("Inspection Report")){
						   
							Intent i = new Intent();
							i.setClass(mmd.this, mmdinp.class);
							startActivity(i);
						    }	
						       
						if(g.toString().equals("Vessel Detention Order/Release Order")){
								   
									Intent i = new Intent();
									i.setClass(mmd.this, mmdvdo_mmdvro.class);
									startActivity(i);
							}	
			       }
				
});

	}
	
	

}
