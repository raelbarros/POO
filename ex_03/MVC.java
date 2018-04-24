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
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Joao", "da Silva","Masculino", "05-05-2005", "111.111.111-11");
        PessoaController c = new PessoaController(p);
        
        PessoaView pw = new PessoaView(c);
        PessoaViewForm pvc = new PessoaViewForm(c);
        
        //pw.imprimirNome();  
        //pw.imprimirNomeCompleto();
        //pw.imprimirTudo();
        
        pvc.imprimirNome();  
        pvc.imprimirNomeCompleto();
        pvc.imprimirTudo();

        // TODO code application logic here
    }
    
}
