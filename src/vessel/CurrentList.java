package vessel;

import java.util.ArrayList;
import java.util.List;

import com.example.pcs.R;

import database.ItemAdapter;
import database.VesproDataSource;
import database.VesproModel;
import android.app.ListActivity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class CurrentList extends ListActivity {
	private ArrayList<VesproModel> values = new ArrayList<VesproModel>();
	private VesproDataSource dsrc;
	private Runnable viewParts;
	private ItemAdapter m_adapter;

	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		super.onCreate(savedInstanceState);
		setContentView(R.layout.currentlist);

		dsrc = new VesproDataSource(this);
		dsrc.open();
		m_adapter = new ItemAdapter(this, R.layout.list_item, values);
		setListAdapter(m_adapter);
	
		viewParts = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				handler.sendEmptyMessage(0);
			}
		};
		
		Thread thread =  new Thread(null, viewParts, "MagentoBackground");
        thread.start();
	}
        
        private Handler handler = new Handler()
		 {
			public void handleMessage(Message msg)
			{
				// create some objects
				// here is where you could also request data from a server
				// and then create objects from that data.
				//m_parts.add(new Item("MyItemName", "This is item #1", 0));
				//m_parts.add(new Item("MyItemName #2", "This is item #2", 0));
				List<VesproModel> values = dsrc.getAllComments();
				m_adapter = new ItemAdapter(CurrentList.this, R.layout.list_item, values);

				// display the list.
		        setListAdapter(m_adapter);
			}
		};

	}


