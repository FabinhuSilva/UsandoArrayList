
package usandoarraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class Logica {

    /*public Logica() {
    }*/
        //Variaveis
 int RespostaCase1; int ValorPosicoesArray,RespostaArray;
 boolean resposta, TipoArray; boolean retorno;
 String CadArrayAlunos[];
 double CadArrayNotas[];
 
    Scanner teclado = new Scanner(System.in); 
 
    public void ArrayNotas(){
          for(int contadorNotasCase=0;contadorNotasCase<RespostaCase1;contadorNotasCase++){
                CadArrayNotas = new double[10];
                CadArrayNotas[0]=1.00; //1
                CadArrayNotas[1]=2.50; //2
                CadArrayNotas[2]=3.25; //3
                CadArrayNotas[3]=10; //4
                CadArrayNotas[4]=8.99; //5
                CadArrayNotas[5]=7; //6
                CadArrayNotas[6]=3.20; //7
                CadArrayNotas[7]=4.90; //8
                CadArrayNotas[8]=7.87; //9
                CadArrayNotas[9]=9.90; //10
                System.out.println(CadArrayNotas[contadorNotasCase]);
         }//Fim do FOR de Notas
    }
    public void TamanhoArray(){
        do{
        System.out.println("Deseja montar um ARRAY de quantas posições? "
                 + "\n Digite um Valor de 1 a 10 Posições"
                 + "\n Para Sair Digite 0");
                    RespostaCase1=teclado.nextInt();
        if((RespostaCase1<10) || (RespostaCase1 > 1) ){
            retorno = true;

            System.out.println("Quantidade de ARRAY: "+RespostaCase1);
            for(int contadorAlunosCase=0;RespostaCase1>contadorAlunosCase;contadorAlunosCase++){
                CadArrayAlunos = new String[10];               
                CadArrayAlunos[0]="Joao"; //1
                CadArrayAlunos[1]="Pedro"; //2
                CadArrayAlunos[2]="Paulo"; //3
                CadArrayAlunos[3]="Julia"; //4
                CadArrayAlunos[4]="Luiz"; //5
                CadArrayAlunos[5]="Manoel"; //6
                CadArrayAlunos[6]="Juracir"; //7
                CadArrayAlunos[7]="Marcus"; //8
                CadArrayAlunos[8]="Mariane"; //9
                CadArrayAlunos[9]="Vanessa"; //10
                System.out.println(CadArrayAlunos[contadorAlunosCase]);
                
            }//Fim do For de alunos
         
                    }else{
            System.out.println("Valor não identificado");
                        }
        teclado.close();
        } while(RespostaCase1 == 0);
        
    }
    
    public void CadastroArrayAlunos(){
  
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
    }while(TipoArray = false);
    
  if (TipoArray = true){
          //((RespostaArray == 1) || (RespostaArray == 2)){
  //while((RespostaArray == 1) && (RespostaArray == 2)){
  switch(RespostaArray){
      //Cadastro ARRAY
    case 1:
       TamanhoArray();
    
    case 2:
        System.out.println("entrou case 2");
        //teclado.close();
        break;
    default:
        System.out.println("Valor não identificado");
      System.out.println("Digitou algo diferente do esperado!\n Digitou  :  "+RespostaArray);
        break;
        }
      //Menasgem quando é incluido um valor difernete de 1 e 2
  }
}