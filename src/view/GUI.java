package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CadastroConta;
import controller.Conta;
import model.RepositorioContasArray;
import model.RepositorioListaContas;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero;
	private JTextField txtSaldo;
	private JTextField txtValor;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		
		JLabel lblNmero = new JLabel("Número");
		
		JLabel lblSaldo = new JLabel("Saldo");
		
		JLabel lblValor = new JLabel("Valor");
		
		JLabel lblResultado = new JLabel("Resultado");
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		
		txtSaldo = new JTextField();
		txtSaldo.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setText("");
		txtValor.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setColumns(10);
		
		JButton btnCriarConta = new JButton("Criar Conta");
		btnCriarConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conta conta = new Conta();
				conta.setNumero(txtNumero.getText());
				conta.setSaldo(Double.parseDouble(txtSaldo.getText()));
//				CadastroConta cd = new CadastroConta(RespositorioContasArray.getInstance());
				cd.inserir(conta);
				txtResultado.setText(conta.getNumero());
			}
		});
		
		JButton btnSaldo = new JButton("Saldo");
		
		JButton btnCreditar = new JButton("Creditar");
		
		JButton btnDebitar = new JButton("Debitar");
		
		JButton btnFechar = new JButton("Fechar");
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conta conta = new Conta();
				conta.setNumero(txtNumero.getText());
				conta.setSaldo(Double.parseDouble(txtSaldo.getText()));
				RepositorioContasArray.getInstance().inserir(conta);
				JOptionPane.showMessageDialog(null, "Conta adicionada com sucesso.");
			}
		});
		
		JButton btnRemover = new JButton("Remover");
		
		JButton btnProcurar = new JButton("Procurar");
		
		JButton btnAtualizar = new JButton("Atualizar");
		
		JScrollPane scrollPane = new JScrollPane();
		
		JCheckBox chckbxCheck = new JCheckBox("Check");
		
		JButton btnCheck = new JButton("Check");
		
		JComboBox comboBox = new JComboBox();
		
		JButton btnCarregar = new JButton("Carregar");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(chckbxCheck)
									.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(btnCheck)
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblNmero)
										.addGap(32))
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblResultado)
										.addGap(18)))
								.addComponent(lblSaldo)
								.addComponent(lblValor))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(txtSaldo, 124, 124, Short.MAX_VALUE)
										.addComponent(txtValor, 124, 124, 124)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(2)))
									.addGap(18))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(txtResultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnSaldo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnCriarConta, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnCreditar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnDebitar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnFechar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGap(36)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(comboBox, 0, 130, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnAtualizar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
										.addComponent(btnProcurar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
										.addComponent(btnRemover, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
										.addComponent(btnAdicionar, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
									.addGap(11)))
							.addGap(6))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnCarregar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addContainerGap())))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addContainerGap()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnCriarConta))
											.addGap(25)
											.addComponent(lblSaldo)
											.addGap(28)
											.addComponent(lblValor)
											.addGap(18)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(btnFechar)
												.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
													.addComponent(lblResultado)
													.addComponent(txtResultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
										.addComponent(lblNmero)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(btnAdicionar)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnRemover)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
												.addComponent(btnProcurar)
												.addComponent(btnCreditar)))
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(51)
											.addComponent(txtSaldo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnAtualizar)
										.addComponent(btnDebitar)
										.addComponent(txtValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addGap(26)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(chckbxCheck)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnCheck))
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnCarregar))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(39)
							.addComponent(btnSaldo)))
					.addContainerGap(58, Short.MAX_VALUE))
		);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		panel.setLayout(gl_panel);
	}
}
