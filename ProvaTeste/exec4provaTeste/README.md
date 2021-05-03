A class transporte deveria ser interface ou abstract, pois dessa forma, como está no código, permite instânciar outros objetos.
Como transporte é uma interface, na class Aviao ao invés de extends, deveria ser implements.
A class onibus não deveria ser abstract, pois ela declara um objeto, e para usá-lo também teria que instânciá-lo.
Avião foi declarado no Main, no entanto não foi instaciado, o que gera um erro.