package dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;


    public void setNome(String nome){
        if (nome == null || nome.trim() ==""){
            return;
        }
        this.nome = nome;
    }

    public void setPreco(double preco){
        if (preco >=0){
        } else{
            System.out.println("Preço Inválido");
        }
        this.preco = preco;
    }

    public void setQuantidade(int quantidade){
        if (quantidade >= 0){
        } else{
            System.out.println("Quantidade Inválida");
        }
        this.quantidade = quantidade;

    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double calcularValorEstoque(){
        return this.preco * this.quantidade;
    }
}
