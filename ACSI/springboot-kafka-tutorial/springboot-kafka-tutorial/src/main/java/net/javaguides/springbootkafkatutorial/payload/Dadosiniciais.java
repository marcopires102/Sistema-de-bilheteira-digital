package net.javaguides.springbootkafkatutorial.payload;

public class Dadosiniciais {
    private int quantidade;
    private String tituloTransporte;



    public Dadosiniciais() {
    }

    public int getquantidade() {
        return quantidade;
    }
    public String getTituloTransporte() {
        return tituloTransporte;
    }




    public void setqquantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setTituloTransporte(String tituloTransporte) {
        this.tituloTransporte = tituloTransporte;
    }


    @Override
    public String toString() {
        return "Senhas{" +
                "tituloTransporte='" + tituloTransporte +

                ", quantidade=" + quantidade +
                '}';
    }
}