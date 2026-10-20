import controller.PessoaController;
import controller.TarefaController;
import model.entity.TarefaStatus;
import model.service.PessoaService;

void main() {

    PessoaService pessoaService = new PessoaService();
    PessoaController pessoaController = new PessoaController(pessoaService);


   pessoaController.criarPessoa();



     //   TarefaStatus tarefa = TarefaStatus.PENDENTE;


    //    IO.println(tarefa);
   // TarefaController.criarTarefa();
}


