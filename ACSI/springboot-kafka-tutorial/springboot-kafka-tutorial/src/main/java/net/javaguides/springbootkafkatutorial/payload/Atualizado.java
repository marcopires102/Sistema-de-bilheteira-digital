package net.javaguides.springbootkafkatutorial.payload;

public class Atualizado {
    private int quantidade;
    private String tituloTransporte;
    private double preco;

    public Atualizado() {
    }

    public int getquantidade() {
        return quantidade;
    }
    public String getTituloTransporte() {
        return tituloTransporte;
    }


    public double getpreco() { return preco;}

    public void setqquantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setTituloTransporte(String tituloTransporte) {
        this.tituloTransporte = tituloTransporte;
    }
    public void setpreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Senhas{" +
                "tituloTransporte='" + tituloTransporte +
                ", preco=" +preco+
                ", quantidade=" + quantidade +
                '}';
    }
}