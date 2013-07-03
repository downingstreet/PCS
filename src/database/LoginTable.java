package database;


public class LoginTable {

	private static final String TABLE_NAME = "LOGIN_TABLE";
	private static final String COLUMN_ID = "-id";
	private static final String COLUMN_USERNAME = "username";
	private static final String COLUMN_PASS = "pass" ;
	private static final String CREATE_LOGIN_TABLE = "create table ("
			+ COLUMN_ID + " integer primary key autoincrement, "
			+ COLUMN_USERNAME + " text not null, "
			+ COLUMN_PASS + " text not null );";
	
	
			
}
