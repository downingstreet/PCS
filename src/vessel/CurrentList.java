package vessel;



import java.util.List;

import com.example.pcs.R;

import database.VesproDataSource;
import database.VesproModel;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;


public class CurrentList extends ListActivity {

	 private VesproDataSource datasource;

	  @Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.currentlist);

	    datasource = new VesproDataSource(this);
	    datasource.open();

	    List<VesproModel> values = datasource.getAllComments();

	    // Use the SimpleCursorAdapter to show the
	    // elements in a ListView
	    ArrayAdapter<VesproModel> adapter = new ArrayAdapter<VesproModel>(this,
	        android.R.layout.simple_list_item_1, values);
	    setListAdapter(adapter);
	  }
	  
	  @Override
	  protected void onResume() {
	    datasource.open();
	    super.onResume();
	  }

	  @Override
	  protected void onPause() {
	    datasource.close();
	    super.onPause();
	  }

}


