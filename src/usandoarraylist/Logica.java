
package usandoarraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class Logica {

    /*public Logica() {
    }*/
        //Variaveis
 int RespostaCase1;   
 int ValorPosicoesArray,RespostaArray;
 boolean resposta, TipoArray; 
 boolean retorno;
 String CadArrayAlunos[];
 double CadArrayNotas[];
 
    Scanner teclado = new Scanner(System.in); 
 
    public void TamanhoArray(){
        do{
        System.out.println("Deseja montar um ARRAY de quantas posições? "
                 + "\n Digite um Valor de 1 a 10 Posições"
                 + "\n Para Sair Digite 0");
                    RespostaCase1=teclado.nextInt();
        if((RespostaCase1<10) ||(RespostaCase1 > 1) ){
            retorno = true;
            //int contadorAlunosCase1 = RespostaCase1-1;
            System.out.println("Quantidade de ARRAY: "+RespostaCase1);
            //for(int Contador=0; Contador < RespostaCase1; Contador++ ){
            for(int contadorAlunosCase=0;RespostaCase1>contadorAlunosCase;contadorAlunosCase++){
                CadArrayAlunos = new String[RespostaCase1];               
                CadArrayAlunos[contadorAlunosCase]="Joao"; //1
                CadArrayAlunos[contadorAlunosCase]="Pedro"; //2
                CadArrayAlunos[contadorAlunosCase]="Paulo"; //3
                CadArrayAlunos[contadorAlunosCase]="Julia"; //4
                CadArrayAlunos[contadorAlunosCase]="Luiz"; //5
                CadArrayAlunos[contadorAlunosCase]="Manoel"; //6
                CadArrayAlunos[contadorAlunosCase]="Juracir"; //7
                CadArrayAlunos[contadorAlunosCase]="Marcus"; //8
                CadArrayAlunos[contadorAlunosCase]="Mariane"; //9
                CadArrayAlunos[contadorAlunosCase]="Vanessa"; //10
                System.out.println(CadArrayAlunos[contadorAlunosCase]);
            }//Fim do For de alunos
           /*for(int contadorNotasCase=0;contadorNotasCase<RespostaCase1;contadorNotasCase++){
                CadArrayNotas[contadorNotasCase]=1.00; //1
                CadArrayNotas[contadorNotasCase]=2.50; //2
                CadArrayNotas[contadorNotasCase]=3.25; //3
                CadArrayNotas[contadorNotasCase]=10; //4
                CadArrayNotas[contadorNotasCase]=8.99; //5
                CadArrayNotas[contadorNotasCase]=7; //6
                CadArrayNotas[contadorNotasCase]=3.20; //7
                CadArrayNotas[contadorNotasCase]=4.90; //8
                CadArrayNotas[contadorNotasCase]=7.87; //9
                CadArrayNotas[contadorNotasCase]=9.90; //10
                System.out.println(CadArrayAlunos[contadorNotasCase]);
         }//Fim do FOR de Notas*/
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