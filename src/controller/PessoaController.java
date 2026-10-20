package controller;

import model.entity.Pessoa;
import model.service.PessoaService;

public class PessoaController {

    //não cria objeto
    //controller é o meio de interligar o main nesse caso,e o service(model)


    private final PessoaService pessoaService;


    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    public void criarPessoa(){
        pessoaService.criar();
        IO.println("Criando com sucesso!");
    }
}
