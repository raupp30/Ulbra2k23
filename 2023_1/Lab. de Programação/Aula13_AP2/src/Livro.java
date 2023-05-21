class Livro extends Produto{
    String autor;
    int AnoPublicacao;
    boolean disponibilidade;

    public Livro(String titulo, String autor, int AnoPublicacao, boolean disponibilidade){
        super(titulo);
        this.autor = autor;
        this.AnoPublicacao = AnoPublicacao;
        this.disponibilidade =  disponibilidade;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getAnoPublicacao(){
        return AnoPublicacao;
    }
    public void setAnoPublicacao(int AnoPublicacao){
        this.AnoPublicacao = AnoPublicacao;
    }
    public boolean isDisponibilidade(){
        return disponibilidade;
    }
    public void setDisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;
    }
    @Override
    public String detalhesDoProduto(){
        String disponibilidadeString = disponibilidade ? "Disponível" : "Indisponível";
        return "Titulo: " + getTitulo() + "\n" +
                "Autor: " + autor + "\n" +
                "Ano de publicação: " + AnoPublicacao + "\n" +
                "\nDisponibilidade: " + disponibilidadeString;
    }
}
