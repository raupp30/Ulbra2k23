public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Java em 2023", "Joãozinho Dev", 2023, true);
        Livro livro2 = new Livro("C# em 1999", "Juninho Dev", 1999, true);
        Livro livro3 = new Livro("PHP em 2004", "Pedrinho Dev", 2004, true);
        Livro livro4 = new Livro("C/C++ em 2001", "Vitinho Dev", 2001, true);
        Livro livro5 = new Livro("Python em 2015", "Luquinhas Dev", 2015, true);

        System.out.println("Título do livro: "+livro1.titulo);
        System.out.println("Autor do livro: "+livro1.autor);
        System.out.println("Ano de públicação do livro: "+livro1.AnoPublicacao);
        System.out.println("O livro está disponível: "+livro1.disponibilidade);
        System.out.println("---------------------------------");

        Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.AdicionarLivro(livro1);
        biblioteca1.AdicionarLivro(livro2);
        biblioteca1.AdicionarLivro(livro3);
        biblioteca1.AdicionarLivro(livro4);
        biblioteca1.AdicionarLivro(livro5);

        System.out.println(biblioteca1.verificarDisponibilidade(livro1));
        System.out.println(biblioteca1.verificarDisponibilidade(livro5));
        System.out.println("---------------------------------");

        biblioteca1.RemoverLivro(livro1);
        biblioteca1.RemoverLivro(livro5);
        biblioteca1.AtualizarDetalhesDoLivro(livro1, "joaozi", "joaozinhu", 2022, true);
    }
}