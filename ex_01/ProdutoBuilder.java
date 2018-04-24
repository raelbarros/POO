package poo_ex01;

import java.util.List;

public class ProdutoBuilder {

    public ContaCorrente CreateContaCorrente() {
        return new ContaCorrente();
    }
    
    public ContaPoupanca CreateContaPoupanca(){
        return new ContaPoupanca();
    }
    
    public CartaoCredito CreateCartaoCredito(){
        return new CartaoCredito();
    }
    
    public List<iProduto> createContaAberta(){
        List<iProduto> list = null;
        list.add(new ContaCorrente());
        list.add(new ContaPoupanca());
        list.add(new CartaoCredito());
        return list;
    }
}
