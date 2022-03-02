
package usandoarraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class Logica {

    public Logica() {
    }
   Scanner teclado = new Scanner(System.in); 
    
    public void CadastroArrayAlunos(){
 int ValorPosicoesArray;
 String RespostaArray;
 
  System.out.println("Deseja testar com um Array ou ArrayList? \n Digite Array ou ArrayList");
  RespostaArray=teclado.next(RespostaArray);
  
  if(RespostaArray.equals("Array")||RespostaArray.equals("array")){

  //Testando comparação
  System.out.println(RespostaArray);
      
  System.out.println("Digite Quantas possições Deseja? \n Valores Entre 0 - 10");
  ValorPosicoesArray=teclado.nextInt();
    
 String[] NotaAluno = new String[ValorPosicoesArray];
 
    NotaAluno[0]=("Juca");
    NotaAluno[1]=("Marcos");
    NotaAluno[2]=("Maria");
    NotaAluno[3]=("Bazan");
    NotaAluno[4]=("Bruna");
    NotaAluno[5]=("Pedro");
    NotaAluno[6]=("Julia");
    NotaAluno[7]=("Vanessa");
    NotaAluno[8]=("Robs");
    NotaAluno[9]=("Simone");
  }
    for(int contador=0;contador < NotaAluno; contador++)
    System.out.println(NotaAluno.get(contador));
    
    teclado.close();
    }
 
public void ArrayNotaAluno(){
    
    
    }
    
}
    

