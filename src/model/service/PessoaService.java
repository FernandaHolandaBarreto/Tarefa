package model.service;

import model.entity.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class PessoaService {
    //para auto adicionar ids nas pessoas
    private static int id;

    Set<Pessoa> bancoDeDados = new HashSet<>();

    //array em javascript
    //var anos = [1950,1960,1970 etc..];

    //CRUD

    public void criar(){
        Pessoa p = new Pessoa();
        p.setId(id++);
        p.setNome(IO.readln("Digite seu nome: "));
        p.setEmail(IO.readln("Digite seu e-mail: "));
        p.setSenha(IO.readln("Digite sua senha: "));

        //salvar no banco
        bancoDeDados.add(p);

    }








}
