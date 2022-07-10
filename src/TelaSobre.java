import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class TelaSobre extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSobre frame = new TelaSobre();
					frame.setLocationRelativeTo(null);
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
	public TelaSobre() {
		setResizable(false);
		setTitle("Sobre");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDesenvolvidoPorFernando = new JLabel("Desenvolvido Por: Fernando Almeida de Jesus Nogueira N\u00BA10");
		lblDesenvolvidoPorFernando.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDesenvolvidoPorFernando.setBounds(10, 72, 414, 25);
		contentPane.add(lblDesenvolvidoPorFernando);
		
		JLabel lblTurmads = new JLabel("Turma: 2\u00BADS");
		lblTurmads.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTurmads.setBounds(10, 112, 414, 25);
		contentPane.add(lblTurmads);
		
		JLabel lblVersoBeta = new JLabel("Vers\u00E3o: 1.0");
		lblVersoBeta.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVersoBeta.setBounds(10, 152, 414, 25);
		contentPane.add(lblVersoBeta);
	}

}
