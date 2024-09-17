public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 1989;
        double notaTopGun = 8.1;
        boolean incluidoPlano = true;
        String tipoPlano = "plus";
        if(anoLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else {
            System.out.println("Filme retro que vale a pena assistir!");
        }

        if(incluidoPlano && tipoPlano.equals("plus")){
            System.out.println("Filme Liberado");
        }else{
            System.out.println("Deve pagar aluguel");
        }
    }
}
