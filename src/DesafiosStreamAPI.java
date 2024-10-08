import java.util.Arrays;
import java.util.List;

public class DesafiosStreamAPI {
    public static void main(String[] args) throws Exception {
     
        DesafiosStreamAPI listaNumeros = new DesafiosStreamAPI();

        listaNumeros.imprimirListaNumerica(); //Desafio 1
        listaNumeros.imprimirSomaNumerosPares(listaNumeros.numeros); //Desafio 2
        listaNumeros.imprimirNumerosPositivos(listaNumeros.numeros); //Desafio 3
        listaNumeros.removerNumerosImpares(listaNumeros.numeros); //Desafio 4
        listaNumeros.somaNumerosMaiores(listaNumeros.numeros); //Desafio 5
        listaNumeros.numeroMaioresQueValorDeterminado(listaNumeros.numeros); //Desafio 6

    }

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    
    //Desafio 1 - Mostre a lista na ordem numérica:
    public void imprimirListaNumerica(){
        System.out.println(numeros);
    }

    //Desafio 2 - Imprima a soma dos números pares da lista:
    public void imprimirSomaNumerosPares(List<Integer> numeros){
        int somaPares = numeros.stream().filter(numero -> numero % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("A soma dos números da lista: " + somaPares);
    }

    //Desafio 3 - Verifique se todos os números da lista são positivos:
    public void imprimirNumerosPositivos(List<Integer> numeros){
        List<Integer> numerosPositivos = numeros.stream().filter(numero -> numero > 0).toList();
        System.out.println("Lista apenas com os numeros positivos " + numerosPositivos);
    }

    //Desafio 4 - Remova todos os valores ímpares:
    public void removerNumerosImpares(List<Integer> numeros){
        List<Integer> removaImpares = numeros.stream().filter(numero -> numero % 2 != 0).toList();
        System.out.println("Os numeros removidos foram: " + removaImpares);
    }

    //Desafio 5 - Calcule a média dos números maiores que 5:
    public void somaNumerosMaiores(List<Integer> numeros){
        int somaMaiores = numeros.stream().filter(numero -> numero > 5).mapToInt(Integer::intValue).sum();
        System.out.println("Soma dos numeros maiores que o valor 5: " + somaMaiores);
    }

    //Desafio 6 - Verificar se a lista contém algum número maior que 9:
    public void numeroMaioresQueValorDeterminado(List<Integer> numeros){
        int numeroDeterminado = 9;
        List<Integer> numeroMaioresQueValor = numeros.stream().filter(numero -> numero > numeroDeterminado).toList();
        System.out.println("Lista contém quais valores maiores que " + numeroDeterminado + " :" + numeroMaioresQueValor);
    }

    

}
