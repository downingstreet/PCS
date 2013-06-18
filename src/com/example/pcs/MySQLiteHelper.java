package com.example.pcs;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MySQLiteHelper extends SQLiteOpenHelper {
	public static final String DATABASE_NAME = "pcs";
	public static final int DATABASE_VERSION = 1;

	public static final String TPCS_VESSEL = "TPCS_VESSEl";

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
				+ TPCS_VESSEL
				+ "(_id int not null autoincrement, " +
				"imo_number text primary key," +
				" vessel_name text not null, " +
				"vessel_type text not null, " +
				"sr_certificate_no  text not null," +
				" agency_code  text not null, " +
				"owner_name  text not null," +
				" owner_email  text not null, " +
				"port_of_submission text not null, " +
				"nationality  text not null, " +
				"vessel_height text not null," +
				" vessel_breadth text not null," +
				"vessel_length text not null," +
				" vessel_weight text not null," +
				"insurance_company text not null," +
				"insurance_validity text not null," +
				"pni_club text not null," +
				"pni_insurance_validity text not null," +
				"vessel_gears text not null," +
				"engine_type text not null," +
				"no_engines int not null);");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		Log.w(MySQLiteHelper.class.getName(),
				"Upgrading database from version " + oldVersion + " to "
						+ newVersion + ", which will destroy all old data");
		db.execSQL("DROP TABLE IF EXISTS " + TPCS_VESSEL);
		onCreate(db);

	}

}
