public class App {
    public static void main(String[] args) throws Exception {
        // Q3 - Pilha Sequencial
        System.out.println("+-+-+-+-+-+-+");

        PilhaSequencial pilha = new PilhaSequencial();

        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        pilha.push("D");
        pilha.push("E");
        pilha.push("F");

        System.out.println("Item no topo: " + pilha.peek());
        System.out.println("Item removido: " + pilha.pop());
        System.out.println("Item no topo: " + pilha.peek());
        System.out.println("Está vazia? " + pilha.isEmpty());

        for (int i = 0; i < 10; i++) { // o .pop não quebra mesmo que chame mais que o necessário
            System.out.println("Item removido: " + pilha.pop());
        }

        System.out.println("Está vazia? " + pilha.isEmpty());

        System.out.println("+-+-+-+-+-+-+");
    }
}
