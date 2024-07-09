# SinglyLinkedList / Listas ligadas individualmente

## Explicação
- São estruturas que armazenam uma coleção sequencial de elementos, mas diferente dos arrays os valores não está contiguos na memoria. Cada elemento é um node que possui seu valor e uma referência (ponteiro) para o proximo elemento da lista. No caso de uma singly linkedlist cada elemento só possui uma referência para o proximo elemento.

- Em uma linkedList como é necessario que cada elemento seja referenciado por outro é necessario possuir um atributo head que funciona como uma entrada inicial de uma lista possuindo referência para os proximos elementos. 

- Em uma linkedlist os elementos não são indexados de forma semelhante a um array mas é possivel fazer busca por um indice especifico em uma lista.

## Deletar elementos 
- Para deletar elementos em uma linkedlist basta que o elemento anterior a ele aponte para o proximo elemento apôs o que será deletado. Assim não haverá mais referência para esse elemento.


## Complexidade (Big O)

|   Acesso        |   Pesquisa      |   Inserção        |  Deletar      |
| -------------   | -------------   | ---------------   | ------------- |
|   O (N)         |   O (N)         |   O (1)*          |    O (n)      |


*No caso para a inserção ser O(1) é necessario que dentro da classe tenha uma referência para o ultimo elemento.