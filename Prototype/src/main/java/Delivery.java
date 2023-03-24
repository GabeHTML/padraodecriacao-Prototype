public class Delivery implements Cloneable{
    private int cnpj;
    private String nome;
    private String endereco;



    public Delivery(int cnpj, String nome, String endereco){
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;

    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cpf) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "CNPJ=" + cnpj +
                ", nome='" + nome + '\'' +
                ", Endereço='" + endereco + '\'' +
                '}';
    }
}