public class Main {
    public static void main(String[] args) {

        String nome = "Heroi Valente"; 
        String nivel = rankedBalance(50,10); // Armazenar o nome e a quantidade de experiencia (XP) 

    // Exibir mensagem com o nome do heroi e seu nivel
    System.out.println("O heroi de nome " + nome + " esta no nivel " + nivel);
   } 

   public static String rankedBalance (int vitorias, int derrotas) {
    int saldoRanqueadas = vitorias - derrotas;

    if (saldoRanqueadas < 10) {
        return "Ferro";
    } else if (saldoRanqueadas <= 20){
        return "Bronze";
    } else if ( saldoRanqueadas <= 50){
        return "Prata";
    } else if (saldoRanqueadas >= 51 && saldoRanqueadas <= 80){
        return "Ouro";
    } else if (saldoRanqueadas >= 81 && saldoRanqueadas <= 90){
        return "Platina";
    } else if (saldoRanqueadas >= 91 && saldoRanqueadas <= 100){
        return "Ascendente";
    } else {
        return "Imortal";
    }
   }
    }
