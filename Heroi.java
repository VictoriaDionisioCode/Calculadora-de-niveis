public class Heroi{
    private String nome;
    private int idade;
    private String tipo;

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }
    public void atacar() {
        String ataque = "";

        switch (this.tipo) {
            case "mago":
                ataque = "magia";
                break;
            case "guerreiro":
                ataque = "espada";
                break;
            case "monge":
                ataque = "artes marciais";
                break;
            case "ninja":
                ataque = "shuriken";
                break;
        }
        System.out.println("O " + this.tipo + " atacou usando " + ataque);
    }
 public static void main(String[] args) {
        // Identidade do heroi
        Heroi heroi = new Heroi("Caroll", 1000, "mago");
        heroi.atacar(); // Saída: O mago atacou usando magia
    }
}