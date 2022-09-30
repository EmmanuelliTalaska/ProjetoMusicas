
package br.ulbra.entity;


public class Usuario {
    private int idUsu;
    private String nomeUsu;
    private String cep;
    private String emailUsu;
    private String senhaUsu;
    private String foneUsu;
    private int sexoUsu;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private int numero;
 
    public Usuario(){
        
    }
    public Usuario(int idUsu, String nomeUsu,
            String emailUsu, String senhaUsu,
            String foneUsu, int sexoUsu){
        this.idUsu = idUsu;
        this.nomeUsu = nomeUsu;
        this.cep = cep;
        this.emailUsu = emailUsu;
        this.senhaUsu = senhaUsu;
        this.foneUsu = foneUsu;
        this.sexoUsu = sexoUsu;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
        
        }
        public String toString(){
            return  "ID " + this.idUsu
                    +"Nome: " + this.nomeUsu
                    +"CEP: " + this.cep
                    +"Email: " + this.emailUsu
                    +"Senha: "+ this.senhaUsu
                    +"Fone: " + this.foneUsu
                    +"Sexo: " + this.sexoUsu
                    +"Logradouro: " + this.logradouro
                    +"Bairro: " + this.bairro
                    +"Cidade: " + this.cidade
                    +"Estado: " + this.estado
                    +"Número: " + this.numero;
                    

                    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

    public String getFoneUsu() {
        return foneUsu;
    }

    public void setFoneUsu(String foneUsu) {
        this.foneUsu = foneUsu;
    }

    public int getSexoUsu() {
        return sexoUsu;
    }

    public void setSexoUsu(int sexoUsu) {
        this.sexoUsu = sexoUsu;
    }
        
        }
                   
