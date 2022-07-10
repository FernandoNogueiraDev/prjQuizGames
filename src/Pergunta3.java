import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pergunta3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pergunta3 frame = new Pergunta3();
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
	public Pergunta3() {
		setResizable(false);
		setTitle("Pergunta 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 340);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton RadioButtonOpcao1 = new JRadioButton("Beat'em up");
		buttonGroup.add(RadioButtonOpcao1);
		RadioButtonOpcao1.setBounds(19, 113, 150, 23);
		contentPane.add(RadioButtonOpcao1);
		
		JRadioButton rdbHackAndSlash = new JRadioButton("Hack and Slash");
		buttonGroup.add(rdbHackAndSlash);
		rdbHackAndSlash.setBounds(19, 153, 150, 23);
		contentPane.add(rdbHackAndSlash);
		
		JRadioButton RadioButtonOpcao3 = new JRadioButton("RPG");
		buttonGroup.add(RadioButtonOpcao3);
		RadioButtonOpcao3.setBounds(19, 193, 150, 23);
		contentPane.add(RadioButtonOpcao3);
		
		JRadioButton RadioButtonOpcao4 = new JRadioButton("Simula\u00E7\u00E3o");
		buttonGroup.add(RadioButtonOpcao4);
		RadioButtonOpcao4.setBounds(19, 233, 150, 23);
		contentPane.add(RadioButtonOpcao4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Pergunta3.class.getResource("/Img/kratos.png")));
		lblNewLabel.setBounds(218, 69, 186, 165);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Pr\u00F3xima Pergunta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					


					if(RadioButtonOpcao1.isSelected()==false && rdbHackAndSlash.isSelected()==false && RadioButtonOpcao3.isSelected()==false && RadioButtonOpcao4.isSelected()==false)
					{
					JOptionPane.showMessageDialog(null,"Escolha uma opção");


					}
					else {

					if(rdbHackAndSlash.isSelected())
					{
					Pontos.Acerto++;

					}
					//Senão escolheu opção incorreta//
					//acumular um erro//

					else
					{

					Pontos.Erro++;

					}

					Pergunta4 janelinha = new Pergunta4();
					janelinha.setLocationRelativeTo(null);
					janelinha.setVisible(true);
					Pergunta3.this.dispose();
					}
				}
				

			
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(263, 255, 150, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("<html>Qual \u00E9 o nome do tipo de gameplay do jogo God of War?</html>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(19, 37, 203, 58);
		contentPane.add(lblNewLabel_1);
	}
}
