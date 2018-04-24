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
public class PessoaView implements IPessoaView {
    
    private PessoaController controller;

    public PessoaView(PessoaController c) {
        this.controller = c;
    }
   
    public PessoaController getController() {
        return controller;
    }

    public void setController(PessoaController c) {
        this.controller = c;
    }
    
    @Override
    public void imprimirNome(){
        System.out.println("Nome: " + this.controller.getPrimeiroNome());
    }
    
    @Override
    public void imprimirNomeCompleto(){
        System.out.println("Nome completo: " + this.controller.getNomeCompleto());
    }
    
    @Override
    public void imprimirTudo(){
        System.out.println("Todas as informaçoes:\n" + this.controller.getInfo());
    }
    
}
