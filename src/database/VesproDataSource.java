package database;

import java.util.ArrayList;
import java.util.List;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class VesproDataSource {

	private SQLiteDatabase database;
	private MySQLiteHelper dbHelper;

	private String[] allColumns = { VesproModel.COLUMN_ID,
			VesproModel.COLUMN_IMO_NUMBER,
			VesproModel.COLUMN_VESSEL_NAME,
			VesproModel.COLUMN_VESSEL_TYPE,
			VesproModel.COLUMN_SR_CERTIFICATE_NO,
			VesproModel.COLUMN_AGENCY_CODE,
			VesproModel.COLUMN_OWNER_NAME,
			VesproModel.COLUMN_OWNER_EMAIL,
			VesproModel.COLUMN_PORT_OF_SUBMISSION,
			VesproModel.COLUMN_NATIONALITY,
			VesproModel.COLUMN_VESSEL_HEIGHT,
			VesproModel.COLUMN_VESSEL_BREADTH,
			VesproModel.COLUMN_VESSEL_LENGTH,
			VesproModel.COLUMN_VESSEL_WEIGHT,
			VesproModel.COLUMN_INSURANCE_COMPANY,
			VesproModel.COLUMN_INSURANCE_VALIDITY,
			VesproModel.COLUMN_PNI_CLUB,
			VesproModel.COLUMN_PNI_INSURANCE_VALIDITY,
			VesproModel.COLUMN_VESSEL_GEARS,
			VesproModel.COLUMN_ENGINE_TYPE, 
			VesproModel.COLUMN_NO_ENGINES }; //21

	public VesproDataSource(Context context) {
		dbHelper = new MySQLiteHelper(context);
	}

	public void open() throws SQLException {
		database = dbHelper.getWritableDatabase();
	}

	public void close() {
		dbHelper.close();
	}

	public VesproModel createComment(String comment[]) {
		long insertId;
		int i = 1, j = 0;
		Cursor cursor = null;
		ContentValues values = new ContentValues();
		//values.put(allColumns[0],insertId);
		for (; i < allColumns.length && j < comment.length ; i++ , j++) {
			values.put(allColumns[i], comment[j]);

		}
		insertId = database.insert(VesproModel.TABLE_TPCS_VESSEL, null, values);
		cursor = database.query(VesproModel.TABLE_TPCS_VESSEL, allColumns, 
				VesproModel.COLUMN_ID + " = " + insertId, null, null, null, null);

		cursor.moveToFirst();
		VesproModel newComment = cursorToComment(cursor);
		cursor.close();
		return newComment;
	}
	public void deleteComment(VesproModel comment) {
	    long id = comment.getId();
	    System.out.println("Comment deleted with id: " + id);
	    database.delete(VesproModel.TABLE_TPCS_VESSEL, VesproModel.COLUMN_ID + " = " + id, null);
	  }

	public List<VesproModel> getAllComments() {
	    List<VesproModel> comments = new ArrayList<VesproModel>();

	    Cursor cursor = database.query(VesproModel.TABLE_TPCS_VESSEL, allColumns, null, null, null, null, null);
	    cursor.moveToFirst();
	    while (!cursor.isAfterLast()) {
	      VesproModel comment = cursorToComment(cursor);
	      comments.add(comment);
	      cursor.moveToNext();
	    }
	    cursor.close();
	    return comments;
	  }

	private VesproModel cursorToComment(Cursor cursor) {
	    VesproModel comment = new VesproModel();
	    Log.d("cursorToComment", "Before if cursorToComment");
	    if( cursor != null && cursor.moveToFirst() ){
	    	Log.d("cursorToComment", "inside cursorToComment");
	    comment.setId(cursor.getLong(0));
	    comment.setImo_number(cursor.getString(1));
	    comment.setVessel_name(cursor.getString(2));
	    comment.setVessel_type(cursor.getString(3));
	    comment.setSr_certificate_no(cursor.getString(4));
	    comment.setAgency_code(cursor.getString(5));
	    comment.setOwner_name(cursor.getString(6));
	    comment.setOwner_email(cursor.getString(7));
	    comment.setPort_of_submission(cursor.getString(8));
	    comment.setNationality(cursor.getString(9));
	    comment.setVessel_height(cursor.getString(10));
	    comment.setVessel_breadth(cursor.getString(11));
	    comment.setVessel_length(cursor.getString(12));
	    comment.setVessel_weight(cursor.getString(13));
	    comment.setInsurance_company(cursor.getString(14));
	    comment.setInsurance_validity(cursor.getString(15));
	    comment.setPni_club(cursor.getString(16));
	    comment.setPni_insurance_validity(cursor.getString(17));
	    comment.setVessel_gears(cursor.getString(18));
	    comment.setEngine_type(cursor.getString(19));
	    comment.setNo_engines(cursor.getInt(20));
	    }
	    else Log.d("cursorToComment", "NULL evaluation");
	    return comment;
	  }




}