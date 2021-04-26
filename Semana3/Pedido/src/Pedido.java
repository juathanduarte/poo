class Pedido {
        int codigoPedido;
        String clienteNome, descricao;

        Pedido() {
            this.codigoPedido = 000;
            this.clienteNome = "";
            this.descricao = "";
        }

        Pedido(int codigoPedido, String clienteNome, String descricao) {
            this.codigoPedido = codigoPedido;
            this.clienteNome = clienteNome;
            this.descricao = descricao;
        }

        public void setClienteNome(String clienteNome) {
            this.clienteNome = clienteNome;
        }

        public String getClienteNome(String clienteNome) {
            return this.clienteNome;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao(String descricao) {
            return this.descricao;
        }
}