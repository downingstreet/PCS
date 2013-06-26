package database;

import java.util.List;

import com.example.pcs.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ItemAdapter extends ArrayAdapter<VesproModel> {

	// declaring our ArrayList of items
	private List<VesproModel> objects;

	/* here we must override the constructor for ArrayAdapter
	* the only variable we care about now is ArrayList<VesproModel> objects,
	* because it is the list of objects we want to display.
	*/
	public ItemAdapter(Context context, int textViewResourceId, List<VesproModel> objects) {
		super(context, textViewResourceId, objects);
		this.objects = objects;
	}

	/*
	 * we are overriding the getView method here - this is what defines how each
	 * list item will look.
	 */
	public View getView(int position, View convertView, ViewGroup parent){

		// assign the view we are converting to a local variable
		View v = convertView;

		// first check to see if the view is null. if so, we have to inflate it.
		// to inflate it basically means to render, or show, the view.
		if (v == null) {
			LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = inflater.inflate(R.layout.list_item, null);
		}

		/*
		 * Recall that the variable position is sent in as an argument to this method.
		 * The variable simply refers to the position of the current object in the list. (The ArrayAdapter
		 * iterates through the list we sent it)
		 * 
		 * Therefore, i refers to the current Item object.
		 */
		VesproModel i = objects.get(position);

		if (i != null) {

			// This is how you obtain a reference to the TextViews.
			// These TextViews are created in the XML files we defined.

			TextView tt = (TextView) v.findViewById(R.id.toptext);
			TextView ttd = (TextView) v.findViewById(R.id.toptextdata);
			TextView mt = (TextView) v.findViewById(R.id.middletext);
			TextView mtd = (TextView) v.findViewById(R.id.middletextdata);
			TextView bt = (TextView) v.findViewById(R.id.bottomtext);
			TextView btd = (TextView) v.findViewById(R.id.desctext);

			// check to see if each individual textview is null.
			// if not, assign some text!
			if (tt != null){
				tt.setText("Imo_number: ");
			}
			if (ttd != null){
				ttd.setText(i.getImo_number());
			}
			if (mt != null){
				mt.setText("Vessel Name : ");
			}
			if (mtd != null){
				mtd.setText(i.getVessel_name());
			}
			if (bt != null){
				bt.setText("Vessel_type : ");
			}
			if (btd != null){
				btd.setText(i.getVessel_type());
			}
		}

		// the view must be returned to our activity
		return v;

	}

}