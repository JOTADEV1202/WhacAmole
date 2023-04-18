package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelos.Dificultad;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;

public class selectorDificultad extends JFrame {

	private JPanel contentPane;
	private Modelos.ConfigJuego configuracion;

	/**
	 * Create the frame.
	 */
	public selectorDificultad(Modelos.ConfigJuego config) {
		configuracion = config;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Selector de dificultad");
		
		JLabel lbBienvenido = new JLabel("");
		lbBienvenido.setForeground(new Color(255, 255, 255));
		lbBienvenido.setFont(new Font("MS UI Gothic", Font.BOLD, 16));
		lbBienvenido.setBounds(123, 124, 306, 34);
		contentPane.add(lbBienvenido);
		
		JButton botonDificil = new JButton("Dificil");
		botonDificil.setFont(new Font("MS UI Gothic", Font.BOLD, 12));
		botonDificil.setBackground(new Color(51, 204, 153));
		botonDificil.setBounds(221, 304, 144, 34);
		contentPane.add(botonDificil);
		botonDificil.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				configuracion.setDificultad(Dificultad.DIFICIL);
			    nivelDificil bDificil = new  nivelDificil(configuracion);
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
				configuracion.setDificultad(Dificultad.MEDIO);
			    nivelMedio bMedio = new  nivelMedio(configuracion);
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
				configuracion.setDificultad(Dificultad.FACIL);
				nivelFacil bFacil = new  nivelFacil(configuracion);
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
		
		lbBienvenido.setText("Bienvenido " + configuracion.getNombreJugador1() + ", seleccione la dificutltad");
	}
}
