package com.myhotel;

public class Kamar {
	
	private String NomorKamar;
	private String NamaKamar;
	private String KelasKamar;
	private boolean Tersedia;
	private double HargaSewa;
	
	public String getNomorKamar() {
		return NomorKamar;
	}
	
	public void setNomorKamar(String nomorKamar) {
		NomorKamar = nomorKamar;
	}
	
	public String getNamaKamar() {
		return NamaKamar;
	}
	
	public void setNamaKamar(String namaKamar) {
		NamaKamar = namaKamar;
	}
	
	public String getKelasKamar() {
		return KelasKamar;
	}
	
	public void setKelasKamar(String kelasKamar) {
		KelasKamar = kelasKamar;
	}
	
	public boolean isTersedia() {
		return Tersedia;
	}
	
	public void setTersedia(boolean tersedia) {
		Tersedia = tersedia;
	}
	
	public double getHargaSewa() {
		return HargaSewa;
	}
	
	public void setHargaSewa(double hargaSewa) {
		HargaSewa = hargaSewa;
	}

	@Override
	public String toString() {
		return NomorKamar + " - " + NamaKamar;
	}

	
}
