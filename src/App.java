public class App {
    public static void main(String[] args) throws Exception {
        // Q1 - Fila Sequêncial
        System.out.println("\n+-+-+-  Fila Sequêncial  -+-+-+-+\n");

        // Q2 - Fila Encadeada com Prioridade
        System.out.println("\n+-+-+-  Fila Encadeada com Prioridade  -+-+-+-+\n");

        // Q3 - Pilha Sequêncial
        System.out.println("\n+-+-+-  Pilha Sequêncial  -+-+-+-+\n");

        PilhaSequencial pilhaSequencial = new PilhaSequencial();

        pilhaSequencial.push("A");
        pilhaSequencial.push("B");
        pilhaSequencial.push("C");
        pilhaSequencial.push("D");
        pilhaSequencial.push("E");
        pilhaSequencial.push("F");

        System.out.println("Item no topo: " + pilhaSequencial.peek());
        System.out.println("Item removido: " + pilhaSequencial.pop());
        System.out.println("Item no topo: " + pilhaSequencial.peek());
        System.out.println("Está vazia? " + pilhaSequencial.isEmpty());

        for (int i = 0; i < 10; i++) { // o .pop não quebra mesmo que chame mais que o necessário
            System.out.println("Item removido: " + pilhaSequencial.pop());
        }

        System.out.println("Está vazia? " + pilhaSequencial.isEmpty());

        // Q4 - Pilha Encadeada Monotônica
        System.out.println("\n+-+-+-  Pilha Monotônica  -+-+-+-+\n");

        PilhaMonotonica pilhaMonotonica = new PilhaMonotonica();

        System.out.println("Estado inicial:");
        System.out.println("Está vazia? " + pilhaMonotonica.isEmpty());
        System.out.println("Total de elementos: " + pilhaMonotonica.count());
        System.out.println("Topo (peek em pilha vazia): " + pilhaMonotonica.peek());
        System.out.println("Pop em pilha vazia: " + pilhaMonotonica.pop());

        System.out.println("\nTestando prioridades inválidas:");
        pilhaMonotonica.push("Prioridade 0", 0);
        pilhaMonotonica.push("Prioridade 11", 11);

        System.out.println("\nInserções válidas e rejeição por monotonicidade:");
        pilhaMonotonica.push("Lavar Carro", 2);
        pilhaMonotonica.push("Comprar Pão", 5);
        pilhaMonotonica.push("Compra Ovo", 5);
        pilhaMonotonica.push("Pagar conta de energia", 8);
        pilhaMonotonica.push("Varrer a casa", 7);

        System.out.println("\nPilha após inserções:");
        pilhaMonotonica.display();
        System.out.println("Topo atual (peek): " + pilhaMonotonica.peek());
        System.out.println("Total de elementos: " + pilhaMonotonica.count());
        System.out.println("Está vazia? " + pilhaMonotonica.isEmpty());

        System.out.println("\nRemovendo o elemento do topo: " + pilhaMonotonica.pop());
        System.out.println("Novo topo (peek): " + pilhaMonotonica.peek());

        System.out.println("\nPilha após remoção:");
        pilhaMonotonica.display();

        System.out.println("\nEsvaziando pilha com pop:");
        while (!pilhaMonotonica.isEmpty()) {
            System.out.println("Item removido: " + pilhaMonotonica.pop());
        }

        System.out.println("\nEstado final:");
        System.out.println("Está vazia? " + pilhaMonotonica.isEmpty());
        System.out.println("Total de elementos: " + pilhaMonotonica.count());
        System.out.println("Peek final: " + pilhaMonotonica.peek());
        System.out.println("Pop final: " + pilhaMonotonica.pop());
    }
}
