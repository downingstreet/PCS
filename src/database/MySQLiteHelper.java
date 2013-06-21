package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MySQLiteHelper extends SQLiteOpenHelper {
	public static final String DATABASE_NAME = "pcs.db";
	public static final int DATABASE_VERSION = 1;
	public static final String TABLE_TPCS_VESSEL = "TPCS_VESSEl";
	
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_IMO_NUMBER = "imo_number";
	public static final String COLUMN_VESSEL_NAME="vessel_name";
	public static final String COLUMN_VESSEL_TYPE="vessel_type";
	public static final String COLUMN_SR_CERTIFICATE_NO="sr_certificate_no";
	public static final String COLUMN_AGENCY_CODE = "agency_code";
	public static final String COLUMN_OWNER_NAME="owner_name";
	public static final String COLUMN_OWNER_EMAIL="owner_email";
	public static final String COLUMN_PORT_OF_SUBMISSION="port_of_submission";
	public static final String COLUMN_NATIONALITY="nationality";
	public static final String COLUMN_VESSEL_HEIGHT="vessel_height";
	public static final String COLUMN_VESSEL_BREADTH="vessel_breadth";
	public static final String COLUMN_VESSEL_LENGTH="vessel_length";
	public static final String COLUMN_VESSEL_WEIGHT="vessel_weight";
	public static final String COLUMN_INSURANCE_COMPANY="insurance_company";
	public static final String COLUMN_INSURANCE_VALIDITY="insurance_validity";
	public static final String COLUMN_PNI_CLUB = "pni_club";
	public static final String COLUMN_PNI_INSURANCE_VALIDITY ="pni_insurance_validity";
	public static final String COLUMN_VESSEL_GEARS="vessel_gears";
	public static final String COLUMN_ENGINE_TYPE="engine_type";
	public static final String COLUMN_NO_ENGINES="no_engines";
		
	public MySQLiteHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	public MySQLiteHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase database) {
		// TODO Auto-generated method stub
		database.execSQL("create table "
				+ TABLE_TPCS_VESSEL
				+ "("+ COLUMN_ID + " integer primary key autoincrement, " +
				       COLUMN_IMO_NUMBER +" text not null, " +
				       COLUMN_VESSEL_NAME + " text not null, " +
				       COLUMN_VESSEL_TYPE +  " text not null, " +
				       COLUMN_SR_CERTIFICATE_NO +" text not null," +
				       COLUMN_AGENCY_CODE + " text not null, " +
				       COLUMN_OWNER_NAME + " text not null, " +
				       COLUMN_OWNER_EMAIL + " text not null, " +
				       COLUMN_PORT_OF_SUBMISSION + " text not null, " +
				       COLUMN_NATIONALITY+ " text not null, " +
				       COLUMN_VESSEL_HEIGHT + " text not null, " +
				       COLUMN_VESSEL_BREADTH + " text not null, " +
				       COLUMN_VESSEL_LENGTH + " text not null, " +
				       COLUMN_VESSEL_WEIGHT + " text not null, " +
				       COLUMN_INSURANCE_COMPANY + " text not null, " +
				       COLUMN_INSURANCE_VALIDITY + " text not null, " +
				       COLUMN_PNI_CLUB + " text not null, " +
				       COLUMN_PNI_INSURANCE_VALIDITY + " text not null," +
				       COLUMN_VESSEL_GEARS + " text not null, " +
				       COLUMN_ENGINE_TYPE + " text not null, " +
					   COLUMN_NO_ENGINES + " integer not null);");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		Log.w(MySQLiteHelper.class.getName(),
			  "Upgrading database from version " + oldVersion + " to "
			  + newVersion + ", which will destroy all old data");
		
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_TPCS_VESSEL);
		onCreate(db);

	}

}
