public class App {
    public static void main(String[] args) {
        Animal[] animais = new Animal[5];
        animais[0] = new Gato();
        animais[1] = new Cachorro();
        animais[2] = new Tigre();
        animais[3] = new Lobo();
        animais[4] = new Leao();
        rotina(animais);
    }

    public static void rotina(Animal animais[]){
        for (int i = 0; i < 30 ; i++) {
            for (int j = 0; j < animais.length; j++) {
                animais[j].comida();
                animais[j].sono();
                animais[j].comida();
            }
        }
    }
}