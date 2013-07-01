package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MySQLiteHelper extends SQLiteOpenHelper {
	public static final String DATABASE_NAME = "pcs.db";
	public static final int DATABASE_VERSION = 1;

	public MySQLiteHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase database) {
		// TODO Auto-generated method stub
		database.execSQL(VesselProfileTable.CREATE_VESSEL_PROFILE);
		database.execSQL(VoyageDetailsTable.CREATE_VOYAGE_DETAILS);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		Log.w(MySQLiteHelper.class.getName(),"Upgrading database from version " + oldVersion + " to "
			  + newVersion + ", which will destroy all old data");
		
		db.execSQL("DROP TABLE IF EXISTS " + VesselProfileTable.TABLE_NAME);
		db.execSQL("DROP TABLE IF EXISTS " + VoyageDetailsTable.TABLE_NAME);
		onCreate(db);

	}
	
	

}
