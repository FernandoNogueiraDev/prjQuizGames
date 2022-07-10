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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Pergunta2 extends JFrame {

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
					Pergunta2 frame = new Pergunta2();
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
	public Pergunta2() {
		setResizable(false);
		setAlwaysOnTop(true);
		setTitle("Pergunta 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 340);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Pergunta2.class.getResource("/Img/esmeraldas_do_chaos.png")));
		lblNewLabel.setBounds(261, 73, 152, 159);
		contentPane.add(lblNewLabel);
		
		JRadioButton RadioButtonOpcao1 = new JRadioButton("Rochas do poder");
		buttonGroup.add(RadioButtonOpcao1);
		RadioButtonOpcao1.setBounds(20, 123, 160, 23);
		contentPane.add(RadioButtonOpcao1);
		
		JRadioButton RadioButtonOpcao2 = new JRadioButton("Pedras misticas");
		buttonGroup.add(RadioButtonOpcao2);
		RadioButtonOpcao2.setBounds(20, 163, 160, 23);
		contentPane.add(RadioButtonOpcao2);
		
		JRadioButton rdbEsmeraldas = new JRadioButton("Esmeraldas do chaos");
		buttonGroup.add(rdbEsmeraldas);
		rdbEsmeraldas.setBounds(20, 203, 160, 23);
		contentPane.add(rdbEsmeraldas);
		
		JRadioButton RadioButtonOpcao4 = new JRadioButton("J\u00F3ias do Infinito");
		buttonGroup.add(RadioButtonOpcao4);
		RadioButtonOpcao4.setBounds(20, 243, 160, 23);
		contentPane.add(RadioButtonOpcao4);
		
		JButton btnNewButton = new JButton("Pr\u00F3xima Pergunta");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(263, 255, 150, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("<html>Na franquia Sonic existem 7 rochas que concedem poder  a quem utiliza, qual o nome dessas rochas?</html>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(20, 27, 228, 75);
		contentPane.add(lblNewLabel_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			
					


					if(RadioButtonOpcao1.isSelected()==false && RadioButtonOpcao2.isSelected()==false && rdbEsmeraldas.isSelected()==false && RadioButtonOpcao4.isSelected()==false)
					{
					JOptionPane.showMessageDialog(null,"Escolha uma opção");


					}
					else {

					if(rdbEsmeraldas.isSelected())
					{
					Pontos.Acerto++;

					}
					//Senão escolheu opção incorreta//
					//acumular um erro//

					else
					{

					Pontos.Erro++;

					}

					Pergunta3 janelinha = new Pergunta3();
					janelinha.setLocationRelativeTo(null);
					janelinha.setVisible(true);
					Pergunta2.this.dispose();


					}
				}
			
		
		});
		
	}
}
