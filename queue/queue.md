# Queue (Filas)

## Explicação
- Queues são estruturas de dados que seguem o princio <b> FIFO </b>, first in first out, ou seja, o primeiro elemento a entrar na estrutura será o primeiro a sair.

## Métodos comuns

- ### enqueue
    - O método enqueue é usado para adicionar elementos a fila. Possui uma implementação onde o método recebe apenas um argumento que é o elemento que será adicionado ao final da queue.

- ### dequeue
    - O método dequeue é usado para remover elementos da fila. Possui uma implementação onde o método não recebe nenhum argumento e remove o elemento que está na frente da fila, ou seja, no inicio e retorna o elemento.

- ### OBS
    - A fila também possui os métodos peek e contains que funcionam da mesma forma das stacks.

## Complexidade (Big O)

|   Acesso        |   Pesquisa      |   Inserção       |  Deletar      |
| -------------   | -------------   | -------------    | ------------- |
|   O (n)         |   O (n)         |   O (1)          |    O (1)      |