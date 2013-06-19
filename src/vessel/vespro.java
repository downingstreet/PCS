package vessel;

import com.example.pcs.R;
import com.example.pcs.success;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class vespro extends Activity {

	Button submit, save, cancel;
	EditText vessel_name, imo_number, sr_certificate_no, agency_code,
			owner_name, owner_email, nationality, vessel_weight,vessel_length,vessel_breadth,vessel_height,
			insurance_comp_name, ins_validity_date, pi_name, pi_date,
			vessel_gears, engine_type, no_engines;
	Spinner vessel_type, sub_port;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.vespro);
		
		vessel_name = (EditText) findViewById(R.id.vessel_name);
		imo_number = (EditText) findViewById(R.id.imo_number);
		sr_certificate_no = (EditText) findViewById(R.id.sr_certificate_no);
		agency_code = (EditText) findViewById(R.id.agency_code);
		owner_name = (EditText) findViewById(R.id.owner_name);
		owner_email = (EditText) findViewById(R.id.owner_email);
		nationality = (EditText) findViewById(R.id.nationality);
		vessel_weight = (EditText) findViewById(R.id.vessel_weight);
		vessel_length = (EditText) findViewById(R.id.vessel_length);
		vessel_breadth = (EditText) findViewById(R.id.vessel_breadth);
		vessel_height = (EditText) findViewById(R.id.vessel_height);
		insurance_comp_name = (EditText) findViewById(R.id.insurance_comp_name);
		ins_validity_date = (EditText) findViewById(R.id.insurance_validity_date);
		pi_name = (EditText) findViewById(R.id.pni_club_name);
		pi_date = (EditText) findViewById(R.id.pni_insur_val);
		vessel_gears = (EditText) findViewById(R.id.vessel_gears);
		engine_type = (EditText) findViewById(R.id.engine_type);
		no_engines = (EditText) findViewById(R.id.no_engines);

		vessel_type = (Spinner) findViewById(R.id.spinner_type_of_vessel);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.type_of_vessel_array,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		vessel_type.setAdapter(adapter);
		vessel_type
				.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
					public void onItemSelected(AdapterView<?> parent,
							View view, int pos, long id) {
						Object item = parent.getItemAtPosition(pos);
					}

					public void onNothingSelected(AdapterView<?> parent) {
					}
				});

		sub_port = (Spinner) findViewById(R.id.spinner_submission_port);
		ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(
				this, R.array.submission_port_array,
				android.R.layout.simple_spinner_item);
		adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sub_port.setAdapter(adapter2);
		sub_port.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			public void onItemSelected(AdapterView<?> parent, View view,
					int pos, long id) {
				Object item2 = parent.getItemAtPosition(pos);
			}

			public void onNothingSelected(AdapterView<?> parent) {
			}
		});

		submit = (Button) findViewById(R.id.button1);
		submit.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent success = new Intent(vespro.this, success.class);
				startActivity(success);
			}
		});
		
		
		
		
		
		
		
	}
}