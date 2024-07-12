# HashTable (Tabelas hash)

## Explicação
- É uma estrutura de dados que armazena os dados em uma estrutura de chave, valor, além disso usa uma função hash para inserir elementos e para encontrar mais rapido possivel um elemento na estrutura. Internamente pode ser usado um array para armazenar esses elementos em posições que são especificadas a partir do hash da key.

## Colisões em uma hashtable
- Algo que deve ser levado em consideração a criar hash tables é que pode haver colisão de keys, para isso é necessario escolher boas funções hash e além disso há tecnicas para tratar colisões.

    - Separate Chaining (encadeamento separado) → é uma tecnica que consiste em criar uma estrutura de dados para cada posição da table e armazenar os elementos nessa estrutura, pode ser usada uma linkedlist, uma arraylist, uma tree.

    - Linear Probing (sondagem linear) → é chamada de linear pois todos os elementos são armazenados na mesma table e não em outra estrutura separada como na Separate Chaining, consiste em caso haja colisão em uma posição, tentaremos usar a proxima posição e caso haja nessa, tentaremos a proxima até encontrar uma livre.

### Funções hash
- São funções que mapeiam uma determina entrada para uma saida geralmente de tamanho fixo e que é um valor inteiro . E no caso é usada na key da hashtable para mapear essa key para uma determinada posição na tabela, facilitando a inserção e busca dos dados.

- Função lose-lose → é um tipo de função hash que simplesmente soma os valores de cada elemento ASCII da key e retorna o hash correspondente. Nesse caso usa o resto da divisão de 37(arbitrario) com o valor da soma dos caracteres, somente para diminuir o valor resultante da soma.

- Função djb2 → é uma função de hash melhor que a lose lose pois diminui a chance de colisão de elementos. Diferente da lose lose, a djb2 inicia a variavel com um numero primo (a maioria usa 5381), em seguida é feita a iteração de cada caractere da key, a variavel hash vai sendo somada a ela mesmo multiplicado por 33 (numero magico) e somada a ela o valor do caractere. No final, é retornado o resto da divisão da variavel hash por um numero primo aleatorio que deve ser maior que a instância do array que armazena a table, nesse caso table é igual a 1000.


