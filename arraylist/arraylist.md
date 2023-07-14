# ArraysLists / Arrays dinamicos

## Explicação
- Um arraylist ou arrays dinamicos são basicamente arrays que não tem tamanho fixo ou seja o tamanho do array cresce conforme a necessidade.

## Métodos comuns

- ### add
    - O método add é usado para adicionar novos elementos ao arraylist. Possui 2 implementações comuns a primeira que recebe um elemento e o adiciona no final do array, e o segundo que recebe um elemento e um indice e adiciona o elemento no indice do array.

- ### delete
    - O método delete é usado para remover elementos do arraylist. Possui também 2 implementações comuns a primeira recebe um indice e se houve algum elemento nesse indice ele é removido e o método retorna <b>true</b> se o elemeto foi removido ou <b> false </b> se o elemento não existia no array. A segunda implementação recebe como argumento um elemento e remove o elemento que aparecer primeiro na lista e corresponder ao passado no método, retorna <b>true</b> se o elemento for removido e <b>false</b> se o elemento não existir.

- ### get
    - O método get é usado para buscar elementos no arraylist. O método get é simples, recebe como argumento um indice e retorna o elemento que está presente nesse indice.


- ### set
    - O método set é usado para substituir elementos no arraylist. Recebe como argumentos 2 valores, o primeiro representa o indice e o segundo o elemento, no caso o método set substitui o elemento que está no indice pelo elemento que foi passado como argumento.

- ### clear
    - O método clear é usado para limpar o arraylist, ou seja, funciona para excluir todos os elementos do array.

- ### toArray
    - O método toArray funciona para transformar o arraylist em um array estatico que contém todos os elementos do arrayList.


## Complexidade (Big O)

|   Acesso        |   Pesquisa      |   Inserção       |  Deletar      |
| -------------   | -------------   | -------------    | ------------- |
|   O (1)         |   O (n)         |   O (n)          |    O (n)      |