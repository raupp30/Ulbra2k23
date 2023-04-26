public class Main {
    public static void main(String[] args){
        Equipe equipe1 = new Equipe("Equipe One", 0, 0, 0);
        Equipe equipe2 = new Equipe("Equipe Two", 0, 0, 0);

        //registrando vitorias/derrotas/empates
        equipe1.registrarVitoria();
        equipe1.registrarEmpate();
        equipe2.registrarDerrota();
        equipe2.registrarEmpate();
        //printando nome da equipe, vitorias/derrotas/empates
        System.out.println("Equipe 1 - " +equipe1.getNome());
        System.out.println("Vitórias - " +equipe1.vitorias);
        System.out.println("Derrotas - " +equipe1.derrotas);
        System.out.println("Empates - " +equipe1.empates);

        System.out.println("Equipe 2 - " +equipe2.getNome());
        System.out.println("Vitórias - " +equipe2.vitorias);
        System.out.println("Derrotas - " +equipe2.derrotas);
        System.out.println("Empates - " +equipe2.empates);
    }
}