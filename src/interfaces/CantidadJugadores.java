package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CantidadJugadores extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public CantidadJugadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,  600,500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel MsSeleccion = new JLabel("Seleccione la cantidad de jugadores");
		MsSeleccion.setForeground(new Color(255, 255, 255));
		MsSeleccion.setFont(new Font("MS UI Gothic", Font.BOLD, 25));
		MsSeleccion.setBounds(87, 69, 412, 47);
		contentPane.add(MsSeleccion);
		
		JButton botonUnJugador = new JButton("Un Jugador");
		botonUnJugador.setFont(new Font("MS UI Gothic", Font.BOLD, 12));
		botonUnJugador.setBackground(new Color(51, 204, 153));
		botonUnJugador.setBounds(221, 192, 144, 34);
		contentPane.add(botonUnJugador);
		botonUnJugador.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
		    selectorDificultad juego = new  selectorDificultad();
		    juego.setVisible(true);
		    dispose();
		  }	
		});
		
		JButton botonDosJugadores = new JButton("Dos Jugadores");
		botonDosJugadores.setBackground(new Color(51, 204, 153));
		botonDosJugadores.setForeground(new Color(0, 0, 0));
		botonDosJugadores.setFont(new Font("MS UI Gothic", Font.BOLD, 12));
		botonDosJugadores.setBounds(221, 246, 144, 34);
		contentPane.add(botonDosJugadores);
		
		botonDosJugadores.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		    selectorDificultad b2 = new  selectorDificultad();
		    b2.setVisible(true);
		    dispose();
		  }	
		});
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(InicioJuego.class.getResource("/imagenes/fondo.jpg")));
		fondo.setBounds(0, 0, 586, 474);
		contentPane.add(fondo);
	}

}
