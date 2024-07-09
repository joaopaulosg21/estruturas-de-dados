# LinkedLists / Listas ligadas

## Explicação

- São estruturas que armazenam uma coleção sequencial de elementos, mas diferente dos arrays os valores não estão contiguos na memoria. Cada elemento é um node que possui seu valor e uma referência (ponteiro) para o proximo elemento da lista e para o anterior.

- Em uma linkedList como é necessario que cada elemento seja referenciado por outro é necessario possuir um atributo head que funciona como uma entrada inicial de uma lista possuindo referência para os proximos elementos. 

- Em uma linkedlist os elementos não são indexados de forma semelhante a um array mas é possivel simular e fazer a busca por um indice especifico em uma linkedlist.

- Em uma linkedlist é importante ter cuidado sobre o uso dos ponteiros para que nenhum elemento seja perdido na lista, já que cada elemento possui uma referência para o proximo, no caso da perca de um ponteiro também é perdido o elemento daquela posição.