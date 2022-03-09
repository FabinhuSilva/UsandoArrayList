
package usandoarraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class Logica {

    public Logica() {
    }
   Scanner teclado = new Scanner(System.in); 
    
    public void CadastroArrayAlunos(){
 
        //Variaveis
 int ValorPosicoesArray,RespostaArray;
 boolean resposta, TipoArray; 
 boolean retorno;
 String CadArrayAlunos[];
 double CadArrayNotas[];
  do{
  System.out.println("Deseja testar com um Array ou ArrayList? \n\n Digite: \n "
          + "1 - Array\n 2 - ArrayList");
  RespostaArray=teclado.nextInt();
        if((RespostaArray == 1) || (RespostaArray == 2)){
            TipoArray = true;
        }else{
            TipoArray = false;
  //Escolha entre Array e Array List
  System.out.println("Deseja testar com um Array ou ArrayList? \n\n Digite: \n "
          + "1 - Array\n 2 - ArrayList");
  RespostaArray=teclado.nextInt();
            }
    }while(TipoArray = true);
    
  if ((RespostaArray == 1) || (RespostaArray == 2)){
  //while((RespostaArray == 1) && (RespostaArray == 2)){
  switch(RespostaArray){
      //Cadastro ARRAY
    case 1:
        int RespostaCase1;   
        do{
        System.out.println("Deseja montar um ARRAY de quantas posições? "
                 + "\n Digite um Valor de 1 a 10 Posições");
                    RespostaCase1=teclado.nextInt();
        if((RespostaCase1>10) ||(RespostaCase1 < 1) ){
            retorno = false;
            
           System.out.println("Deseja montar um ARRAY de quantas posições? "
           + "\n Digite um Valor de 1 a 10 Posições");
            RespostaCase1=teclado.nextInt();
            for(int contadorAlunosCase1=0;contadorAlunosCase1<RespostaCase1;contadorAlunosCase1++){
                CadArrayAlunos[contadorAlunosCase1]="Joao"; //1
                CadArrayAlunos[contadorAlunosCase1]="Pedro"; //2
                CadArrayAlunos[contadorAlunosCase1]="Paulo"; //3
                CadArrayAlunos[contadorAlunosCase1]="Julia"; //4
                CadArrayAlunos[contadorAlunosCase1]="Luiz"; //5
                CadArrayAlunos[contadorAlunosCase1]="Manoel"; //6
                CadArrayAlunos[contadorAlunosCase1]="Juracir"; //7
                CadArrayAlunos[contadorAlunosCase1]="Marcus"; //8
                CadArrayAlunos[contadorAlunosCase1]="Mariane"; //9
                CadArrayAlunos[contadorAlunosCase1]="Vanessa"; //10
            }
            for(int contadorNotasCase1=0;contadorNotasCase1<RespostaCase1;contadorNotasCase1++){
            
         for(int Contador=0; Contador < RespostaCase1; Contador++ ){
    
             
         }//Fim do FOR
                    }else{
                    }
                    }
        teclado.close();
        break;
        
    }while(retorno = false;)//Fechamento do Doo
      //Cadastrando ARRAYLIST  
    case 2:
        System.out.println("entrou case 2");
        
        
        teclado.close();
        break;
        }
  }else{
      //Menasgem quando é incluido um valor difernete de 1 e 2
      System.out.println("digitou algo diferente de 1 ou dois\n Digitou  :  "+RespostaArray);
  }
}
}