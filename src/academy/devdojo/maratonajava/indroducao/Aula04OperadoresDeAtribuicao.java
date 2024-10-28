package academy.devdojo.maratonajava.indroducao;

public class Aula04OperadoresDeAtribuicao {
    public static void main(String[] args) {
     /* Operadores de Atribuição
       =, +=, -=, *=, /=, %=
    */
        double bonus = 1800;  // 1800
        bonus += 1000;  // 2800
        bonus -= 1000;  // 1800
        bonus *= 2;  // 3600
        bonus /= 2;  // 1800
        bonus %= 2;  // 0.0
        System.out.println(bonus);

        // Operado de incremento

        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--;
        System.out.println(contador);
    }






}
