/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.entity;

/**
 *
 * @author s.lucas
 */
public class Musicas {

    private int idMusica;
    private String nomeMusica;
    private String artista;
    private String album;
    private String genero;
    private int ano;
    private String produtora;
    private double duracao;
    
    public Musicas(int idMusica, String nomeMusica,
            String artista, String album,
            String genero, int ano, String produtora, double duracao){
        this.idMusica = idMusica;
        this.nomeMusica = nomeMusica;
        this.artista = artista;
        this.album = album;
        this.genero = genero;
        this.ano = ano;
        this.produtora = produtora;
        this.duracao = duracao;
        }

    public Musicas() {
  
    }
    
        public String toString(){
            return  "ID: " + this.idMusica
                    +"Nome: " + this.nomeMusica
                    +"Artista: " + this.artista
                    +"Album: "+ this.album
                    +"Genero: " + this.genero
                    +"Ano: " + this.ano
                    +"Produta: " + this.produtora
                    +"Duração: " + this.duracao;
                    }

    public int getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(int idMusica) {
        this.idMusica = idMusica;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    
    
}
