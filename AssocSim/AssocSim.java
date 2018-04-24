package assocsim;

public class AssocSim {

    public static void main(String[] args) {
        Rg rgP = new Rg("Maria", "Jose", "SP", "12345678", "01/01/01");
        Cpf cpfP = new Cpf("12345678", "42");
        Pessoa p1 = new Pessoa(1, "Joao", rgP, cpfP);
        
        Rg rgP2 = new Rg("Conceição", "Carlao", "MT", "12345678", "02/02/02");
        Cpf cpfP2 = new Cpf("12345678", "42");
        Pessoa p2 = new Pessoa(1, "Ana", rgP, cpfP);

        System.out.println("Nome: " + p1.getNome());
        System.out.println("CPF: " + p1.getCpfPessoa().getNum() + "-" + p1.getCpfPessoa().getDigver());
        System.out.println("Nome da Mae: " + p1.getRgPessoa().getNomeMae());
        System.out.println("Nome da Pai: " + p1.getRgPessoa().getNomePai());
        System.out.println("UF: " + p1.getRgPessoa().getUf());
        System.out.println("Numero: " + p1.getRgPessoa().getNumero());
        System.out.println("Data de Nacimento: " + p1.getRgPessoa().getDataNasc());
        
        System.out.println(" ");
        
        Casamento c = new Casamento(p1, p2, "03/03/03");
        System.out.println(p1.getNome() + " casou com " + p2.getNome() + " em " + c.getDtCasamento());
        
        System.out.println(" ");
        
        Sala s = new Sala("D158");
        s.getPessoas().add(p1);
        s.getPessoas().add(p2);
        s.showStudents();

    }

}
