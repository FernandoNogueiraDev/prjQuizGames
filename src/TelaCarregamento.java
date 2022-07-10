import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.ImageIcon;

public class TelaCarregamento extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel texto;
	private JLabel percent;
	private JProgressBar barra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCarregamento frame = new TelaCarregamento();
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
	public TelaCarregamento() {
		setResizable(false);
		setTitle("Tela de Carregamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		texto = new JLabel("New label");
		texto.setBounds(199, 68, 175, 27);
		contentPane.add(texto);
		
		percent = new JLabel("New label");
		percent.setBounds(59, 68, 81, 27);
		contentPane.add(percent);
		
		barra = new JProgressBar();
		barra.setForeground(Color.GREEN);
		barra.setBounds(360, 211, -11, -11);
		contentPane.add(barra);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaCarregamento.class.getResource("/Img/sonicCorrendo.gif")));
		lblNewLabel.setBounds(150, 106, 130, 144);
		contentPane.add(lblNewLabel);
		
		
		
	
		new Thread(new carregar()).start();
		
	}
	
	
	
	//implementar a Thread //
	//criar o metodo para percorrer de 0 á 100//
	public class carregar implements Runnable{
	//metodo para percorrer a barra de progresso//
	public void run (){

	//laço de repetição para percorrer progresso//
	for ( int i =0 ; i < 101 ; i ++ )

	 {
	/*tratamento de erro chamado try--cath--
	para o caso da barra não inicializar*/
	try {

	/* Método Sleep em milisegundos– Tempo de Vida da Thread */
	Thread.sleep(100) ;
	/* Chamar a progressive Bar e adicionar o contador para
	* ir de 1 até 100. ( variavel do contador) */

	 barra.setValue( i ) ;
	/* Mensagem no JLABEL com if e pegando informaçoes
	* da progressive Bar */
	if (barra.getValue() <= 50 )
	{
	/* Setar Mensagem do JLABEL de acordo com progressive Bar */
	texto.setText("Carregando Informações.....");
	percent.setText(i + "%");
	}
	else if (barra.getValue() <= 80 )
	{
	/* Setar Mensagem do JLABEL de acordo com progressive Bar */
	texto.setText("Carregando Telas.....");
	percent.setText(i + "%");
	}
	else if (barra.getValue() <= 90 )
	{
	/* Setar Mensagem do JLABEL de acordo com progressive Bar */
	texto.setText("Carregando Quiz.....");
	percent.setText(i + "%");
	}
	else
	{
	/* Setar Mensagem do JLABEL de acordo com progressive Bar */
	texto.setText("Iniciar Quiz.....");
	percent.setText(i + "%");

	}

	//cath -- Tratamento de erro//
	} catch (Exception erro) {

	 JOptionPane.showMessageDialog(null,erro);
	}
	}

	 //chamar proxima tela apos as 2 chaves do catch//
	Pergunta1 tela= new Pergunta1();//constroi a tela//
	TelaCarregamento.this.dispose();//fecha a tela atual//
	tela.setLocationRelativeTo(null);
	tela.setVisible(true);//deixa visivel*/
	

	}

	 }
	}
	
	
	
	
	
	

