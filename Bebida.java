public enum Bebida{


   REFRIGERANTE ("Refrigerante", 5.00), SUCO("Suco", 2.50),  AGUA("Agua", 3.00);


    private double preco;
    private String nome;

    Bebida(String nome, double preco){
        this.preco = preco;
        this.nome = nome;
    }
    public double getPreco(){
        return this.preco;
    }

    public String getNome(){
        return this.nome;
    }
}
