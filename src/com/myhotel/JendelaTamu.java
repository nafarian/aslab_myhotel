package com.myhotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class JendelaTamu {

	private JFrame frmTamu;
	private JTextField iNamaPelanggan;
	private JTextField oKelasKamar;
	private JTextField oHargaKamar;
	private JTextField iLamaMenginap;
	private JTextField oCheckOut;
	private JTextField iCheckIn;
	private JTextField oTotalBiaya;
	private JComboBox iPilihKamar;
	private JCheckBox oKamarTersedia;
	private JButton bTambahTamu;
	private JButton bLihatTamu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JendelaTamu window = new JendelaTamu();
					window.frmTamu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JendelaTamu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTamu = new JFrame();
		frmTamu.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				JendelaUtama.main(null);
				frmTamu.dispose();
			}
		});
		frmTamu.setTitle("Tamu");
		frmTamu.setBounds(100, 100, 374, 386);
		frmTamu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmTamu.getContentPane().setLayout(null);
		
		JLabel lblNamaPelanggan = new JLabel("Nama Pelanggan");
		lblNamaPelanggan.setBounds(12, 12, 129, 15);
		frmTamu.getContentPane().add(lblNamaPelanggan);
		
		JLabel lblPilihKamar = new JLabel("Pilih Kamar");
		lblPilihKamar.setBounds(12, 39, 129, 15);
		frmTamu.getContentPane().add(lblPilihKamar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 66, 348, 2);
		frmTamu.getContentPane().add(separator);
		
		JLabel lblKelasKamar = new JLabel("Kelas Kamar");
		lblKelasKamar.setBounds(12, 80, 129, 15);
		frmTamu.getContentPane().add(lblKelasKamar);
		
		JLabel lblHargaKamar = new JLabel("Harga Kamar");
		lblHargaKamar.setBounds(12, 107, 108, 15);
		frmTamu.getContentPane().add(lblHargaKamar);
		
		JLabel lblTersedia = new JLabel("Tersedia?");
		lblTersedia.setBounds(12, 134, 108, 15);
		frmTamu.getContentPane().add(lblTersedia);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(12, 161, 348, 2);
		frmTamu.getContentPane().add(separator_2);
		
		JLabel lblLamaMenginap_1 = new JLabel("Lama Menginap");
		lblLamaMenginap_1.setBounds(12, 175, 129, 15);
		frmTamu.getContentPane().add(lblLamaMenginap_1);
		
		JLabel lblLamaMenginap = new JLabel("Lama Menginap");
		lblLamaMenginap.setBounds(12, 175, 76, 15);
		frmTamu.getContentPane().add(lblLamaMenginap);
		
		iNamaPelanggan = new JTextField();
		iNamaPelanggan.setBounds(154, 10, 206, 19);
		frmTamu.getContentPane().add(iNamaPelanggan);
		iNamaPelanggan.setColumns(10);
		
		iPilihKamar = new JComboBox();
		iPilihKamar.setBounds(154, 34, 206, 24);
		frmTamu.getContentPane().add(iPilihKamar);
		
		oKelasKamar = new JTextField();
		oKelasKamar.setEditable(false);
		oKelasKamar.setBounds(154, 78, 206, 19);
		frmTamu.getContentPane().add(oKelasKamar);
		oKelasKamar.setColumns(10);
		
		oHargaKamar = new JTextField();
		oHargaKamar.setEditable(false);
		oHargaKamar.setBounds(154, 105, 114, 19);
		frmTamu.getContentPane().add(oHargaKamar);
		oHargaKamar.setColumns(10);
		
		oKamarTersedia = new JCheckBox("Ya, kamar tersedia.");
		oKamarTersedia.setEnabled(false);
		oKamarTersedia.setBounds(153, 130, 177, 23);
		frmTamu.getContentPane().add(oKamarTersedia);
		
		JLabel lblRpMalam = new JLabel("Rp. / Malam");
		lblRpMalam.setEnabled(false);
		lblRpMalam.setBounds(271, 107, 74, 15);
		frmTamu.getContentPane().add(lblRpMalam);
		
		iLamaMenginap = new JTextField();
		iLamaMenginap.setBounds(153, 175, 119, 19);
		frmTamu.getContentPane().add(iLamaMenginap);
		iLamaMenginap.setColumns(10);
		
		JLabel lblMalam = new JLabel("Malam");
		lblMalam.setBounds(288, 175, 57, 15);
		frmTamu.getContentPane().add(lblMalam);
		
		JLabel lblTanggalCheckIn = new JLabel("Tanggal Check In");
		lblTanggalCheckIn.setBounds(12, 202, 129, 15);
		frmTamu.getContentPane().add(lblTanggalCheckIn);
		
		JLabel lblTanggalCheckOut = new JLabel("Tanggal Check Out");
		lblTanggalCheckOut.setBounds(12, 229, 129, 15);
		frmTamu.getContentPane().add(lblTanggalCheckOut);
		
		JLabel lblTotalBiaya = new JLabel("Total Biaya");
		lblTotalBiaya.setBounds(12, 256, 129, 15);
		frmTamu.getContentPane().add(lblTotalBiaya);
		
		oCheckOut = new JTextField();
		oCheckOut.setEditable(false);
		oCheckOut.setBounds(154, 227, 206, 19);
		frmTamu.getContentPane().add(oCheckOut);
		oCheckOut.setColumns(10);
		
		iCheckIn = new JTextField();
		iCheckIn.setBounds(154, 200, 206, 19);
		frmTamu.getContentPane().add(iCheckIn);
		iCheckIn.setColumns(10);
		
		oTotalBiaya = new JTextField();
		oTotalBiaya.setEditable(false);
		oTotalBiaya.setBounds(154, 254, 206, 19);
		frmTamu.getContentPane().add(oTotalBiaya);
		oTotalBiaya.setColumns(10);
		
		bTambahTamu = new JButton("Tambah Tamu");
		bTambahTamu.setBounds(212, 285, 148, 25);
		frmTamu.getContentPane().add(bTambahTamu);
		
		bLihatTamu = new JButton("Lihat Daftar Tamu");
		bLihatTamu.setBounds(212, 322, 148, 25);
		frmTamu.getContentPane().add(bLihatTamu);
	}
}
