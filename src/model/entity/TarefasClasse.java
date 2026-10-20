package model.entity;

public class TarefasClasse {

    public void Tarefa(){}


    public TarefasClasse(int id, String titulo, String descricao, Tarefa.Status status) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }

    private int id;
        private String titulo;
        private String descricao;
        private Tarefa.Status status;

    }

