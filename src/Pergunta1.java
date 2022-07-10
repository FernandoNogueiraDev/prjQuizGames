import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pergunta1 extends JFrame {

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
					Pergunta1 frame = new Pergunta1();
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
	public Pergunta1() {
		setResizable(false);
		setTitle("Pergunta 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 340);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Qual o nome deste personagem?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(22, 36, 266, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Pergunta1.class.getResource("/Img/mario.png")));
		lblNewLabel_1.setBounds(279, 36, 109, 208);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbMario = new JRadioButton("Mario");
		buttonGroup.add(rdbMario);
		rdbMario.setBounds(22, 100, 160, 23);
		contentPane.add(rdbMario);
		
		JRadioButton RadioButtonOpcao2 = new JRadioButton("Luigi");
		buttonGroup.add(RadioButtonOpcao2);
		RadioButtonOpcao2.setBounds(22, 140, 160, 23);
		contentPane.add(RadioButtonOpcao2);
		
		JRadioButton RadioButtonOpcao3 = new JRadioButton("Link");
		buttonGroup.add(RadioButtonOpcao3);
		RadioButtonOpcao3.setBounds(22, 180, 160, 23);
		contentPane.add(RadioButtonOpcao3);
		
		JRadioButton RadioButtonOpcao4 = new JRadioButton("Yoshi");
		buttonGroup.add(RadioButtonOpcao4);
		RadioButtonOpcao4.setBounds(22, 220, 160, 23);
		contentPane.add(RadioButtonOpcao4);
		
		
		
		JButton btnNewButton = new JButton("Pr\u00F3xima Pergunta");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(263, 255, 150, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				Pontos.Acerto = 0;
				Pontos.Erro = 0;


				if(rdbMario.isSelected()==false && RadioButtonOpcao2.isSelected()==false && RadioButtonOpcao3.isSelected()==false && RadioButtonOpcao4.isSelected()==false)
				{
				JOptionPane.showMessageDialog(null,"Escolha uma opção");


				}
				else {

				if(rdbMario.isSelected())
				{
				Pontos.Acerto++;

				}
				//Senão escolheu opção incorreta//
				//acumular um erro//

				else
				{

				Pontos.Erro++;

				}

				Pergunta2 janelinha = new Pergunta2();
				janelinha.setLocationRelativeTo(null);
				janelinha.setVisible(true);
				Pergunta1.this.dispose();


				}
			}
			
		});
		
	}
	
}

