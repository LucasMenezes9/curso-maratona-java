package academy.devdojo.maratonajava.indroducao;

public class Aula04OperadoresLogicos {
    public static void main(String[] args) {
        /*    OPERADORES LÓGICOS
          Sempre retorna um valor booleano.
              * && (AND) - esse operador é 'e' no sentido de soma.
              * || (ou) - em ingLês 'or'
              * ! (negação)
         */
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorTrinta = idade > 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorTrinta);
        System.out.println(isDentroDaLeiMenorTrinta);

        //simulando um saldo na conta para compra de um videogame com 'ou'

        double valorTotContaC = 200;
        double valorTotContaP = 10000;
        float valorVideogame = 5000;
        boolean isCompravel = valorTotContaC >= valorVideogame || valorTotContaP >=valorVideogame;
        System.out.println("O videogame é compravel? " + isCompravel);

        // Operadores de Atribuição

    }
}
