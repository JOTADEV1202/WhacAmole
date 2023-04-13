package interfaces;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class nivelFacil extends JFrame implements ActionListener{

	private JPanel contentPane;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nivelFacil frame = new nivelFacil();
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
	public nivelFacil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(new Color(204, 0, 0));
		panel.setBounds(0, 0, 586, 74);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Configuracion");
		lblNewLabel.setFont(new Font("MS UI Gothic", Font.BOLD, 12));
		lblNewLabel.setBounds(476, 19, 82, 35);
		panel.add(lblNewLabel);
		
		JLabel LabelTiempo = new JLabel("Tiempo");
		LabelTiempo.setBounds(10, 10, 45, 13);
		panel.add(LabelTiempo);
		LabelTiempo.setFont(new Font("MS UI Gothic", Font.BOLD, 12));
		
		JLabel reloj = new JLabel("New label");
		reloj.setBounds(10, 41, 45, 13);
		panel.add(reloj);
		
		JLabel lblNewLabel_2 = new JLabel("Puntaje");
		lblNewLabel_2.setBounds(180, 10, 45, 13);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("MS UI Gothic", Font.BOLD, 12));
		
		JLabel Puntos = new JLabel("New label");
		Puntos.setBounds(180, 41, 45, 13);
		panel.add(Puntos);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(51, 204, 153));
		panel_2.setBounds(0, 69, 586, 394);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
