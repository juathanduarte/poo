import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public void adicionaContato(Contato contato){
        contatos.add(contato);
    }

    public void imprimeContatos(){
        for(Contato contato : contatos) {
            contato.printaContato();
        }
    }
}
