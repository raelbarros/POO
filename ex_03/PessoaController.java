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
public class PessoaController {
    
    private Pessoa pessoaModel;

    public PessoaController(Pessoa pessoaModel) {
        this.pessoaModel = pessoaModel;
    }
    
    public Pessoa getPessoaModel() {
        return pessoaModel;
    }

    public void setPessoaModel(Pessoa pessoaModel) {
        this.pessoaModel = pessoaModel;
    }
    
    public String getPrimeiroNome(){
        return this.pessoaModel.getNome();
    }
    
    public String getNomeCompleto(){
        return this.pessoaModel.getNome() + " " + this.pessoaModel.getSobrenome();
    }
   
    public String getInfo(){
        return this.getNomeCompleto() + "\n" 
                + this.pessoaModel.getSexo() + "\n"
                + this.pessoaModel.getDataNasc() + "\n"
                + this.pessoaModel.getCPF();
    }
    
    
}
