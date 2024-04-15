package net.javaguides.springbootkafkatutorial.payload;

public class Pagamento {


    private String metodoPagamento;
    private int tel;


    public Pagamento() {
    }


    public String getmetodoPagamento() {
        return metodoPagamento;
    }
    public int gettel() {
        return tel;
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

                " metodoPagamento=" + metodoPagamento +
                ", tel=" + tel +
                '}';
    }
}