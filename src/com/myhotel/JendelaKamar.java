package com.myhotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.xml.crypto.KeySelector.Purpose;

import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JendelaKamar {

	private JFrame frmKamar;
	private JTextField iNomorKamar;
	private JTextField iNamaKamar;
	private JTextField iHargaSewa;
	private JCheckBox iKamarTersedia;
	private JButton bTambahKamar;
	private static JList<Kamar> oDaftarKamar;
	private JComboBox iKelasKamar;
	private static Vector<Kamar> daftarKamar = new Vector<Kamar>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JendelaKamar window = new JendelaKamar();
					window.frmKamar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void populateRooms() throws SQLException {
		daftarKamar = DatabaseHotel.getRoomList();
		oDaftarKamar.setListData(daftarKamar);
	}
	
	/**
	 * Create the application.
	 * @throws SQLException 
	 */
	public JendelaKamar() throws SQLException {
		initialize();
		populateRooms();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKamar = new JFrame();
		frmKamar.setTitle("Kamar");
		frmKamar.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				JendelaUtama.main(null);
				frmKamar.dispose();
			}
		});
		frmKamar.setBounds(100, 100, 353, 381);
		frmKamar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmKamar.getContentPane().setLayout(null);
		
		JLabel lblNomorKamar = new JLabel("Nomor Kamar");
		lblNomorKamar.setBounds(12, 12, 93, 15);
		frmKamar.getContentPane().add(lblNomorKamar);
		
		JLabel lblNamaKamar = new JLabel("Nama Kamar");
		lblNamaKamar.setBounds(12, 39, 93, 15);
		frmKamar.getContentPane().add(lblNamaKamar);
		
		JLabel lblKelasKamar = new JLabel("Kelas Kamar");
		lblKelasKamar.setBounds(12, 66, 93, 15);
		frmKamar.getContentPane().add(lblKelasKamar);
		
		JLabel lblTersedia = new JLabel("Tersedia?");
		lblTersedia.setBounds(12, 93, 93, 15);
		frmKamar.getContentPane().add(lblTersedia);
		
		JLabel lblHargaSewa = new JLabel("Harga Sewa");
		lblHargaSewa.setBounds(12, 120, 93, 15);
		frmKamar.getContentPane().add(lblHargaSewa);
		
		iNomorKamar = new JTextField();
		iNomorKamar.setBounds(123, 10, 213, 19);
		frmKamar.getContentPane().add(iNomorKamar);
		iNomorKamar.setColumns(10);
		
		iNamaKamar = new JTextField();
		iNamaKamar.setBounds(123, 37, 213, 19);
		frmKamar.getContentPane().add(iNamaKamar);
		iNamaKamar.setColumns(10);
		
		iKamarTersedia = new JCheckBox("Ya, kamar siap disewa.");
		iKamarTersedia.setBounds(119, 89, 217, 23);
		frmKamar.getContentPane().add(iKamarTersedia);
		
		iHargaSewa = new JTextField();
		iHargaSewa.setBounds(123, 118, 114, 19);
		frmKamar.getContentPane().add(iHargaSewa);
		iHargaSewa.setColumns(10);
		
		JLabel lblRpMalam = new JLabel("Rp. / Malam");
		lblRpMalam.setBounds(255, 120, 81, 15);
		frmKamar.getContentPane().add(lblRpMalam);
		
		bTambahKamar = new JButton("Tambah Kamar");
		bTambahKamar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String NomorKamar = iNomorKamar.getText();
				String NamaKamar = iNamaKamar.getText();
				String KelasKamar = iKelasKamar.getSelectedItem().toString();
				boolean Tersedia = (iKamarTersedia.isSelected()? true : false);
				double HargaSewa = Double.parseDouble(iHargaSewa.getText());
				Kamar kamar = new Kamar();
				kamar.setNomorKamar(NomorKamar);
				kamar.setNamaKamar(NamaKamar);
				kamar.setKelasKamar(KelasKamar);
				kamar.setTersedia(Tersedia);
				kamar.setHargaSewa(HargaSewa);
				try {
					DatabaseHotel.tambahKamar(kamar);
					populateRooms();
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Data gagal dimasukkan karena \n" + e);
					e1.printStackTrace();
				}
			}
		});
		bTambahKamar.setBounds(175, 147, 161, 25);
		frmKamar.getContentPane().add(bTambahKamar);
		
		oDaftarKamar = new JList<Kamar>();
		oDaftarKamar.setBorder(new LineBorder(new Color(0, 0, 0)));
		oDaftarKamar.setBounds(12, 197, 324, 146);
		frmKamar.getContentPane().add(oDaftarKamar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 184, 324, 13);
		frmKamar.getContentPane().add(separator);
		
		iKelasKamar = new JComboBox();
		iKelasKamar.setModel(new DefaultComboBoxModel(new String[] {"standard-room", "superior", "deluxe", "suite", "presidential"}));
		iKelasKamar.setBounds(123, 61, 213, 24);
		frmKamar.getContentPane().add(iKelasKamar);
	}
}
