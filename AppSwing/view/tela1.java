package AppSwing.view;

import AppSwing.dao.UsuarioDAO;
import AppSwing.model.Usuario;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tela1 extends JFrame {
    public tela1() {
        setTitle("Cadastro de Usuário");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Campos
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 20, 80, 25);
        add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(100, 20, 200, 25);
        add(txtNome);

        JLabel lblIdade = new JLabel("Idade:");
        lblIdade.setBounds(20, 60, 80, 25);
        add(lblIdade);

        JTextField txtIdade = new JTextField();
        txtIdade.setBounds(100, 60, 200, 25);
        add(txtIdade);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(120, 110, 100, 30);
        add(btnSalvar);

        // Ação do botão
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nome = txtNome.getText();
                    int idade = Integer.parseInt(txtIdade.getText());

                    Usuario usuario = new Usuario(nome, idade);
                    UsuarioDAO dao = new UsuarioDAO();
                    dao.inserir(usuario);

                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                    txtNome.setText("");
                    txtIdade.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Idade inválida!");
                }
            }
        });
    }
    // Método principal para rodar o programa
    public static void main(String[] args) {
        new tela1().setVisible(true);
    }

}
