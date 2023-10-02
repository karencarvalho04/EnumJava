public enum Comida {
    SANDUICHE("Sanduiche", 4.0),
    HOTDOG("HotDog", 3.0),
    XBURGER("X-Burger", 3.5);

    private double preco;
    private String nome;

    Comida(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public String getNome(){
        return this.nome;
    }
}
