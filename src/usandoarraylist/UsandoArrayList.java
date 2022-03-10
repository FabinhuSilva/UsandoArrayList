
package usandoarraylist;

public class UsandoArrayList {

    public static void main(String[] args) {
        DetalhesTarefa tf = new DetalhesTarefa();
        tf.Tarefa_Inicial();
        
        /*--------------------------------
                Imprimindo Lista
          --------------------------------
        */
        Logica logica = new Logica();
        logica.CadastroArrayAlunos();
        logica.ArrayNotas();
    }
    
}
