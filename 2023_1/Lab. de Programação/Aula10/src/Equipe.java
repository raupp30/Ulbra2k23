public class Equipe {

     String nome;
     int vitorias;
     int derrotas;
     int empates;

     //Construtor
    Equipe(String nome, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
    }
    //Getters e setters
    public String getNome(){
        return this.nome;
    }
    public int getVitorias(){
        return this.vitorias;
    }
    public int getDerrotas(){
        return this.derrotas;
    }
    public int getEmpates(){
        return this.empates;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }
    public void setEmpates(int empates){
        this.empates = empates;
    }
    //Incrementando atributo vitórias/derrotas/empates
    public void registrarVitoria(){
        this.vitorias++;
    }
    public void registrarDerrota(){
        this.derrotas++;
    }
    public void registrarEmpate(){
        this.empates++;
    }

}
