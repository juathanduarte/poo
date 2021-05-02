
Crie a classe Pessoa com os campos protegidos (encapsulados), nome e
dataNascimento, objetos da classe String, que vão representar o nome e data de
nascimento. A classe Pessoa deve conter: 
  • Um construtor que recebe como parâmetros duas strings e inicializa os campos
nome e dataNascimento. 
  • O método toString, que não recebe parâmetros e retorna um objeto da classe
  String na seguinte forma: 
    Nome: <nome da pessoa>
    Data de Nascimento: <data de nascimento da pessoa>
    Crie a classe abstrata PessoaIMC que herde da classe Pessoa e contenha tenha os
    campos protegidos peso e altura, ambos do tipo double. O construtor desta classe
    deve receber como parâmetros duas strings e dois valores do tipo double e
    inicializar os campos nome, dataNascimento, peso e altura. A classe PessoaIMC
    deve conter os seguintes métodos: 
  • public double getPeso() que retorna o peso; 
  • public double getAltura() que retorna a altura; 
  • calculaIMC() que recebe como parâmetros dois valores do tipo double que são a
    altura e o peso e retorna um valor do tipo double correspondente ao IMC (Índice
    de Massa Corporal = peso / altura ao quadrado) calculado. 
  • o método abstrato resultIMC() que não recebe parâmetros e retorna uma
    instância da classe String. (o método não é implementado nesta classe - abstrato)
  • o método toString() desta classe deve retornar uma string da seguinte forma: 
    Nome: <nome da pessoa>
    Data de Nascimento: <sua data de nascimento>
    Peso: <seu peso>
    Altura: <sua altura>Crie as classes Homem e Mulher, herdeiras de PessoaIMC. Cada uma deve
    implementar o método abstrato resultIMC() para realiza o calculo do IMC e exibe
    uma mensagem de resultado acordo com o valor obtido.
  Para Homem: 
  IMC < 20.7: Abaixo do peso ideal 
  20.7 < IMC < 26.4: Peso ideal 
  IMC > 26.4: Acima do peso ideal
  Para Mulher: 
  IMC < 19: Abaixo do peso ideal 
  19 < IMC < 25.8: Peso ideal 
  IMC > 25.8: Acima do peso ideal
