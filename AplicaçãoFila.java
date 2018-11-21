package ListaProj;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mauri
 */
public class AplicaçãoFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ListNode l = new ListNode();
        int menu;
        do {

            menu = teclado.nextInt();
            System.out.println("Informe a opção desejada "
                    + "\n 1º - Fila"
                    + "\n 2º - Pilha\""
                    + "\n sair");
        
            while (menu!=2);
        }    
    
    
    }
}
