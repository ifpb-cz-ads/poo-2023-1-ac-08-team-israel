3. Explique, com suas palavras, por que construtores de superclasses não 
são herdados por subclasses.

As superclasses não podem ser herdadas por subclasses porque construtores são métodos utilizados para criar instâncias de objetos. Quando uma classe herda de uma superclasse, ela herda todos os membros (métodos e variáveis) da superclasse, mas não herda o construtor.

Cada classe deve ter seu próprio construtor, que é responsável por inicializar os membros da classe. Se uma subclasse não definir nenhum construtor, o compilador Java criará um construtor padrão sem argumentos, que chama implicitamente o construtor sem argumentos da superclasse.


