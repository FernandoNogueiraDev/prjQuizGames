import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pergunta4 extends JFrame {

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
					Pergunta4 frame = new Pergunta4();
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
	public Pergunta4() {
		setResizable(false);
		setTitle("Pergunta 4");
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 340);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JRadioButton RadioButtonOpcao1 = new JRadioButton("Chaos");
		buttonGroup.add(RadioButtonOpcao1);
		RadioButtonOpcao1.setBounds(20, 101, 160, 23);
		contentPane.add(RadioButtonOpcao1);

		JRadioButton RadioButtonOpcao2 = new JRadioButton("Golbez");
		buttonGroup.add(RadioButtonOpcao2);
		RadioButtonOpcao2.setBounds(20, 141, 160, 23);
		contentPane.add(RadioButtonOpcao2);

		JRadioButton RadioButtonOpcao3 = new JRadioButton("Exdeath");
		buttonGroup.add(RadioButtonOpcao3);
		RadioButtonOpcao3.setBounds(20, 181, 160, 23);
		contentPane.add(RadioButtonOpcao3);

		JRadioButton rdbSephiroth = new JRadioButton("Sephiroth");
		buttonGroup.add(rdbSephiroth);
		rdbSephiroth.setBounds(20, 221, 160, 23);
		contentPane.add(rdbSephiroth);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Pergunta4.class.getResource("/Img/sephiroth.png")));
		lblNewLabel.setBounds(244, 33, 163, 222);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Pr\u00F3xima Pergunta");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				if(RadioButtonOpcao1.isSelected()==false && RadioButtonOpcao2.isSelected()==false && RadioButtonOpcao3.isSelected()==false && rdbSephiroth.isSelected()==false)
				{
				JOptionPane.showMessageDialog(null,"Escolha uma opção");


				}
				else {

				if(rdbSephiroth.isSelected())
				{
				Pontos.Acerto++;

				}
				//Senão escolheu opção incorreta//
				//acumular um erro//

				else
				{

				Pontos.Erro++;

				}

				Pergunta5 janelinha = new Pergunta5();
				janelinha.setLocationRelativeTo(null);
				janelinha.setVisible(true);
				Pergunta4.this.dispose();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(254, 266, 150, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("<html>Qual \u00E9 o nome do Antagonista Principal de Final Fantasy 7?</html>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(20, 33, 180, 61);
		contentPane.add(lblNewLabel_1);
		
	}
		
		
	}


	
