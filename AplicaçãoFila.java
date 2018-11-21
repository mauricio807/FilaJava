package ListaProj;

import java.util.Scanner;

/**
 * @author mauri
 */
public class AplicaçãoFila {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        
        ListNode l = new ListNode    
        
                
        int opc= 0;
        int menu = 0;

        do {
            
             menu= teclado.nextInt();
            System.out.println("1º Fila");
            System.out.println("2º pilha");
            System.out.println("");
            System.out.println(" INFORME  A OPÇÃO DESEJADA ");
           

            if (menu == 1) {
                do {
                    
                    System.out.println("1º  Consultar Fila");
                    System.out.println("2º  Chamando o Primeiro da Fila");
                    System.out.println("3º  Atende o Primeiro da Fila");
                    System.out.println("4º  Adicionando a Fila");
                                   
                    opc= teclado.nextInt();
                    
                    if (opc == 1) {
                        System.out.println("Consultar" + l.size);
                        System.out.println("");
                    }

                    if (opc == 2) {
                        System.out.println("Primeiro " + l.peek());
                        System.out.println("");
                    }

                    if (opc == 3) {
                        System.out.println(l.retirar() + "Atendimento realizado");
                        System.out.println("");
                    }

                    if (opc == 4) {
                        l.add(l);
                        System.out.println("");
                    }
                } while (opc!= 4);
            }
        }while (menu!=1);
    }
}