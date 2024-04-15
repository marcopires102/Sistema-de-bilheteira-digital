package net.javaguides.springbootkafkatutorial.payload;

public class Finalmultibanco {
    private int quantidade;
    private String tituloTransporte;
    private double preco;
    private String metodoPagamento1;
    private String referencia;
    private int entidade;
    public Finalmultibanco() {
    }

    public int getquantidade() {
        return quantidade;
    }
    public String getTituloTransporte() {
        return tituloTransporte;
    }
    public double getpreco() { return preco;}
    public String getmetodoPagamento1() {
        return metodoPagamento1;
    }
    public String getreferencia() {
        return referencia;
    }
    public int getentidade() {
        return entidade;
    }

    public void setqquantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setTituloTransporte(String tituloTransporte) {
        this.tituloTransporte = tituloTransporte;
    }
    public void setpreco(double preco) {
        this.preco = preco;
    }
    public void setmetodoPagamento1(String metodoPagamento1) {
        this.metodoPagamento1 = metodoPagamento1;
    }
    public void setreferencia(String referencia) {
        this.referencia = referencia;
    }
    public void setentidade(int entidade) {
        this.entidade = entidade;
    }

    @Override
    public String toString() {
        return "Senhas{" +
                "tituloTransporte='" + tituloTransporte +
                ", preco=" +preco+
                ", quantidade=" + quantidade +
                ", metodoPagamento1=" +metodoPagamento1+
                ", referencia=" + referencia +
                ", entidade=" + entidade +
                '}';
    }
}