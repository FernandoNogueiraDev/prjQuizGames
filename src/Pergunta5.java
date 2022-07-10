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
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pergunta5 extends JFrame {

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
					Pergunta5 frame = new Pergunta5();
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
	public Pergunta5() {
		setTitle("Pergunta 5");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 340);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton RadioButtonOpcao1 = new JRadioButton("Star Fox 64");
		buttonGroup.add(RadioButtonOpcao1);
		RadioButtonOpcao1.setBounds(20, 125, 160, 23);
		contentPane.add(RadioButtonOpcao1);
		
		JRadioButton RadioButtonOpcao2 = new JRadioButton("Super Smash Brothers");
		buttonGroup.add(RadioButtonOpcao2);
		RadioButtonOpcao2.setBounds(20, 165, 160, 23);
		contentPane.add(RadioButtonOpcao2);
		
		JRadioButton rdbPilotwings = new JRadioButton("Pilotwings");
		buttonGroup.add(rdbPilotwings);
		rdbPilotwings.setBounds(20, 205, 160, 23);
		contentPane.add(rdbPilotwings);
		
		JRadioButton RadioButtonOpcao4 = new JRadioButton("F-Zero X");
		buttonGroup.add(RadioButtonOpcao4);
		RadioButtonOpcao4.setBounds(20, 245, 160, 23);
		contentPane.add(RadioButtonOpcao4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Pergunta5.class.getResource("/Img/nintendo64.png")));
		lblNewLabel.setBounds(247, 102, 160, 142);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Pr\u00F3xima Pergunta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				


				if(RadioButtonOpcao1.isSelected()==false && RadioButtonOpcao2.isSelected()==false && rdbPilotwings.isSelected()==false && RadioButtonOpcao4.isSelected()==false)
				{
				JOptionPane.showMessageDialog(null,"Escolha uma opção");


				}
				else {

				if(rdbPilotwings.isSelected())
				{
				Pontos.Acerto++;

				}
				//Senão escolheu opção incorreta//
				//acumular um erro//

				else
				{

				Pontos.Erro++;

				}

				TelaFinal janelinha = new TelaFinal();
				janelinha.setLocationRelativeTo(null);
				janelinha.setVisible(true);
				Pergunta5.this.dispose();
				}
			}
			

		
		
	});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(263, 255, 150, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("<html>No lan\u00E7amento do console  Nintendo 64 foram lan\u00E7ados 2 jogos em seu dia de lan\u00E7amento, um deles sendo Mario 64, qual o nome do outro?</html>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(20, 26, 239, 92);
		contentPane.add(lblNewLabel_1);
	}
}
		
