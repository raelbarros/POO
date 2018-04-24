
package assocsim;

public class Casamento {
    private Pessoa pessoaA;
    private Pessoa pessoaB;
    private String dtCasamento;

    public Casamento(Pessoa pessoaA, Pessoa pessoaB, String dtCasamento) {
        this.pessoaA = pessoaA;
        this.pessoaB = pessoaB;
        this.dtCasamento = dtCasamento;
    }
    
    public Pessoa getPessoaA() {
        return pessoaA;
    }

    public void setPessoaA(Pessoa pessoaA) {
        this.pessoaA = pessoaA;
    }

    public Pessoa getPessoaB() {
        return pessoaB;
    }

    public void setPessoaB(Pessoa pessoaB) {
        this.pessoaB = pessoaB;
    }

    public String getDtCasamento() {
        return dtCasamento;
    }

    public void setDtCasamento(String dtCasamento) {
        this.dtCasamento = dtCasamento;
    }

    
}
