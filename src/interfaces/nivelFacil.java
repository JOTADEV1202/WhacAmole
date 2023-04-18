package interfaces;

import java.util.Random;

import java.util.Timer;
import java.util.TimerTask;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelos.Tablero;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class nivelFacil extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private Modelos.ConfigJuego configuracion;
	private JButton btnIniciar;
	JButton btnFinalizar;
	JLabel lbReloj;
	JLabel lbPuntos;
	private Modelos.Tablero configTablero;
	private boolean juegoIniciado;
	Timer timer;
	
	private JLabel hueco0x0;
	private JLabel hueco0x1;
	private JLabel hueco0x2;
	private JLabel hueco0x3;
	private JLabel hueco1x0;
	private JLabel hueco1x1;
	private JLabel hueco1x2;
	private JLabel hueco1x3;
	private JLabel hueco2x0;
	private JLabel hueco2x1;
	private JLabel hueco2x2;
	private JLabel hueco2x3;
	private JLabel hueco3x0;
	private JLabel hueco3x1;
	private JLabel hueco3x2;
	private JLabel hueco3x3;
	private JButton btnGuardarPuntaje;
	private JLabel lblNewLabel;
	private JButton btnOpciones;
	
	/**
	 * Create the frame.
	 */
	public nivelFacil(Modelos.ConfigJuego config) {
		juegoIniciado = false;
		configuracion = config;
		configTablero = new Tablero();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		setTitle("Nivel facil");
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		panel.setBackground(new Color(204, 0, 0));
		panel.setBounds(0, 0, 586, 74);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel LabelTiempo = new JLabel("Tiempo");
		LabelTiempo.setBounds(10, 10, 45, 13);
		panel.add(LabelTiempo);
		LabelTiempo.setFont(new Font("MS UI Gothic", Font.BOLD, 12));
		
		lbReloj = new JLabel("New label");
		lbReloj.setBounds(10, 41, 144, 13);
		panel.add(lbReloj);
		
		JLabel lblNewLabel_2 = new JLabel("Puntaje");
		lblNewLabel_2.setBounds(180, 10, 45, 13);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("MS UI Gothic", Font.BOLD, 12));
		
		lbPuntos = new JLabel("0 puntos");
		lbPuntos.setBounds(180, 41, 107, 13);
		panel.add(lbPuntos);
		
		btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btnIniciar.setEnabled(false);
				btnFinalizar.setEnabled(true);
				
				
				ClickUsuario(0,0, true);

			}
		});
		btnIniciar.setBounds(398, 10, 83, 21);
		panel.add(btnIniciar);
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setEnabled(false);
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIniciar.setEnabled(true);
				btnFinalizar.setEnabled(false);
				timer.cancel();
				lbReloj.setText("juego finalizo por usuario");
				juegoIniciado = false;
			}
		});
		btnFinalizar.setBounds(398, 40, 83, 21);
		panel.add(btnFinalizar);
		
		btnGuardarPuntaje = new JButton("Guardar Puntaje");
		btnGuardarPuntaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnGuardarPuntaje.setBounds(491, 10, 85, 21);
		panel.add(btnGuardarPuntaje);
		
		btnOpciones = new JButton("opciones");
		btnOpciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOpciones.setBounds(491, 41, 85, 21);
		panel.add(btnOpciones);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 204, 51));
		panel_2.setBounds(0, 69, 586, 394);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		MouseAdapter adaptador = new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent infoEvento) {
				
				JLabel componenteVisual = (JLabel) infoEvento.getSource();

				String cordenadaXy = componenteVisual.getName(); // "2,1"

				String[] cordenadaSeparada = cordenadaXy.split(","); // ["2", "1", "1"]

				int x = Integer.parseInt(cordenadaSeparada[0]);
				int y = Integer.parseInt(cordenadaSeparada[1]);
 				
				ClickUsuario(x, y, false);
			}
		};
		
		hueco0x0 = new JLabel("O");
		hueco0x0.setHorizontalAlignment(SwingConstants.CENTER);
		hueco0x0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		hueco0x0.setBounds(41, 55, 87, 47);
		panel_2.add(hueco0x0);
		
		hueco0x1 = new JLabel("O");
		hueco0x1.setHorizontalAlignment(SwingConstants.CENTER);
		hueco0x1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		hueco0x1.setBounds(156, 55, 87, 47);
		panel_2.add(hueco0x1);
		
		hueco0x2 = new JLabel("O");
		hueco0x2.setHorizontalAlignment(SwingConstants.CENTER);
		hueco0x2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		hueco0x2.setBounds(271, 55, 87, 47);
		panel_2.add(hueco0x2);
		
		hueco0x3 = new JLabel("O");
		hueco0x3.setHorizontalAlignment(SwingConstants.CENTER);
		hueco0x3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		hueco0x3.setBounds(393, 55, 87, 47);
		panel_2.add(hueco0x3);
		
		hueco1x0 = new JLabel("O");
		hueco1x0.setHorizontalAlignment(SwingConstants.CENTER);
		hueco1x0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		hueco1x0.setBounds(41, 127, 87, 47);
		panel_2.add(hueco1x0);
		
		hueco1x1 = new JLabel("O");
		hueco1x1.setHorizontalAlignment(SwingConstants.CENTER);
		hueco1x1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		hueco1x1.setBounds(156, 127, 87, 47);
		panel_2.add(hueco1x1);
		
		hueco1x2 = new JLabel("O");
		hueco1x2.setHorizontalAlignment(SwingConstants.CENTER);
		hueco1x2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		hueco1x2.setBounds(271, 127, 87, 47);
		panel_2.add(hueco1x2);
		
		hueco1x3 = new JLabel("O");
		hueco1x3.setHorizontalAlignment(SwingConstants.CENTER);
		hueco1x3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		hueco1x3.setBounds(393, 127, 87, 47);
		panel_2.add(hueco1x3);
		
		hueco2x0 = new JLabel("O");
		hueco2x0.setHorizontalAlignment(SwingConstants.CENTER);
		hueco2x0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		hueco2x0.setBounds(41, 213, 87, 47);
		panel_2.add(hueco2x0);
		
		hueco2x1 = new JLabel("O");
		hueco2x1.setHorizontalAlignment(SwingConstants.CENTER);
		hueco2x1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		hueco2x1.setBounds(156, 213, 87, 47);
		panel_2.add(hueco2x1);
		
		hueco2x2 = new JLabel("O");
		hueco2x2.setHorizontalAlignment(SwingConstants.CENTER);
		hueco2x2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		hueco2x2.setBounds(271, 213, 87, 47);
		panel_2.add(hueco2x2);
		
		hueco2x3 = new JLabel("O");
		hueco2x3.setHorizontalAlignment(SwingConstants.CENTER);
		hueco2x3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		hueco2x3.setBounds(393, 213, 87, 47);
		panel_2.add(hueco2x3);
		
		hueco3x0 = new JLabel("O");
		hueco3x0.setHorizontalAlignment(SwingConstants.CENTER);
		hueco3x0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		hueco3x0.setBounds(41, 287, 87, 47);
		panel_2.add(hueco3x0);
		
		hueco3x1 = new JLabel("O");
		hueco3x1.setHorizontalAlignment(SwingConstants.CENTER);
		hueco3x1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		hueco3x1.setBounds(156, 287, 87, 47);
		panel_2.add(hueco3x1);
		
		hueco3x2 = new JLabel("O");
		hueco3x2.setHorizontalAlignment(SwingConstants.CENTER);
		hueco3x2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		hueco3x2.setBounds(271, 287, 87, 47);
		panel_2.add(hueco3x2);
		
		hueco3x3 = new JLabel("O");
		hueco3x3.setHorizontalAlignment(SwingConstants.CENTER);
		hueco3x3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		hueco3x3.setBounds(393, 287, 87, 47);
		panel_2.add(hueco3x3);
		
		// Poner nombres para despues sacar las coordanadas
		hueco0x0.setName("1,1");
		hueco0x0.setName("0,0");
		hueco0x1.setName("0,1");
		hueco0x2.setName("0,2");
		hueco0x3.setName("0,3");
		hueco1x0.setName("1,0");
		hueco1x1.setName("1,1");
		hueco1x2.setName("1,2");
		hueco1x3.setName("1,3");
		hueco2x0.setName("2,0");
		hueco2x1.setName("2,1");
		hueco2x2.setName("2,2");
		hueco2x3.setName("2,3");
		hueco3x0.setName("3,0");
		hueco3x1.setName("3,1");
		hueco3x2.setName("3,2");
		hueco3x3.setName("3,3");
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(246, 10, 45, 13);
		panel_2.add(lblNewLabel);
		
		// evento de clic en cada label
		hueco0x0.addMouseListener(adaptador);
		hueco0x1.addMouseListener(adaptador);
		hueco0x2.addMouseListener(adaptador);
		hueco0x3.addMouseListener(adaptador);
		hueco1x0.addMouseListener(adaptador);
		hueco1x1.addMouseListener(adaptador);
		hueco1x2.addMouseListener(adaptador);
		hueco1x3.addMouseListener(adaptador);
		hueco2x0.addMouseListener(adaptador);
		hueco2x1.addMouseListener(adaptador);
		hueco2x2.addMouseListener(adaptador);
		hueco2x3.addMouseListener(adaptador);
		hueco3x0.addMouseListener(adaptador);
		hueco3x1.addMouseListener(adaptador);
		hueco3x2.addMouseListener(adaptador);
		hueco3x3.addMouseListener(adaptador);
		
		pintarTopoPosicionActual();
	}

	private void ClickUsuario(int xClic, int yClic, boolean esBtnIniciar) {
		

	    int x = 0;
	    int y = 0;
	    
	    
		Modelos.Cordenada coractual = configTablero.getPosicionActualTopo();
		
		if (esBtnIniciar == false ) {
			
			if (juegoIniciado == true) {

				if (coractual.getX() == xClic && coractual.getY() == yClic) {
					configTablero.aumentarPuntos();
					lbPuntos.setText(String.valueOf(configTablero.getPuntos()) + " puntos");
				}
				
			}
			
		} else {
			juegoIniciado = true;
			configTablero.setPuntos(0);
			lbPuntos.setText(String.valueOf(configTablero.getPuntos()) + " puntos");
			
			
			timer = new Timer();
	        timer.scheduleAtFixedRate(new TimerTask() {
	            int i = 10;

	            public void run() {

	                lbReloj.setText("Quedan " + i + " segundos");
	                i--;

	                if (i < 0) {
	                    timer.cancel();
		                btnFinalizar.doClick();
		                lbReloj.setText("juego finalizo");
	                }
	            }
	        }, 0, 1000);
		}
		
		
		if (juegoIniciado == true) {

			do {
				Random rand = new Random();
			    x = rand.nextInt(4);
			    y = rand.nextInt(4);
			    
			} while (coractual.getX() == x && coractual.getY() == y);
			
		    
		    Modelos.Cordenada cordenadaNueva = new Modelos.Cordenada(x, y);

		    
			configTablero.setPosicionActualTopo(cordenadaNueva);
			
			
			pintarTopoPosicionActual();
		}
	}


	private void pintarTopoPosicionActual(){
		hueco0x0.setText("");
		hueco0x1.setText("");
		hueco0x2.setText("");
		hueco0x3.setText("");
		hueco1x0.setText("");
		hueco1x1.setText("");
		hueco1x2.setText("");
		hueco1x3.setText("");
		hueco2x0.setText("");
		hueco2x1.setText("");
		hueco2x2.setText("");
		hueco2x3.setText("");
		hueco3x0.setText("");
		hueco3x1.setText("");
		hueco3x2.setText("");
		hueco3x3.setText("");

		ImageIcon iconoHueco = new ImageIcon(getClass().getResource("/imagenes/Hueco.png"));
		
		hueco0x0.setIcon(iconoHueco);
		hueco0x1.setIcon(iconoHueco);
		hueco0x2.setIcon(iconoHueco);
		hueco0x3.setIcon(iconoHueco);
		hueco1x0.setIcon(iconoHueco);
		hueco1x1.setIcon(iconoHueco);
		hueco1x2.setIcon(iconoHueco);
		hueco1x3.setIcon(iconoHueco);
		hueco2x0.setIcon(iconoHueco);
		hueco2x1.setIcon(iconoHueco);
		hueco2x2.setIcon(iconoHueco);
		hueco2x3.setIcon(iconoHueco);
		hueco3x0.setIcon(iconoHueco);
		hueco3x1.setIcon(iconoHueco);
		hueco3x2.setIcon(iconoHueco);
		hueco3x3.setIcon(iconoHueco);
		
		Modelos.Cordenada cor = configTablero.getPosicionActualTopo();
		int x = cor.getX();
		int y = cor.getY();
		
		// lbReloj.setText(x + ", " + y);
		
		ImageIcon iconoTopo = new ImageIcon(getClass().getResource("/imagenes/Topo.png"));
		
		if (x == 0 && y == 0)
			hueco0x0.setIcon(iconoTopo);
		else if (x == 0 && y == 1)
			hueco0x1.setIcon(iconoTopo);
		else if (x == 0 && y == 2)
			hueco0x2.setIcon(iconoTopo);
		else if (x == 0 && y == 3)
			hueco0x3.setIcon(iconoTopo);
		else  if (x == 1 && y == 0)
			hueco1x0.setIcon(iconoTopo);
		else if (x == 1 && y == 1)
			hueco1x1.setIcon(iconoTopo);
		else if (x == 1 && y == 2)
			hueco1x2.setIcon(iconoTopo);
		else if (x == 1 && y == 3)
			hueco1x3.setIcon(iconoTopo);
		else if (x == 2 && y == 0)
			hueco2x0.setIcon(iconoTopo);
		else if (x == 2 && y == 1)
			hueco2x1.setIcon(iconoTopo);
		else if (x == 2 && y == 2)
			hueco2x2.setIcon(iconoTopo);
		else if (x == 2 && y == 3)
			hueco2x3.setIcon(iconoTopo);
		else if (x == 3 && y == 0)
			hueco3x0.setIcon(iconoTopo);
		else if (x == 3 && y == 1)
			hueco3x1.setIcon(iconoTopo);
		else if (x == 3 && y == 2)
			hueco3x2.setIcon(iconoTopo);
		else if (x == 3 && y == 3)
			hueco3x3.setIcon(iconoTopo);
	}
}