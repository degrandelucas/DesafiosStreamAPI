# Projeto de Desafios com Stream API - Java

Este projeto é uma aplicação Java que explora o uso de **Stream API** para manipulação e processamento de coleções de números. O código implementa uma série de desafios, como operações com listas, filtragem, ordenação, cálculo de somas e produtos, verificação de condições e agrupamento de dados.

## Funcionalidades Principais

1. **Impressão da Lista Numérica:**
   - Mostra a lista de números na ordem original.

2. **Soma de Números Pares:**
   - Calcula e exibe a soma de todos os números pares presentes na lista.

3. **Filtragem de Números Positivos:**
   - Verifica e exibe apenas os números positivos da lista.

4. **Remoção de Números Ímpares:**
   - Filtra e remove os números ímpares da lista.

5. **Cálculo da Soma de Números Maiores que 5:**
   - Calcula a soma de todos os números que são maiores que o valor 5.

6. **Verificação de Números Maiores que 9:**
   - Verifica se a lista contém números maiores que 9 e exibe-os.

7. **Segundo Maior Número:**
   - Encontra e exibe o segundo maior número da lista.

8. **Soma dos Dígitos dos Números:**
   - Calcula a soma de todos os dígitos dos números da lista.

9. **Verificação de Números Repetidos:**
   - Exibe a lista de números removendo os elementos duplicados.

10. **Agrupamento de Valores Ímpares Múltiplos de 3 ou 5:**
    - Soma e exibe todos os números ímpares que são múltiplos de 3 ou 5.

11. **Soma dos Quadrados dos Números:**
    - Calcula a soma dos quadrados de todos os números da lista.

12. **Produto de Todos os Números:**
    - Calcula o produto de todos os números presentes na lista.

13. **Filtragem de Números Dentro de um Intervalo:**
    - Filtra e exibe os números que estão entre 5 e 10.

14. **Maior Número Primo:**
    - Encontra e exibe o maior número primo da lista.

15. **Verificação de Números Negativos:**
    - Verifica se a lista contém pelo menos um número negativo.

16. **Agrupamento de Números Pares e Ímpares:**
    - Agrupa os números em pares e ímpares e os exibe separadamente.

17. **Filtragem de Números Primos:**
    - Filtra e exibe todos os números primos da lista.

18. **Verificação de Igualdade Entre Todos os Números:**
    - Verifica se todos os números da lista são iguais.

19. **Soma de Números Divisíveis por Mínimo e Máximo:**
    - Calcula a soma dos números que são divisíveis pelo valor mínimo e máximo da lista.

## Estrutura do Projeto

### Classes e Métodos

- **DesafiosStreamAPI.java:**
  - Contém a classe principal com todos os métodos para os desafios listados. Utiliza **Stream API** para manipulação de coleções de números.

### Exemplos de Uso

- Para imprimir a lista numérica:
    ```java
    listaNumeros.imprimirListaNumerica();
    ```

- Para calcular a soma dos números pares:
    ```java
    listaNumeros.imprimirSomaNumerosPares(listaNumeros.numeros);
    ```

- Para verificar se a lista contém números maiores que 9:
    ```java
    listaNumeros.numeroMaioresQueValorDeterminado(listaNumeros.numeros);
    ```

## Tecnologias Utilizadas

- **Java 8 ou superior:** Linguagem utilizada para o desenvolvimento.
- **Stream API (java.util.stream):** Principal API para manipulação das coleções.

## Como Executar o Projeto

1. Clone este repositório.
2. Compile e execute a classe principal `DesafiosStreamAPI.java` em seu ambiente de desenvolvimento Java.
3. Verifique os resultados no console de saída.

## Autor

- **Lucas Degrande**