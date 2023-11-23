package app;

import composicao.Endereco;
import pessoas.Cliente;
import pessoas.Funcionario;
import pessoas.Pessoa;

import javax.swing.event.CaretListener;

public class AppMain {
    public static void main(String[] arg){
        Pessoa pessoa1 = new Pessoa();
        Funcionario func1= new Funcionario();
        Cliente cli1 =new Cliente();
        Endereco end1=new Endereco();

        cli1.cadastrar("mat01","programadora", "Bruna","01/01/2000",end1,"0839999999");
    }

}
