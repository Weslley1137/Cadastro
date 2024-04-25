import IdadeCadastro.CadastrandoIdade;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CadastroExecutar {


    public static void main(String[] args) {

        HashMap<String, List<Cadastro>> maps = new HashMap<String, List<Cadastro>>();
        List<Cadastro> listaCadastro = new ArrayList<Cadastro>();
        String loop;

        do{
            Cadastro cadastro = new Cadastro();
            String nome = JOptionPane.showInputDialog("Digite seu nome para cadastro: ");
            cadastro.setNome(nome);

            String idade = JOptionPane.showInputDialog("Digite sua idade: ");
            cadastro.setIdade(Integer.parseInt(idade));


            String endereco = JOptionPane.showInputDialog("Digite seu endereço: ");
            cadastro.setEndereco(endereco);


            listaCadastro.add(cadastro);

            loop = JOptionPane.showInputDialog("Deseja continuar Cadastrando ? (S/N)");


        }while( loop.equalsIgnoreCase("S"));




        maps.put(CadastrandoIdade.MAIORIDADE, new ArrayList<>());
        maps.put(CadastrandoIdade.MENORIDADE, new ArrayList<>());

        for(Cadastro cadastro : listaCadastro){
            if(cadastro.maiorIdade().equalsIgnoreCase(CadastrandoIdade.MAIORIDADE)){
                maps.get(CadastrandoIdade.MAIORIDADE).add(cadastro);
            }
            else if(cadastro.maiorIdade().equalsIgnoreCase(CadastrandoIdade.MENORIDADE)) {
                maps.get(CadastrandoIdade.MENORIDADE).add(cadastro);
                System.out.println("------------- Lista de Pessoas NÃO Cadastradas: -------------");
                System.out.println("Usuario: " + cadastro.getNome());
                System.out.println("idade: " + cadastro.getIdade());
                System.out.println("------------------------------------------");

            }}


            System.out.println("-------------Lista de Pessoas Cadastradas: -------------- ");
            for(Cadastro cadastro : maps.get(CadastrandoIdade.MAIORIDADE)) {
                System.out.println("Nome: " + cadastro.getNome());
                System.out.println("Idade: " + cadastro.getIdade() );
                System.out.println("Endereço: " + cadastro.getEndereco());

                System.out.println("------------------------------------------");
            }

            }
            }