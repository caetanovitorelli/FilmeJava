public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento;  //aqui eu poderia colocar anoDeLancamento = 2022, onde ja estaria dizendo que esse é
        anoDeLancamento= 2022; // o ano do lancamento do filme, porém primeiro declarei a variavel, p só dps inserir o ano nela
        System.out.println("Ano de lançamento: " + anoDeLancamento); ///Aqui eu puxei a variavel que declarei acima, e concatenei a variavel junto com a frase, se n ela puxaria somente o ano
        boolean incluidoNoPlano = true;

        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse; //A String é uma variavel porém ela n fica laranja como as outras...
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media /2); //aqui tive que colocar o (int) antes do calculo da media, pq a media é uma variavel double, e o int só aceita numero inteiro
        System.out.println("A classificação do filme é: " + classificacao);




    }
}