package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;

public class selectorDificultad extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					selectorDificultad frame = new selectorDificultad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public selectorDificultad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botonDificil = new JButton("Dificil");
		botonDificil.setFont(new Font("MS UI Gothic", Font.BOLD, 12));
		botonDificil.setBackground(new Color(51, 204, 153));
		botonDificil.setBounds(221, 304, 144, 34);
		contentPane.add(botonDificil);
		botonDificil.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		    nivelDificil bDificil = new  nivelDificil();
		    bDificil.setVisible(true);
		    dispose();
		  }	
		});
		
		JButton botonMedio = new JButton("Media");
		botonMedio.setFont(new Font("MS UI Gothic", Font.BOLD, 12));
		botonMedio.setBackground(new Color(51, 204, 153));
		botonMedio.setBounds(221, 251, 144, 34);
		contentPane.add(botonMedio);
		botonMedio.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		    nivelMedio bMedio = new  nivelMedio();
		    bMedio.setVisible(true);
		    dispose();
		  }	
		});
		
		JButton botonFacil = new JButton("Facil");
		botonFacil.setFont(new Font("MS UI Gothic", Font.BOLD, 12));
		botonFacil.setBackground(new Color(51, 204, 153));
		botonFacil.setBounds(221, 196, 144, 34);
		contentPane.add(botonFacil);
		botonFacil.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		    nivelFacil bFacil = new  nivelFacil();
		    bFacil.setVisible(true);
		    dispose();
		  }	
		});
		
		JLabel labelDificultad = new JLabel("Seleccione la dificultad");
		labelDificultad.setForeground(Color.WHITE);
		labelDificultad.setFont(new Font("MS UI Gothic", Font.BOLD, 25));
		labelDificultad.setBounds(150, 44, 285, 47);
		contentPane.add(labelDificultad);
		
		JLabel Fondo = new JLabel("");
		Fondo.setForeground(new Color(255, 255, 255));
		Fondo.setIcon(new ImageIcon(InicioJuego.class.getResource("/imagenes/fondo.jpg")));
		Fondo.setBounds(0, 10, 586, 453);
		contentPane.add(Fondo);
	}
}
