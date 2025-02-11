📚 Funções de operações de coleções em Kotlin
Kotlin oferece várias funções de operações sobre coleções. Aqui estão algumas das mais comuns:

🔢 Operações de Soma
sum() – Soma todos os elementos da coleção numérica.
sumBy() – Soma os resultados de uma função aplicada a cada item da coleção.
sumOf() – Soma os valores retornados por uma função para cada item da coleção.
🔠 Operações de Agregação
min() – Retorna o menor valor da coleção.
max() – Retorna o maior valor da coleção.
average() – Retorna a média dos valores da coleção.
count() – Conta o número de elementos na coleção.
reduce() – Aplica uma operação binária acumulativa, como uma soma, a todos os elementos.
fold() – Semelhante ao reduce(), mas você pode especificar um valor inicial.
🛠️ Operações de Filtragem e Mapeamento
filter() – Filtra elementos com base em uma condição.
map() – Aplica uma transformação a cada elemento da coleção.
flatMap() – Aplica uma transformação e "achata" o resultado (útil para listas de listas).
distinct() – Remove elementos duplicados.
take() – Retorna os primeiros N elementos da coleção.
drop() – Remove os primeiros N elementos da coleção.
📏 Operações de Ordenação
sorted() – Retorna a coleção ordenada.
sortedBy() – Ordena a coleção com base em uma chave (definida por uma função).
reversed() – Inverte a ordem dos elementos na coleção.
🔀 Operações de Agregação com condições
any() – Retorna true se algum elemento satisfizer a condição.
all() – Retorna true se todos os elementos satisfizerem a condição.
none() – Retorna true se nenhum elemento satisfizer a condição.