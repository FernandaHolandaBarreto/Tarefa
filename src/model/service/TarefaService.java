package model.service;

import model.entity.Tarefa;
import model.entity.TarefaStatus;

import java.util.HashSet;
import java.util.Set;


public class TarefaService {

    private static int id =1;
    Set<Tarefa> listaDeTarefas= new HashSet<Tarefa>();


    public void criar(){
        Tarefa p = new Tarefa();
        p.setId(id++);
        p.setTitulo(IO.readln("Digite seu titulo"));
        p.setDescricao(IO.readln("Digite a descrição"));
        p.setStatus(TarefaStatus.PENDENTE);
        listaDeTarefas.add(p);


        IO.println("Tarefa Criada com sucesso!!");



    }



    public void mostrarTarefa(){
        IO.println(listaDeTarefas);
    }



}
