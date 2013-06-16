package vessel;

import com.example.pcs.R;
import com.example.pcs.success;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class vespro extends Activity{

	Button b1,b2,b3,b4,submit,save,cancel;
	EditText vessel,imo,reg_no,agency_code,owner,o_email,weight,ins_comp,ins_date,pi_name,pi_date,gear_no,engine;
	Spinner vessel_type,sub_port,nation;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView (R.layout.vespro);
		
		submit=(Button) findViewById (R.id.button1);
		submit.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent success = new Intent (vespro.this, success.class );
				startActivity(success);
				
			}
			
		});
	}	
}
