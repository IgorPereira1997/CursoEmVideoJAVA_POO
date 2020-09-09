package pessoa;
public class Main {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[3];
        p[0] = new Pessoa("Jubileu", (short)25, "Masculino");
        p[1] = new Pessoa("Carol", (short)22, "Feminino");
        p[2] = new Pessoa("Shakira", (short)37, "Feminino");
        
        Livro l[] = new Livro[3];
        l[0] = new Livro("Frozen", "Jocineide", (short)300, p[1]);
        l[1] = new Livro("Basic Instinct", "Sharon Stone", (short)69, p[2]);
        l[2] = new Livro("Jogador Nº1", "Steven Spielberg", (short)450, p[0]);
        
        l[1].abrir();
        l[1].abrir();
        l[1].folhear();
        l[1].detalhes();
        p[2].fazerAniversario();
        l[1].detalhes();
        l[1].avancarPag();
        l[1].voltarPag();
        l[1].fechar();
        
        
    }
}
