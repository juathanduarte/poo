public class Cliente {
    int codigoCliente;
    String nomeCliente;

    Cliente (int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void setClienteNome(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getClienteNome(String nomeCliente) {
        return this.nomeCliente;
    }

    public int getCodigoCliente(String codigoCliente) {
        return this.codigoCliente;
    }
}
