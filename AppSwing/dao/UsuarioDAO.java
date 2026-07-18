package AppSwing.dao;

import AppSwing.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public void inserir(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nome, idade) VALUES (?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNome());
            stmt.setInt(2, usuario.getIdade());

            stmt.executeUpdate();
            System.out.println("✅ Usuário salvo com sucesso!");

        } catch (SQLException e) {
            System.out.println("❌ Erro ao salvar: " + e.getMessage());
        }
    }
}
