package database;

public class VesselProfileTable {
	public static final String TABLE_NAME = "TPCS_VESSEL";

	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_IMO_NUMBER = "imo_number";
	public static final String COLUMN_VESSEL_NAME = "vessel_name";
	public static final String COLUMN_VESSEL_TYPE = "vessel_type";
	public static final String COLUMN_SR_CERTIFICATE_NO = "sr_certificate_no";
	public static final String COLUMN_AGENCY_CODE = "agency_code";
	public static final String COLUMN_OWNER_NAME = "owner_name";
	public static final String COLUMN_OWNER_EMAIL = "owner_email";
	public static final String COLUMN_PORT_OF_SUBMISSION = "port_of_submission";
	public static final String COLUMN_NATIONALITY = "nationality";
	public static final String COLUMN_VESSEL_HEIGHT = "vessel_height";
	public static final String COLUMN_VESSEL_BREADTH = "vessel_breadth";
	public static final String COLUMN_VESSEL_LENGTH = "vessel_length";
	public static final String COLUMN_VESSEL_WEIGHT = "vessel_weight";
	public static final String COLUMN_INSURANCE_COMPANY = "insurance_company";
	public static final String COLUMN_INSURANCE_VALIDITY = "insurance_validity";
	public static final String COLUMN_PNI_CLUB = "pni_club";
	public static final String COLUMN_PNI_INSURANCE_VALIDITY = "pni_insurance_validity";
	public static final String COLUMN_VESSEL_GEARS = "vessel_gears";
	public static final String COLUMN_ENGINE_TYPE = "engine_type";
	public static final String COLUMN_NO_ENGINES = "no_engines";
	
	public static final String allColumns [] = new String[] {COLUMN_IMO_NUMBER,COLUMN_VESSEL_NAME,COLUMN_VESSEL_TYPE,COLUMN_SR_CERTIFICATE_NO,
			COLUMN_AGENCY_CODE , COLUMN_OWNER_NAME , COLUMN_OWNER_EMAIL, COLUMN_PORT_OF_SUBMISSION , COLUMN_NATIONALITY, COLUMN_VESSEL_HEIGHT, COLUMN_VESSEL_BREADTH,
			COLUMN_VESSEL_LENGTH, COLUMN_VESSEL_WEIGHT, COLUMN_INSURANCE_COMPANY, COLUMN_INSURANCE_VALIDITY, COLUMN_PNI_CLUB ,COLUMN_PNI_INSURANCE_VALIDITY,
			COLUMN_VESSEL_GEARS, COLUMN_ENGINE_TYPE , COLUMN_NO_ENGINES};
	
	public static final String  CREATE_VESSEL_PROFILE = "create table " + TABLE_NAME + "("+ 
		       COLUMN_ID + " integer primary key autoincrement, " +
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
			   COLUMN_NO_ENGINES + " integer not null );";
	
}
