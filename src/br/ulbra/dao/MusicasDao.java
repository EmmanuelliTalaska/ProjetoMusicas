/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.dao;

import br.ulbra.entity.Musicas;
import br.ulbra.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MusicasDao {

    Connection conn;

    public MusicasDao() throws SQLException {
        conn = ConnectionFactory.getConnection();
    }

    public boolean checkLogin(String email, String senha) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {
            stmt = conn.prepareStatement("select * FROM tbUsuario"
                    + " WHERE emailUsu = ? and senhaUsu = ?");
            stmt.setString(1, email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if (rs.next()) {
                check = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(conn, (com.mysql.jdbc.PreparedStatement) stmt, rs);
        }
        return check;
    }

    public ArrayList<Musicas> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Musicas> musica = new ArrayList<>();
        try {
            stmt = conn.prepareStatement("SELECT * FROM musicas");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Musicas musicas = new Musicas();
                musicas.setIdMusica(rs.getInt("idMusica"));
                musicas.setNomeMusica(rs.getString("nomeMusica"));
                musicas.setArtista(rs.getString("artista"));
                musicas.setAlbum(rs.getString("album"));
                musicas.setGenero(rs.getString("genero"));
                musicas.setAno(rs.getInt("ano"));
                musicas.setProdutora(rs.getString("produtora"));
                musicas.setDuracao(rs.getDouble("duracao"));
                musica.add(musicas);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null,
                    ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }
        return (ArrayList<Musicas>) musica;
    }

    public List<Musicas> readForDesc(String nomeMusica) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Musicas> musica = new ArrayList<>();
        try {
            stmt = conn.prepareStatement(
                    "SELECT * FROM musicas WHERE nomeMusica LIKE ?");
            stmt.setString(1, "%" + nomeMusica + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Musicas musicas = new Musicas();
                musicas.setIdMusica(rs.getInt("idMusica"));
                musicas.setNomeMusica(rs.getString("nomeMusica"));
                musicas.setArtista(rs.getString("artista"));
                musicas.setAlbum(rs.getString("album"));
                musicas.setGenero(rs.getString("genero"));
                musicas.setAno(rs.getInt("ano"));
                musicas.setProdutora(rs.getString("produtora"));
                musicas.setDuracao(rs.getDouble("duracao"));
                musica.add(musicas);
            }
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }
        return musica;
    }
    
    public List<Musicas> listarTNomeMusica(String nomeMusica, int tipo) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Musicas> musica = new ArrayList<>();
        try {
            stmt = conn.prepareStatement(
                    "SELECT * FROM musicas WHERE nomeMusica LIKE ?");
            stmt.setString(1, "%" + nomeMusica + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Musicas musicas = new Musicas();
                musicas.setIdMusica(rs.getInt("idMusica"));
                musicas.setNomeMusica(rs.getString("nomeMusica"));
                musicas.setArtista(rs.getString("artista"));
                musicas.setAlbum(rs.getString("album"));
                musicas.setGenero(rs.getString("genero"));
                musicas.setAno(rs.getInt("ano"));
                musicas.setProdutora(rs.getString("produtora"));
                musicas.setDuracao(rs.getDouble("duracao"));
                musica.add(musicas);
            }
            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }
        return musica;
    }
    public List<Musicas> listarTArtista(String nomeMusica, int tipo) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Musicas> musica = new ArrayList<>();
      
           try {
           stmt = conn.prepareStatement(
                    "SELECT * FROM musicas WHERE artista LIKE ?");
            stmt.setString(1, "%" + nomeMusica + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Musicas musicas = new Musicas();
                musicas.setIdMusica(rs.getInt("idMusica"));
                musicas.setNomeMusica(rs.getString("nomeMusica"));
                musicas.setArtista(rs.getString("artista"));
                musicas.setAlbum(rs.getString("album"));
                musicas.setGenero(rs.getString("genero"));
                musicas.setAno(rs.getInt("ano"));
                musicas.setProdutora(rs.getString("produtora"));
                musicas.setDuracao(rs.getDouble("duracao"));
                musica.add(musicas);
            }            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(conn, stmt, rs);
        }
        return musica;
    }

    public void delete(Musicas m) {
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("DELETE FROM musicas WHERE idMusica = ?");
            stmt.setInt(1, m.getIdMusica());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Música excluída com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: "
                    + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(conn, (com.mysql.jdbc.PreparedStatement) stmt);
        }
    }

    public void create(Musicas m) {
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("INSERT INTO musicas(nomeMusica ,artista, album, genero, ano, produtora, duracao) VALUES( ?,  ?,  ?,  ?,  ?, ?, ?)");
            stmt.setString(1, m.getNomeMusica());
            stmt.setString(2, m.getArtista());
            stmt.setString(3, m.getAlbum());
            stmt.setString(4, m.getGenero());
            stmt.setInt(5, m.getAno());
            stmt.setString(6, m.getProdutora());
            stmt.setDouble(7, m.getDuracao());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Música salva com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage()
            );
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

    public void update(Musicas m) {
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("UPDATE musicas SET nomeMusica = ?, artista = ?, album = ? , genero = ? , ano = ? , produtora = ? , duracao = ? WHERE idMusica = ?");
            stmt.setString(1, m.getNomeMusica());
            stmt.setString(2, m.getArtista());
            stmt.setString(3, m.getAlbum());
            stmt.setString(4, m.getGenero());
            stmt.setInt(5, m.getAno());
            stmt.setString(6, m.getProdutora());
            stmt.setDouble(7, m.getDuracao());
            stmt.setInt(8, m.getIdMusica());
        
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(conn, stmt);
        }
    }

}
