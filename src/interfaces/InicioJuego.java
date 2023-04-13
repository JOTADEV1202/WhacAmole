package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JMenuBar;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class InicioJuego extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	//iniciando la aplicacion
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioJuego frame = new InicioJuego();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//creando la pestaña de inicio del juego
	public InicioJuego() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botonOpciones = new JButton("opciones");
		botonOpciones.setBackground(new Color(102, 205, 170));
		botonOpciones.setBounds(187, 289, 212, 39);
		contentPane.add(botonOpciones);
		
		JButton botonJugar = new JButton("JUGAR");
		botonJugar.setBackground(new Color(102, 205, 170));
		botonJugar.setForeground(new Color(0, 0, 0));
		botonJugar.setBounds(187, 218, 212, 39);
		contentPane.add(botonJugar);
		botonJugar.addActionListener(new ActionListener() {
			
			  public void actionPerformed(ActionEvent e) {
			    CantidadJugadores juego = new  CantidadJugadores();
			    juego.setVisible(true);
			    dispose();
			  }	
			});

		
		JLabel titulo = new JLabel("Whac-a-mole");
		titulo.setForeground(new Color(178, 34, 34));
		titulo.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
		titulo.setBounds(199, 48, 187, 65);
		contentPane.add(titulo);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(InicioJuego.class.getResource("/imagenes/fondo.jpg")));
		Fondo.setBounds(0, 0, 600, 500);
		contentPane.add(Fondo);
	}
}
