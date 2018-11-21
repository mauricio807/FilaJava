package ListaProj;


import java.util.Scanner;

public class ListNode implements Fila {

    int size;
    int fila[]; 
    int last;
    int first;

    Scanner teclado = new Scanner(System.in);

    public ListNode() {
        fila = new int[20];
        size = first = last = 0;
    }

    @Override
    public boolean isEmpty() {  //verifica se está vazio
        return (size == 0);
    }

    @Override
    public Object retirar() {
        if (isEmpty()) {
            throw new RuntimeException("A fila está vazia!");
        }
        int r = fila[first];
        first = first++;
        size--;
        return r;
    }

    @Override
    public int size() {  //verifica a quantidade
        return size;
    }

    @Override
    public boolean isFull() {  // verifica se esta cheio
        return (size == 19);
    }

    @Override
    public Object peek() {  //retorna o primeiro da fila
        if (isEmpty()) {
            throw new RuntimeException("A fila se encontra vazia!");
        }
        return this.fila[first];
    }

    @Override
    public void add(Object l) {
        if (isFull()) {
            throw new RuntimeException("A fila está cheia");
        }
        System.out.println("Insira a prioridade: "
                + "\n 1 - Aluno"
                + "\n 2- Aluno Preferencial");
        l = teclado.nextInt();
        fila[last] = (int) l;
        last = last++;
        size++;
    }

}