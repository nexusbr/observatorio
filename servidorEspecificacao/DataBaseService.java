package geopixel.service; 

import geopixel.enumeration.DataBaseTypeEnum;
import geopixel.model.external.GenericTable;
import geopixel.model.hb.dto.AppDicionarioDado;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class DataBaseService {

	private static String URL;
	private static String driver;
	
	public static DataBase getPostgresParameters(){
		DataBase dataBase = new DataBase();
		dataBase.setHost("localhost");
		dataBase.setPort("5432");
		dataBase.setUser("postgres");
		dataBase.setPassword("123");
		dataBase.setDatabase("geo");
		dataBase.setDataBaseTypeEnum(DataBaseTypeEnum.POSTGRES);
		return dataBase;
	}

	public static Connection connect(DataBase dataBase) throws IOException {
		DataBaseTypeEnum dbType = dataBase.getDataBaseTypeEnum();
		Connection conn = null;
		
		switch (dbType) {
		case POSTGRES:
			 URL = "jdbc:postgresql://" + dataBase.getHost() + ":" + dataBase.getPort() + "/" + dataBase.getDatabase();
			 driver = "org.postgresql.Driver";
			break;
		case SQLSERVER:
			break;
			
		case MYSQL:
			
			break;
			
		case ORACLE:
			
			break;

		default:
			break;
		}
		
		String user = dataBase.getUser();
		String password = dataBase.getPassword();
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(URL,user,password);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

	public static ResultSet buildSelect(String sql,DataBase dataBase) throws IOException, SQLException {
		Connection conn = DataBaseService.connect(dataBase);
		ResultSet rs = null;
		try {
			Statement stm = conn.createStatement();
			rs = stm.executeQuery(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		return rs;
	}
	
	

}
