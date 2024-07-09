# DoublyLinkedList / Listas duplamente ligadas

## Explicação
- No caso de uma doubly linkedlist cada elemento possui 2 ponteiros um apontando para o elemento anteior(previous) e outro apontando para o proximo elemento (next).

- Diferente das singly linkedlist é necessario tomar um cuidado a mais ao adicionar ou remover elementos da lista, ja que é necessario alterar tanto o ponteiro de next quanto de previous.

## Complexidade (Big O)

|   Acesso        |   Pesquisa      |   Inserção        |  Deletar      |
| -------------   | -------------   | ---------------   | ------------- |
|   O (N)         |   O (N)         |   O (1)*          |    O (n)      |


*No caso para a inserção ser O(1) é necessario que dentro da classe tenha uma referência para o ultimo elemento.