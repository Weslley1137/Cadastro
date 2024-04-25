import IdadeCadastro.CadastrandoIdade;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cadastro {

    private String nome;
    private  int idade;
    private String endereco;

    private List<Cadastro> cadastros = new ArrayList<Cadastro>();

    public void setCadastros() {
        this.cadastros = cadastros;
    }

    public List<Cadastro> getCadastros() {
        return cadastros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String maiorIdade() {
        if (this.idade <= 17) {
            return CadastrandoIdade.MENORIDADE;
        }else if(this.idade >= 18){
            return CadastrandoIdade.MAIORIDADE;
        }
        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cadastro cadastro = (Cadastro) o;
        return idade == cadastro.idade && Objects.equals(nome, cadastro.nome) && Objects.equals(endereco, cadastro.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome,  idade, endereco);
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "nome='" + nome + '\'' +
                ", senha='" + '\'' +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
