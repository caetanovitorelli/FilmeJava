public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento;
        anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retro que vale a pena assistir");
        }
        if (incluidoNoPlano == true || tipoPlano.equals("plus")){ //aqui estou dizendo que se o plano for igual a "plus"eu tenho acesso ao filme
            System.out.println("Filme liberado");
        } else { //caso eu n tenha o plano plus, vou ter que pagar a locação do filme
            System.out.println("Deve pagar a locação");
        }
    }
}
