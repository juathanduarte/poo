1.	Uma classe abstrata pode ter métodos não-abstratos? Uma classe abstrata precisa ter métodos abstratos?
- Uma classe que contém um ou mais métodos abstratos deve ser declarada explicitamente como abstrata. Essa classe, no entanto, pode ter métodos concretos (não-abstratos) e uma classe abstrata não precisa necessariamente ter um método abstrato.
2.	Qual a diferença entre sobrecarregar (overload) e sobrepor (override) um método?
- Sobrecarga (overload): consiste em permitir, dentro da mesma classe, mais de um método com o mesmo nome. Entretanto, eles necessariamente devem possuir argumentos diferentes para funcionar.
- Sobrepor (override): Basicamente a sobreposição (override) possibilita reescrever na classe filha os métodos implementados previamente na classe pai, ou seja, uma classe filha pode redefinir métodos herdados de suas descendentes, mantendo o nome e a assinatura.
3.	O que são interfaces? O que elas podem conter? Qual sua relação com classes?
- Lemos a interface da seguinte maneira: "quem desejar ser autenticável precisa saber autenticar dado um inteiro e retornando um booleano”. Ela é um contrato onde quem assina se responsabiliza por implementar esses métodos (cumprir o contrato). Uma interface pode definir uma série de métodos, mas nunca conter implementação deles. Ela só expõe o que o objeto deve fazer, e não como ele faz, nem o que ele tem. Como ele faz vai ser definido em uma implementação dessa interface.
4.	Explique com suas palavras por que uma classe abstrata não pode ser instanciada.
- É um tipo de classe especial que não pode ser instanciada, apenas herdada. É aí que entra o termo “abstrato” desse tipo de classe, por não haver a necessidade de criar objetos com base em uma classe “pai”, não há por que ela permitir a instanciação de novos objetos.
5.	Não fiz :)

