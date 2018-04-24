package provapoo;
public class ProvaPoo {
    public static void main(String[] args) {
        Consultas consulta = new Consultas("Israel", "Pediatria", 1, "05/10/2017", "22:00", "Santo Amaro");
        Exames exames = new Exames("Sangue", "jejum de 12h", 2, "06/10/2017", "08:00", "Santo Amaro");
        Procedimentos procedimentos = new Procedimentos("Cirurgia", "Paciente anestesiado", 3, "06/10/2017", "18:00", "Santo Amaro");
        
        consulta.getInfo();
        System.out.println(" ");
        exames.getInfo();
        System.out.println(" ");
        procedimentos.getInfo();
    }
    
}
