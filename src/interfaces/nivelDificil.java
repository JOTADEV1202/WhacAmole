package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class nivelDificil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nivelDificil frame = new nivelDificil();
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
	public nivelDificil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 0, 0));
		panel.setBounds(0, 0, 586, 86);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel LabelTiempo = new JLabel("Tiempo");
		LabelTiempo.setFont(new Font("MS UI Gothic", Font.BOLD, 12));
		LabelTiempo.setBounds(10, 10, 45, 13);
		panel.add(LabelTiempo);
		
		JLabel reloj = new JLabel("New label");
		reloj.setBounds(10, 47, 45, 13);
		panel.add(reloj);
		
		JLabel lblNewLabel_2 = new JLabel("Puntaje");
		lblNewLabel_2.setFont(new Font("MS UI Gothic", Font.BOLD, 12));
		lblNewLabel_2.setBounds(112, 11, 45, 13);
		panel.add(lblNewLabel_2);
		
		JLabel Puntos = new JLabel("New label");
		Puntos.setBounds(112, 47, 45, 13);
		panel.add(Puntos);
		
		JLabel lblNewLabel = new JLabel("Configuracion");
		lblNewLabel.setFont(new Font("MS UI Gothic", Font.BOLD, 12));
		lblNewLabel.setBounds(494, 25, 82, 35);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 204, 153));
		panel_1.setBounds(0, 88, 586, 365);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
	}

}
