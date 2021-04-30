public abstract class ComparaObjeto {
    public static void comparaArea(double area1, double area2){
        if (area1 < area2) {
            System.out.print("Área 1 é maior\n");
        } else {
            System.out.print("Área 2 é maior\n");
        }
    };

    public static void comparaVolume(double volume1, double volume2){
        if (volume1 > volume2) {
            System.out.print("Volume 1 é maior\n");
        } else if (volume1 == volume2) {
            System.out.print("Os volumes são iguais\n");
        } else {
                System.out.print("Volume 2 é maior\n");
        }
    };
}