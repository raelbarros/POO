/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo.mcalixto
 */
public class PessoaViewForm implements IPessoaView {

    private PessoaController controller;

    public PessoaViewForm(PessoaController controller) {
        this.controller = controller;
    }
    
    public PessoaController getController() {
        return controller;
    }

    public void setController(PessoaController controller) {
        this.controller = controller;
    }
    

    @Override
    public void imprimirNome() {
        JOptionPane.showMessageDialog(null, this.controller.getPrimeiroNome());
    }

    @Override
    public void imprimirNomeCompleto() {
        JOptionPane.showMessageDialog(null, this.controller.getNomeCompleto());
    }

    @Override
    public void imprimirTudo() {
        JOptionPane.showMessageDialog(null, this.controller.getInfo());
    }
    
}
