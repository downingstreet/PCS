package database;

public class VoyageDetailsTable {
	
	public static final String TABLE_NAME = "";
	
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_IMO_NUMBER = "imo_number";
	public static final String COLUMN_VOYAGE_NUMBER = "voyage_number";
	public static final String COLUMN_VESSEL_TYPE = "vessel_type";
	public static final String COLUMN_AGENCY_CODE = "agency_code";
	public static final String COLUMN_PORT_OF_SUBMISSION = "port_of_submission";
	public static final String COLUMN_ARRIVAL_DATE = "arrival_date";
	public static final String COLUMN_DEPART_DATE = "depart_date";
	public static final String COLUMN_PURPOSE = "purpose_of_visit";
	public static final String COLUMN_STATUS = "status";
	public static final String COLUMN_DUMB_VESSEL = "dumb_vessel";
	
	public static final String  CREATE_VOYAGE_DETAILS = "create table " + TABLE_NAME + "("+ 
		       COLUMN_ID + " integer primary key autoincrement, " +
		       COLUMN_IMO_NUMBER +" text not null, " +
		       COLUMN_VOYAGE_NUMBER + " text not null, " +
		       COLUMN_VESSEL_TYPE +  " text not null, " +
		       COLUMN_AGENCY_CODE + " text not null, " +
		       COLUMN_PORT_OF_SUBMISSION + " text not null, " +
		       COLUMN_ARRIVAL_DATE + " text not null, " +
		       COLUMN_DEPART_DATE + " text not null, " +
		       COLUMN_PURPOSE + " text not null, " +
		       COLUMN_STATUS + " text not null, " +
		       COLUMN_DUMB_VESSEL+ " text not null, " + ");";
}
