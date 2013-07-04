package vessel;

import com.example.pcs.R;
import com.example.pcs.success;

import database.MySQLiteHelper;
import database.VesselProfileTable;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class CurrentList extends Activity implements OnClickListener {

	MySQLiteHelper helper = new MySQLiteHelper(this);
	Cursor c = null;
	String columns[] = new String[] {
			VesselProfileTable.COLUMN_IMO_NUMBER,
			VesselProfileTable.COLUMN_VESSEL_NAME,
			VesselProfileTable.COLUMN_VESSEL_TYPE,
			VesselProfileTable.COLUMN_ENGINE_TYPE};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.vessel_current_list);
		Button deleteButton = (Button) findViewById(R.id.button_delete);
		Button updateButton = (Button) findViewById(R.id.button_update); 
		TableLayout tableLayout = new TableLayout(getApplicationContext());
		tableLayout = (TableLayout) findViewById(R.id.vessel_table_layout);
		TableRow tableRow;
		TextView textView;
		
		deleteButton.setOnClickListener(this);
		updateButton.setOnClickListener(this);
		
		c = helper.getVesselProfile(columns);
		c.moveToFirst();
		
		for (int i = 0; i < c.getCount(); i++) {
			tableRow = new TableRow(getApplicationContext());
			if (c!=null && !c.isAfterLast()) {
				for (int j = 0; j < c.getColumnCount(); j++) {
					textView = new TextView(getApplicationContext());
					try{
					textView.setText(c.getString(c.getColumnIndex(columns[j])));
					}catch(CursorIndexOutOfBoundsException e){ 
						Log.d("c.getstring","caught " +j);
						e.printStackTrace();
					}
					textView.setPadding(20, 20, 20, 20);
					tableRow.addView(textView);
				}
			}
			tableLayout.addView(tableRow);
			c.moveToNext();
		}
		c.close();
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		
		case R.id.button_delete :AlertDialog.Builder deleteAlert = new AlertDialog.Builder(this);
								 deleteAlert.setTitle("Enter row id");
								 final EditText deleteInput = new EditText(this);
								 deleteAlert.setView(deleteInput);
								 
								 deleteAlert.setPositiveButton("Delete entry", new DialogInterface.OnClickListener() {
									
									@Override
									public void onClick(DialogInterface dialog, int which) {
										// TODO Auto-generated method stub
									
									try{
										int value = Integer.parseInt(deleteInput.getText().toString());
										Boolean result = helper.removeVesselProfile(value);
										Toast.makeText(getApplicationContext(), "deleted row with id " + deleteInput.getText().toString(), Toast.LENGTH_SHORT).show();
										Log.d("after removeVessel", result.toString());
									}catch(Exception e){
										Log.d("CurrentList Delete entry", "removeVessel failed");
										e.printStackTrace();
									}
									}
								});
								 
								 deleteAlert.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
									
									@Override
									public void onClick(DialogInterface dialog, int which) {
										// TODO Auto-generated method stub
									return;	
									}
								});
								 deleteAlert.show();
								 
								 
								 
								 
								break;
		
		case R.id.button_update:
			/*AlertDialog.Builder updateAlert = new AlertDialog.Builder(this);
			 updateAlert.setTitle("Enter row id");
			 final EditText updateInput = new EditText(this);
			 updateAlert.setView(updateInput);
			 
			 updateAlert.setPositiveButton("Update entry", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
				
				try{
					int value = Integer.parseInt(updateInput.getText().toString());
					Cursor cursor = helper.getRowVesselProfile(value);
					
					// cursor pointss to row .. now add values to Contentvalues and then pass it as putextra to vespro activity
					//
					
					
					Intent intent = new Intent(CurrentList.this, vespro.class);
					startActivityForResult(intent, 1);
					
					
					
					
					Boolean result = helper.updateVesselProfile(value);
					Toast.makeText(getApplicationContext(), "deleted row with id " + updateInput.getText().toString(), Toast.LENGTH_SHORT).show();
					Log.d("after removeVessel", result.toString());
				}catch(Exception e){
					Log.d("CurrentList Delete entry", "removeVessel failed");
					e.printStackTrace();
				}
				}
			});
			 
			 updateAlert.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
				return;	
				}
			});
			 updateAlert.show();*/
			
			
			
			Toast.makeText(getApplicationContext(), "updation! work under progress!", Toast.LENGTH_SHORT).show();
								break;
		
		
		
		
		
		}
		
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
	}

}
