/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author gustavo.mcalixto
 */
public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private String sexo;
    private String dataNasc;
    private String CPF;

    public Pessoa(String nome, String sobrenome, String sexo, String dataNasc, String CPF) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
        this.CPF = CPF;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
    
}
