# SinglyLinkedList / Listas ligadas individualmente

## Explicação
- No caso de uma singly linkedlist cada elemento só possui uma referência para o proximo elemento.

## Deletar elementos 
- Para deletar elementos em uma linkedlist basta que o elemento anterior a ele aponte para o proximo elemento apôs o que será deletado. Assim não haverá mais referência para esse elemento.

## Complexidade (Big O)

|   Acesso        |   Pesquisa      |   Inserção        |  Deletar      |
| -------------   | -------------   | ---------------   | ------------- |
|   O (N)         |   O (N)         |   O (1)*          |    O (n)      |


*No caso para a inserção ser O(1) é necessario que dentro da classe tenha uma referência para o ultimo elemento.