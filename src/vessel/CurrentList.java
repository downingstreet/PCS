package vessel;

import com.example.pcs.R;

import database.MySQLiteHelper;
import database.VesselProfileTable;

import android.app.Activity;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
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
		
		case R.id.button_delete : 
								break;
		
		case R.id.button_update:Toast t = new Toast(getApplicationContext());
								t.makeText(getApplicationContext(), "Updation", );
								t.show();
								break;
		
		
		
		
		
		}
		
	}

}
