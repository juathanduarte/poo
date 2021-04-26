public class Carro {
    float pneus, bancos, motor;
    
    Carro(float pneus, float bancos, float motor) {
        this.pneus = pneus;
        this.bancos = bancos;
        this.motor = motor;
    }

    public float valorCarro() {
        return this.pneus + this.bancos + this.motor;
    }
}