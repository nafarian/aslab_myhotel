package com.myhotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DatabaseHotel {
	
	public static Connection conn = null;
	private static Vector<Kamar> DaftarKamar = new Vector<Kamar>();
	
	public static void init() throws SQLException {
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUser("root");
		dataSource.setPassword("");
		dataSource.setServerName("localhost");
		dataSource.setDatabaseName("myhotel");
		conn = dataSource.getConnection();
	}
	
	public static Vector<Kamar> getRoomList() throws SQLException {
		Statement st = conn.createStatement();
		String sql = ("SELECT * FROM Kamar;");
		ResultSet rs = st.executeQuery(sql);
		DaftarKamar.clear();
		while (rs.next()) { 
			Kamar kamar = new Kamar();
			kamar.setNomorKamar(rs.getString("NomorKamar"));
			kamar.setNamaKamar(rs.getString("NamaKamar"));
			kamar.setKelasKamar(rs.getString("KelasKamar"));
			kamar.setTersedia(rs.getBoolean("Tersedia"));
			kamar.setHargaSewa(rs.getDouble("HargaSewa"));
			DaftarKamar.add(kamar);
		}
		return DaftarKamar;
	}
	
	public static void tambahKamar(Kamar kamar) throws SQLException {
		Statement st = conn.createStatement();
		String NomorKamar = "\"" + kamar.getNomorKamar() + "\",";
		String NamaKamar = "\"" + kamar.getNamaKamar() + "\",";
		String KelasKamar = "\"" + kamar.getKelasKamar() + "\",";
		String Tersedia = (kamar.isTersedia()? "true" : "false") + ",";
		String HargaSewa = String.valueOf(kamar.getHargaSewa());
		String sql = ("INSERT INTO Kamar (NomorKamar, NamaKamar, KelasKamar, "
					+ "Tersedia, HargaSewa) VALUES (" + NomorKamar + NamaKamar 
					+ KelasKamar + Tersedia + HargaSewa + ");");
		boolean rs = st.execute(sql);
	}
	
	public static void tambahTamu(Tamu tamu) throws SQLException {
		Statement st = conn.createStatement();
		String NamaPelanggan = "\"" + tamu.getNamaPelanggan() + "\",";
		String LamaMenginap = "\"" + String.valueOf(tamu.getLamaMenginap()) + "\",";
		String TanggalCheckIn = "\"" + String.valueOf(tamu.getTanggalCheckIn().getYear() + 1900) 
								+ "-" + String.valueOf(tamu.getTanggalCheckIn().getMonth() + 1) 
								+ "-" + String.valueOf(tamu.getTanggalCheckIn().getDate()) + "\",";
		String TotalTagihan = "\"" + String.valueOf(tamu.getTotalTagihan()) + "\",";
		String fk_NomorKamar = "\"" + tamu.getNomorKamar() + "\"";
		String sql = ("INSERT INTO Tamu (NamaPelanggan, LamaMenginap, TanggalCheckIn, TotalTagihan, "
					+ "fk_NomorKamar) VALUES (" + NamaPelanggan + LamaMenginap + TanggalCheckIn 
					+ TotalTagihan + fk_NomorKamar + ");");
		boolean rs = st.execute(sql);
	}

}
