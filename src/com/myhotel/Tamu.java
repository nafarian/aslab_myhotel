package com.myhotel;

import java.util.Date;

public class Tamu {
	
	private String NamaPelanggan;
	private int LamaMenginap;
	private Date TanggalCheckIn;
	private double TotalTagihan;
	private String NomorKamar;
	
	public String getNamaPelanggan() {
		return NamaPelanggan;
	}
	
	public void setNamaPelanggan(String namaPelanggan) {
		NamaPelanggan = namaPelanggan;
	}
	
	public int getLamaMenginap() {
		return LamaMenginap;
	}
	
	public void setLamaMenginap(int lamaMenginap) {
		LamaMenginap = lamaMenginap;
	}
	
	public Date getTanggalCheckIn() {
		return TanggalCheckIn;
	}
	
	public void setTanggalCheckIn(Date tanggalCheckIn) {
		TanggalCheckIn = tanggalCheckIn;
	}
	
	public double getTotalTagihan() {
		return TotalTagihan;
	}
	
	public void setTotalTagihan(double totalTagihan) {
		TotalTagihan = totalTagihan;
	}
	
	public String getNomorKamar() {
		return NomorKamar;
	}
	
	public void setNomorKamar(String nomorKamar) {
		NomorKamar = nomorKamar;
	}

}
