package Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDAO {

    // Atributos

    private Connection connection;

    public ConnectionDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    // Métodos

public void criaTabela() {
    String sql = "CREATE TABLE IF NOT EXISTS MINHA_TABELA (ID SERIAL PRIMARY KEY,NOME VARCHAR(255),EMAIL VARCHAR(255))";
    try (Statement stmt = connection.createStatement()) {
    stmt.execute(sql);
    System.out.println("Tabela criada com sucesso.");
    } catch (SQLException e) {
    throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
    } finally{
    ConnectionFactory.closeConnection(this.connection);
    }
    }

}