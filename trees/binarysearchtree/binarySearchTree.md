# Binary Search Tree (arvore de busca binaria)

## Explicação
 - Uma arvore binaria é uma arvore que possui algumas restrições, sendo elas um node pode ter no maximo dois filhos um a esquerda e um a direita. Sendo o nó a esquerda sempre menor que o node pai e o nó a direita sendo maior que o node pai.

## Percorrendo uma BST
- ### In-order (em ordem)
    - O percurso em ordem visita todos os nodes de uma arvore em ordem ou seja do menor valor para o maior, ele funciona visitando primeiro a subarvore mais a esquerda depois o node pai e depois a subarvore a direita.
    <br><b>node a esquerda -> node raiz -> node direita</b>

- ### Pre-Order (pre ordem)
    - O percurso pre ordem visita primeiro o node antes de visitar seus descendentes, ou seja, funciona visitando primeiro o node pai, depois faz o percurso pre ordem na subarvore a esquerda e depois o percurso pre order na subarvore a direita.<br>
    <b>node raiz -> node esquerda -> node direita</b>

- ### Post-Order (pos ordem)
    - O percurso pos ordem visita os nodes descendentes e depois o node pai, ou seja, funciona visitando primeiro fazendo o percurso pos ordem na subarvore a esquerda depois o percurso pos ordem na subarvore da direita e depois visita o node pai.<br>
    <b>node a esquerda -> node a direita -> node raiz</b>