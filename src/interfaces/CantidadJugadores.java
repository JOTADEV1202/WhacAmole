package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelos.ConfigJuego;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class CantidadJugadores extends JFrame {

	private JPanel contentPane;
	private JTextField tfJugador1;
	private JLabel lbJugador1;
	private JTextField tfJugador2;
	private JLabel lbJugador2;
	private JButton btnConfirmar;
	private Modelos.ConfigJuego configuracion;

	/**
	 * Create the frame.
	 */
	public CantidadJugadores() {
		configuracion = new Modelos.ConfigJuego();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,  600,500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Numero de jugadores");
		setLocationRelativeTo(null);
		btnConfirmar = new JButton("continuar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				configuracion.setNombreJugador1(tfJugador1.getText());
				configuracion.setNombreJugador2(tfJugador2.getText());
				
				selectorDificultad juego = new  selectorDificultad(configuracion);
			    juego.setVisible(true);
			    dispose();
			}
		});
		btnConfirmar.setForeground(Color.BLACK);
		btnConfirmar.setFont(new Font("MS UI Gothic", Font.BOLD, 12));
		btnConfirmar.setBackground(new Color(51, 204, 153));
		btnConfirmar.setBounds(221, 401, 144, 34);
		contentPane.add(btnConfirmar);
		
		tfJugador2 = new JTextField();
		tfJugador2.setColumns(10);
		tfJugador2.setBounds(232, 346, 122, 26);
		contentPane.add(tfJugador2);
		
		tfJugador1 = new JTextField();
		tfJugador1.setBounds(232, 312, 122, 26);
		contentPane.add(tfJugador1);
		tfJugador1.setColumns(10);
		
		lbJugador2 = new JLabel("Jugador 2:");
		lbJugador2.setForeground(Color.WHITE);
		lbJugador2.setFont(new Font("MS UI Gothic", Font.BOLD, 18));
		lbJugador2.setBounds(116, 346, 106, 41);
		contentPane.add(lbJugador2);
		
		lbJugador1 = new JLabel("Jugador 1:");
		lbJugador1.setForeground(new Color(255, 255, 255));
		lbJugador1.setFont(new Font("MS UI Gothic", Font.BOLD, 18));
		lbJugador1.setBounds(116, 305, 106, 41);
		contentPane.add(lbJugador1);
		
		JLabel MsSeleccion = new JLabel("Seleccione la cantidad de jugadores");
		MsSeleccion.setBounds(66, 65, 412, 47);
		MsSeleccion.setForeground(new Color(255, 255, 255));
		MsSeleccion.setFont(new Font("MS UI Gothic", Font.BOLD, 25));
		contentPane.add(MsSeleccion);
		
		JButton botonUnJugador = new JButton("Un Jugador");
		botonUnJugador.setBounds(221, 192, 144, 34);
		botonUnJugador.setFont(new Font("MS UI Gothic", Font.BOLD, 12));
		botonUnJugador.setBackground(new Color(51, 204, 153));
		contentPane.add(botonUnJugador);
		botonUnJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarCajasNombres(false);
		  }	
		});
		
		JButton botonDosJugadores = new JButton("Dos Jugadores");
		botonDosJugadores.setBounds(221, 246, 144, 34);
		botonDosJugadores.setBackground(new Color(51, 204, 153));
		botonDosJugadores.setForeground(new Color(0, 0, 0));
		botonDosJugadores.setFont(new Font("MS UI Gothic", Font.BOLD, 12));
		contentPane.add(botonDosJugadores);
		botonDosJugadores.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				mostrarCajasNombres(true);
		  }	
		});
		
		JLabel fondo = new JLabel("");
		fondo.setBounds(0, 0, 586, 474);
		fondo.setIcon(new ImageIcon(InicioJuego.class.getResource("/imagenes/fondo.jpg")));
		contentPane.add(fondo);

		
		tfJugador1.setVisible(false);
		lbJugador1.setVisible(false);
		tfJugador2.setVisible(false);
		lbJugador2.setVisible(false);
		btnConfirmar.setVisible(false);
	}
	
	private void mostrarCajasNombres(Boolean esDosJugadores) {
		
		tfJugador1.setVisible(true);
		lbJugador1.setVisible(true);
		tfJugador1.setText("");

		if (esDosJugadores) {
			configuracion.setCantidadJugadores(2);
			tfJugador2.setVisible(true);
			lbJugador2.setVisible(true);
		} else {
			configuracion.setCantidadJugadores(1);
			tfJugador2.setVisible(false);
			lbJugador2.setVisible(false);
		}
		tfJugador2.setText("");
		
		btnConfirmar.setVisible(true);
	}
}
