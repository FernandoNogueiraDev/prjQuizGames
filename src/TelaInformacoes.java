import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class TelaInformacoes extends JFrame {

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
					TelaInformacoes frame = new TelaInformacoes();
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
	public TelaInformacoes() {
		setResizable(false);
		setTitle("Informa\u00E7\u00F5es");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quiz Baseado em V\u00EDdeo Games ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(109, 26, 215, 84);
		contentPane.add(lblNewLabel);
		
		JLabel lblDesenvolvidoPorFernando = new JLabel("Esse quiz se baseia em perguntas sobre conhecimentos, tr\u00EDvia e ");
		lblDesenvolvidoPorFernando.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDesenvolvidoPorFernando.setBounds(10, 155, 414, 37);
		contentPane.add(lblDesenvolvidoPorFernando);
		
		JLabel lblDesenvolvidoPorFernando_1 = new JLabel("curiosidades sobre o mundo dos games.");
		lblDesenvolvidoPorFernando_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDesenvolvidoPorFernando_1.setBounds(10, 178, 414, 37);
		contentPane.add(lblDesenvolvidoPorFernando_1);
	}
}
