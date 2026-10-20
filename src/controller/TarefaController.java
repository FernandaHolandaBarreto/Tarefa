package controller;

import model.service.PessoaService;
import model.service.TarefaService;

public class TarefaController {

        //não cria objeto
        //controller é o meio de interligar o main nesse caso,e o service(model)


    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

//create C do CRUD
    public void criarTarefa(){
            tarefaService.criar();
        }

        //read R do CRUD
        public void mostrarTarefa(){
        tarefaService.mostrarTarefa();
        }

    }



