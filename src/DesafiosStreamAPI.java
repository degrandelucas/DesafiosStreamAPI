import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DesafiosStreamAPI {
    public static void main(String[] args) throws Exception {
     
        DesafiosStreamAPI listaNumeros = new DesafiosStreamAPI();

        listaNumeros.imprimirListaNumerica(); //Desafio 1
        listaNumeros.imprimirSomaNumerosPares(listaNumeros.numeros); //Desafio 2
        listaNumeros.imprimirNumerosPositivos(listaNumeros.numeros); //Desafio 3
        listaNumeros.removerNumerosImpares(listaNumeros.numeros); //Desafio 4
        listaNumeros.somaNumerosMaiores(listaNumeros.numeros); //Desafio 5
        listaNumeros.numeroMaioresQueValorDeterminado(listaNumeros.numeros); //Desafio 6
        listaNumeros.encontrarSegundoNumeroMaiorLista(listaNumeros.numeros); //Desafio 7
        listaNumeros.somarDigitosNumerosLista(listaNumeros.numeros); //Desafio 8
        listaNumeros.imprimirListaSemNumerosRepetidos(listaNumeros.numeros); //Desafio 9
        listaNumeros.agruparValoresImparesMultiplosNumerosSelecionados(listaNumeros.numeros); //Desafio 10
        listaNumeros.somaQuadradosNumeros(listaNumeros.numeros); //Desafio 11
        listaNumeros.imprimirProdutoNumeros(listaNumeros.numeros); //Desafio 12
        listaNumeros.filtrarNumerosIntervalo(listaNumeros.numeros); //Desafio 13
        listaNumeros.maiorNumeroPrimo(listaNumeros.numeros); //Desafio 14
        listaNumeros.verificarSeContemNumeroNegativo(listaNumeros.numeros); //Desafio 15
        listaNumeros.agruparNumerosParesImpares(listaNumeros.numeros); //Desafio 16
        listaNumeros.filtrarNumerosPrimos(listaNumeros.numeros); //Desafio 17
        listaNumeros.verificarSeTodosNumerosSaoIguais(listaNumeros.numeros); //Desafio 18
        listaNumeros.somaNumerosDivisiveisPorMinimoEMaximo(listaNumeros.numeros); //Desafio 19
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
        System.out.println("Lista apenas com os numeros positivos: " + numerosPositivos);
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

     //Desafio 7 - Encontrar o segundo número maior da lista:
     public void encontrarSegundoNumeroMaiorLista(List<Integer> numeros) throws Exception {
        if (numeros.size() > 2) {
            List<Integer> listaNumerosOrdenados = numeros.stream().distinct().sorted(Comparator.reverseOrder()).toList();
            System.out.println("o segundo numero maior da Lista é : " + listaNumerosOrdenados.get(1)); 
        } else throw new Exception("A lista deve conter pelo menos dois números.");      
    }

    //Desafio 8 - Somar os dígitos de todos os números da lista:
    public void somarDigitosNumerosLista(List<Integer> numeros){
        int somaDigitos = numeros.stream().map(numero -> String.valueOf(numero)).flatMapToInt(numero -> numero.chars()).map(Character::getNumericValue).sum();
        System.out.println("A soma dos dígitos da lista é: " + somaDigitos);
    }

    //Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
    public void imprimirListaSemNumerosRepetidos(List<Integer> numeros){
        List<Integer> listaSemNumerosRepetidos = numeros.stream().distinct().toList();
        System.out.println("Lista sem numeros repetidos :" + listaSemNumerosRepetidos);
    }

    //Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
    public void agruparValoresImparesMultiplosNumerosSelecionados(List<Integer> numeros){
       int primeiroMultiplo = 3;
       int segundoMultiplo = 5;
       int somaValoresImparesMultiplosNumerosSelecionados = numeros.stream().filter(numero -> numero % primeiroMultiplo == 0 || numero % segundoMultiplo == 0).mapToInt(Integer::intValue).sum();
       System.out.println("Soma dos numeros que são multiplicos de " + primeiroMultiplo + " e " + segundoMultiplo + " é: " + somaValoresImparesMultiplosNumerosSelecionados);
    }

    //Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
    public void somaQuadradosNumeros(List<Integer> numeros){
        int somaQuadrados = numeros.stream().map(numero -> numero * numero).mapToInt(Integer::intValue).sum();
        System.out.println("A soma dos quadrados dos números é: " + somaQuadrados);
    }

    //Desafio 12 - Encontre o produto de todos os números da lista:
    public void imprimirProdutoNumeros(List<Integer> numeros){
        int produtoLista = numeros.stream().reduce(1, (a, b) -> a * b);
        System.out.println("O produto de todos os números da lista é: " + produtoLista);
    }

    //Desafio 13 - Filtrar os números que estão dentro de um intervalo:
    public void filtrarNumerosIntervalo(List<Integer> numeros){
        int minimo = 5;
        int maximo = 10;

        List<Integer> numerosFiltrados = numeros.stream()
        .filter(numero -> numero >= minimo && numero <= maximo)
        .toList();

        System.out.println("Números dentro do intervalo [" + minimo + ", " + maximo + "]: " + numerosFiltrados);
    }

    //Desafio 14 - Encontre o maior número primo da lista:
    public void maiorNumeroPrimo(List<Integer> numeros) {
        int maiorPrimo = numeros.stream()
                                .filter(this::condicaoNumeroPrimo) // Filtra apenas números primos
                                .max(Integer::compare) // Encontra o maior número
                                .orElse(-1); // Se não houver primos, retorna -1
    
        System.out.println("O maior número primo da lista é: " + maiorPrimo);
    }
    
    // Método auxiliar para verificar se um número é primo
    private boolean condicaoNumeroPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    // Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
    public void verificarSeContemNumeroNegativo(List<Integer> numeros) {
        boolean temNegativo = numeros.stream().anyMatch(numero -> numero < 0);//return true ou false

        System.out.println("A lista contém número negativo? " + temNegativo);
    }

    // Desafio 16 - Agrupe os números em pares e ímpares:
    public void agruparNumerosParesImpares(List<Integer> numeros) {
        Map<Boolean, List<Integer>> numerosAgrupados = numeros.stream().collect(Collectors.partitioningBy(numero -> numero % 2 == 0)); // Agrupa pares e ímpares, sendo true pares e false ímpares

        List<Integer> pares = numerosAgrupados.get(true);
        List<Integer> impares = numerosAgrupados.get(false);

        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
    }

    // Desafio 17 - Filtrar os números primos da lista:
    public void filtrarNumerosPrimos(List<Integer> numeros) {
        List<Integer> numerosPrimos = numeros.stream().filter(this::condicaoNumeroPrimo) // Filtra os números primos
                                            .toList();

        System.out.println("Números primos da lista: " + numerosPrimos);
    }

    // Desafio 18 - Verifique se todos os números da lista são iguais:
    public void verificarSeTodosNumerosSaoIguais(List<Integer> numeros) {
        if (numeros.isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }

        boolean todosIguais = numeros.stream().allMatch(numero -> numero.equals(numeros.get(0))); // Verifica se todos são iguais ao primeiro número

        System.out.println("Todos os números da lista são iguais? " + todosIguais);
    }

    // Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
    public void somaNumerosDivisiveisPorMinimoEMaximo(List<Integer> numeros) {
        int minimo = 3;
        int maximo = 5;

        int soma = numeros.stream()
                        .filter(numero -> numero % minimo == 0 && numero % maximo == 0)
                        .mapToInt(Integer::intValue)
                        .sum();

        System.out.println("A soma dos números divisíveis por " + minimo + " e " + maximo + " é: " + soma);
    }
}
