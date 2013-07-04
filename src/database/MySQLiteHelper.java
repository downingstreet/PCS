package database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
		Log.d("MySQLiteHelper.java", "onCreate vessel profile");
		database.execSQL(VesselProfileTable.CREATE_VESSEL_PROFILE);
		//database.execSQL(VoyageDetailsTable.CREATE_VOYAGE_DETAILS);
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
	
	// adding row to table
		public long addVesselProfile(String allValues[]) {
			Log.d("MySQLiteHelper.java", "begin addVesselProfile");
			// CREATE A CONTENTVALUE OBJECT
			ContentValues cv = new ContentValues();
			for (int i = 0; i < VesselProfileTable.allColumns.length; i++) {
				Log.d("MySQLiteHelper.java", "inside for loop addVesselProfile");
				cv.put(VesselProfileTable.allColumns[i], allValues[i]);
			}

			// RETRIEVE WRITEABLE DATABASE AND INSERT
			SQLiteDatabase sd = getWritableDatabase();
			long result = sd.insert(VesselProfileTable.TABLE_NAME, null, cv);
			Log.d("MySQLiteHelper.java", "end addVesselProfile");
			return result;
		}

		// fetch all rows from vessel profile table
		public Cursor getVesselProfile(String columns[]) {
			SQLiteDatabase sd = getWritableDatabase();
			// QUERY CLASS MAP FOR STUDENTS IN COURSE
			Cursor c = sd.query(VesselProfileTable.TABLE_NAME, columns, null, null, null, null, null);
			return c;
		}
		
		// fetch row with particular row id
		public Cursor getRowVesselProfile(int column_id) {
			SQLiteDatabase sd = getWritableDatabase();
			String[] selectionArgs = new String[] {String.valueOf(column_id)};
			Cursor c = sd.query(VesselProfileTable.TABLE_NAME, null, VesselProfileTable.COLUMN_ID + "= ? ", selectionArgs , null, null, null);
			return c;
		}

		// removing vessel profile with particular id
		public boolean removeVesselProfile (int column_id) {
			SQLiteDatabase sd = getWritableDatabase();
			String[] whereArgs = new String[] { String.valueOf(column_id) };

			int result = sd.delete(VesselProfileTable.TABLE_NAME, VesselProfileTable.COLUMN_ID + "= ? ",
					whereArgs);
			return (result > 0);
		}
		
		public boolean updateVesselProfile(int column_id , ContentValues values)
		{
			SQLiteDatabase sd = getWritableDatabase();
			String[] whereArgs = new String[] {String.valueOf(column_id)};
			
			int result = sd.update(VesselProfileTable.TABLE_NAME, values, VesselProfileTable.COLUMN_ID + "= ? ", whereArgs);
			return false;
			
		}

	
	
	

}
