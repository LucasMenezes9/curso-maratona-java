package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1","iPhone");
        Smartphone s2 = new Smartphone("1ABC1","iPhone"); // o serialNumber é o mesmo do s1, porem são objetos diferentes
        Smartphone s3 = s1; // agora a referencia é para o mesmo objeto.
        System.out.println(s1.equals(s2)); // o valor é false.
        System.out.println(s1.equals(s3)); // o valor é true.
    }
}
