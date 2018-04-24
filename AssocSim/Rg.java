package assocsim;
public class Rg {
    private String nomeMae;
    private String nomePai;
    private String uf;
    private String numero;
    private String dataNasc;

    public Rg(String nomeMae, String nomePai, String uf, String numero, String dataNasc) {
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.uf = uf;
        this.numero = numero;
        this.dataNasc = dataNasc;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    
}
