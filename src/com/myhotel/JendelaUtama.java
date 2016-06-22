package com.myhotel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JendelaUtama {

	private JFrame frmMyHotel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JendelaUtama window = new JendelaUtama();
					window.frmMyHotel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JendelaUtama() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyHotel = new JFrame();
		frmMyHotel.setTitle("My Hotel");
		frmMyHotel.setBounds(100, 100, 212, 144);
		frmMyHotel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyHotel.getContentPane().setLayout(null);
		
		JLabel lblMyHotel = new JLabel("My Hotel");
		lblMyHotel.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyHotel.setBounds(12, 12, 184, 15);
		frmMyHotel.getContentPane().add(lblMyHotel);
		
		JButton btnLihatDataKamar = new JButton("Lihat Data Kamar");
		btnLihatDataKamar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JendelaKamar.main(null);
				frmMyHotel.dispose();
			}
		});
		btnLihatDataKamar.setBounds(12, 39, 184, 25);
		frmMyHotel.getContentPane().add(btnLihatDataKamar);
		
		JButton btnLihatDataTamu = new JButton("Lihat Data Tamu");
		btnLihatDataTamu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JendelaTamu.main(null);
				frmMyHotel.dispose();
			}
		});
		btnLihatDataTamu.setBounds(12, 76, 184, 25);
		frmMyHotel.getContentPane().add(btnLihatDataTamu);
	}
}
