# Tarefa - ED - Recursividade 1
## Exercício 5
Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número inteiro `N`, apresente a saída da somatória:

SS = 1 + 1/2 + 1/3 + ... + 1/N

O Código deve apresentar, em formato de comentário:
- Como foi definida a condição de parada;
- Como foi definida a relação de chamada dos passos.

A ideia para solucionar esse problema foi calcular `1/N` e somá-lo ao resultado da função recursiva chamada para `N-1`, até que `N` seja igual a 1, que será o ponto de parada.
