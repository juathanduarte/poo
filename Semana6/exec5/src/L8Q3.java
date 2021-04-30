public class L8Q3 { 
    public static void main(String[] args) { 
        Agenda ag = new Agenda(); 
        Contato c = new Contato("Fulano", "Petrópolis"); 

        c.adicionaTelefone(new Tel(55, 24, 99999999)); 
        c.adicionaTelefone(new Tel(55, 21, 33333333)); 
        c.adicionaTelefone(new Ramal(55, 24, 22222222, 3500));
        ag.adicionaContato(c); 

        Contato c2 = new Contato("Ciclano", "Rio das Ostras");

        c2.adicionaTelefone(new Tel(55, 22, 99999999)); 
        ag.adicionaContato(c2);
        ag.imprimeContatos(); 
    } 
}