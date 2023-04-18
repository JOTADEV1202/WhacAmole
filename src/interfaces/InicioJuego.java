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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class InicioJuego extends JFrame {
	
	private JComboBox comboBox;
	private JButton botonJugar;
	private JLabel titulo;
	private JLabel Fondo;
	
	//serial
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
		contentPane.setBorder(new EmptyBorder(4, 4, 4, 4));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Juego del topo");
		setLocationRelativeTo(null);
		comboBox = new JComboBox();
		comboBox.setBackground(new Color(51, 204, 153));
		comboBox.setEditable(true);
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Puntajes", "Opciones"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(187, 295, 212, 39);
		contentPane.add(comboBox);
		
		botonJugar = new JButton("JUGAR");
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

		
		titulo = new JLabel("Whac-a-mole");
		titulo.setForeground(new Color(178, 34, 34));
		titulo.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
		titulo.setBounds(198, 45, 187, 65);
		contentPane.add(titulo);
		
		Fondo = new JLabel("");
		Fondo.setBackground(new Color(51, 204, 102));
		Fondo.setIcon(new ImageIcon(InicioJuego.class.getResource("/imagenes/fondo.jpg")));
		Fondo.setBounds(0, 0, 600, 500);
		contentPane.add(Fondo);
	}
}
