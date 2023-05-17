import java.awt.datatransfer.FlavorListener;

public class Biblioteca {
    Livro livro1;
    Livro livro2;
    Livro livro3;
    Livro livro4;
    Livro livro5;

    public Biblioteca(){
        livro1 = null;
        livro2 = null;
        livro3 = null;
        livro4 = null;
        livro5 = null;
    }
    public void AdicionarLivro(Livro livro){
        if(livro1 == null){
            livro1 = livro;
        }else if(livro2 == null){
            livro2 = livro;
        }else if(livro3 == null){
            livro3 = livro;
        }else if(livro4 == null){
            livro4 = livro;
        }else if(livro5 == null){
            livro5 = livro;
        }else{
            System.out.println("Não há mais espaço para adicionar livros...");
        }
    }
    public void RemoverLivro(Livro livro){
        if(livro1 == livro){
            livro1 = null;
        }else if(livro2 == livro){
            livro2 = null;
        }else if(livro3 == livro){
            livro3 = null;
        }else if(livro4 == livro){
            livro4 = null;
        }else if(livro5 == livro){
            livro5 = null;
        }else{
            System.out.println("Livro não encontrado na bibio...");
        }
    }
    public void AtualizarDetalhesDoLivro(Livro livro, String titulo, String autor, int AnoPublicacao, boolean disponibilidade){
        if(livro1 == livro){
            livro1.setTitulo(titulo);
            livro1.setAutor(autor);
            livro1.setAnoPublicacao(AnoPublicacao);
            livro1.setDisponibilidade(disponibilidade);
        }else if(livro2 == livro){
            livro2.setTitulo(titulo);
            livro2.setAutor(autor);
            livro2.setAnoPublicacao(AnoPublicacao);
            livro2.setDisponibilidade(disponibilidade);
        }else if(livro3 == livro){
            livro3.setTitulo(titulo);
            livro3.setAutor(autor);
            livro3.setAnoPublicacao(AnoPublicacao);
            livro3.setDisponibilidade(disponibilidade);
        }else if(livro4 == livro){
            livro4.setTitulo(titulo);
            livro4.setAutor(autor);
            livro4.setAnoPublicacao(AnoPublicacao);
            livro4.setDisponibilidade(disponibilidade);
        }else if(livro5 == livro){
            livro5.setTitulo(titulo);
            livro5.setAutor(autor);
            livro5.setAnoPublicacao(AnoPublicacao);
            livro5.setDisponibilidade(disponibilidade);
        }else{
            System.out.println("Livro não encontrado");
        }
    }
    public boolean verificarDisponibilidade(Livro livro) {
        if (livro1 == livro) {
            return livro1.isDisponibilidade();
        } else if (livro2 == livro) {
            return livro2.isDisponibilidade();
        } else if (livro3 == livro) {
            return livro3.isDisponibilidade();
        } else if (livro4 == livro) {
            return livro4.isDisponibilidade();
        } else if (livro5 == livro) {
            return livro5.isDisponibilidade();
        } else {
            System.out.println("Livro não encontrado na biblioteca.");
            return false;
        }
    }
}

