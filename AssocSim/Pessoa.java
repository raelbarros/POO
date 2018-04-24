package assocsim;
public class Pessoa {
    private Integer id;
    private String nome;
    
    private Rg rgPessoa;
    private Cpf cpfPessoa;
    

    public Pessoa(Integer id, String nome, Rg rgPessoa, Cpf cpfPessoa) {
        this.id = id;
        this.nome = nome;
        this.rgPessoa = rgPessoa;
        this.cpfPessoa = cpfPessoa;
    }
    
    //-----
    public Rg getRgPessoa() {
        return rgPessoa;
    }

    public void setRgPessoa(Rg rgPessoa) {
        this.rgPessoa = rgPessoa;
    }

    public Cpf getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa(Cpf cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }
    
    //--------

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
