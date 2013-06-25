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

		ArrayAdapter<VesproModel> adapter = new ArrayAdapter<VesproModel>(this,
				android.R.layout.simple_list_item_1, values);
		setListAdapter(adapter);
	}
}