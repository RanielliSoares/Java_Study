package br.com.desafioListas.modelos;

public class CarrinhoCompras implements Comparable{

    private String item;
    private double valorItem;
    private double valorTotal;

    public String getItem() {
        return item;
    }

    public double getValorItem() {
        return valorItem;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }

    @Override
    public String toString() {
        return "Item comprado: "+item;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
