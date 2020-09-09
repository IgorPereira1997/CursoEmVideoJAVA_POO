package aula07;
public class Lutador implements Card {
    private String nome;
    private String nacionalidade;
    private String categoria;
    private int idade;
    private int wins;
    private int loss;
    private int draw;
    private float altura;
    private float peso;
    public Lutador(String nome,String nacionalidade, int idade, float altura, float peso, int wins, int draw, int loss){
        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setWins(wins);
        setDraw(draw);
        setLoss(loss);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(getPeso()<50||getPeso()>130)
            this.categoria="Inválido";
        else if(getPeso()<=70)
            this.categoria="Leve";
        else if (getPeso()<=100)
            this.categoria="Médio";
        else
            this.categoria="Pesado";
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }
    
    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    @Override
    public void apresentar() {
        System.out.println("-----"+this.getNome()+"-----");
        System.out.println("Nacionalidade: "+this.getNacionalidade());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Altura: "+this.getAltura());
        System.out.println("Categoria: "+this.getCategoria());
        System.out.printf("Vitorias: %d | Empates: %d | Derrotas: %d\n\n", this.getWins(), this.getDraw(), this.getLoss());
    }

    @Override
    public void status() {
        System.out.println(getNome()+" é um peso "+getCategoria()+" com "
                +getWins()+" vitórias, "+getLoss()+" derrotas, e "+getDraw()
                +" empates!");
    }

    @Override
    public void ganharLuta() {
        setWins(getWins()+1);
    }

    @Override
    public void empatarLuta() {
        setDraw(getDraw()+1);
    }

    @Override
    public void perderLuta() {
        setLoss(getLoss()+1);
    }
    
}
