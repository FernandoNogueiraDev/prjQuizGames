import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaFinal extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Chamar classe Pontos //
	//Construir objeto --coloquei a letra d//
	Pontos d = new Pontos();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFinal frame = new TelaFinal();
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
	public TelaFinal() {
		setResizable(false);
		setTitle("Resultado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fim do Quiz");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(166, 21, 90, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Acertos:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 78, 78, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultados");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(264, 153, 128, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel acerto = new JLabel("New label");
		acerto.setBounds(118, 96, 46, 14);
		contentPane.add(acerto);
		
		JLabel erro = new JLabel("New label");
		erro.setBounds(118, 145, 46, 14);
		contentPane.add(erro);
		
		JLabel porAcerto = new JLabel("New label");
		porAcerto.setBounds(118, 206, 46, 14);
		contentPane.add(porAcerto);
		
		JLabel porErro = new JLabel("New label");
		porErro.setBounds(118, 270, 36, 14);
		contentPane.add(porErro);
		
		
		double porcentagemAcertos,porcentagemErros;

		porcentagemAcertos = 100 * Pontos.getAcertos() / 5;
		porcentagemErros = 100 * Pontos.getErros() / 5;
		//Exibir a porcentagem de erro e acerto//
		porAcerto.setText(String.valueOf(porcentagemAcertos));
		porErro.setText(String.valueOf(porcentagemErros));
		//Exibir a quantidade de acerto e erro//
		acerto.setText(String.valueOf(Pontos.getAcertos()));
		erro.setText(String.valueOf(Pontos.getErros()));
		
		JLabel lblNewLabel_1_1 = new JLabel("Erros:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 135, 78, 46);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("% Acertos:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(10, 195, 98, 46);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("% Erros:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(10, 252, 78, 46);
		contentPane.add(lblNewLabel_1_3);
		
		JButton btnNewButton_1 = new JButton("Voltar Ao In\u00EDcio");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial janelinha = new TelaInicial();
				janelinha.setLocationRelativeTo(null);
				janelinha.setVisible(true);
				TelaFinal.this.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(242, 266, 150, 23);
		contentPane.add(btnNewButton_1);
		
		
	}
}
