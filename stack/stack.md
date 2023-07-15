# Stack (Pilhas)

## Explicação
- Stacks são estruturas de dados que seguem o principio <b> LIFO </b>, last in first out, ou seja, o ultimo elemento a entrar na estrutura de dados é o primeiro a sair.

## Métodos comuns

- ### push
    - O método push é usado para adicionar elementos ao topo da pilha. Possui uma implementação onde o método recebe apenas um argumento que é o elemento que deve ser adicionado na estrutura.

- ### pop
    - O método pop é usado para remover elementos do topo da pilha. Possui uma implementação que o  método não recebe argumentos, remove o elemento da estrutura e o retorna.

- ### peek
    - O método peek é usado para verificar o elemento que está no topo da pilha. Possui uma implementação em que o método não recebe argumentos e não altera a stack, simplesmente retorna o elemento.

- ### contains
    - O método contains é usado para verificar se um elemento existe dentro da pilha. Possui uma implementação que recebe como argumento um elemento e verifica se ele existe na pilha, se existir o método retorna <b> true </b>, se não retorna <b> false </b>.

## Complexidade (Big O)

|   Acesso        |   Pesquisa      |   Inserção       |  Deletar      |
| -------------   | -------------   | -------------    | ------------- |
|   O (n)         |   O (n)         |   O (1)          |    O (1)      |