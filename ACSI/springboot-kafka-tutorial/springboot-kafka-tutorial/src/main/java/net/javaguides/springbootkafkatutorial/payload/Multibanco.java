package net.javaguides.springbootkafkatutorial.payload;

public class Multibanco {


    private String metodoPagamento1;
    private String referencia;
    private int entidade;

    public Multibanco() {
    }


    public String getmetodoPagamento1() {
        return metodoPagamento1;
    }
    public String getreferencia() {
        return referencia;
    }
    public int getentidade() {
        return entidade;
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

                "metodoPagamento1=" + metodoPagamento1 +
                ", referencia=" + referencia +
                ", entidade=" + entidade +
                '}';
    }
}