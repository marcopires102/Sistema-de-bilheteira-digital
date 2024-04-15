package net.javaguides.springbootkafkatutorial.payload;

public class Finalmbway {
    private int quantidade;
    private String tituloTransporte;
    private double preco;
    private String metodoPagamento;
    private int tel;

    public Finalmbway() {
    }

    public int getquantidade() {
        return quantidade;
    }
    public String getTituloTransporte() {
        return tituloTransporte;
    }
    public double getpreco() { return preco;}
    public String getmetodoPagamento() {
        return metodoPagamento;
    }
    public int gettel() {
        return tel;
    }

    public void setquantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setTituloTransporte(String tituloTransporte) {
        this.tituloTransporte = tituloTransporte;
    }
    public void setpreco(double preco) {
        this.preco = preco;
    }
    public void setmetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    public void settel(int tel) {
        this.tel = tel;
    }


    @Override
    public String toString() {
        return "Senhas{" +
                "tituloTransporte='" + tituloTransporte +
                ", preco=" +preco+
                ", quantidade=" + quantidade +
                ", tel=" +tel+
                ", metodoPagamento=" + metodoPagamento +
                '}';
    }
}