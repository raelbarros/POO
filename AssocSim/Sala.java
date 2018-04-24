package assocsim;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private String codigo;
    private List<Pessoa> pessoas = new ArrayList<>();

    public Sala(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    public void showStudents(){
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
            System.out.println(pessoa.getRgPessoa().getNumero());
        }
    }
    
}
