public class PilhaMonotonica {
    private class PilhaNode {
        String item;
        int priority;
        PilhaNode prev;

        public PilhaNode(String item, int priority) {
            this.item = item;
            this.priority = priority;
            this.prev = null;
        }
    }

    private PilhaNode top = null;
    private int size = 0;

    public void push(String item, int priority) {
        if (priority < 1 || priority > 10) {
            System.out.println("Prioridade deve ser entre 1 e 10");
            return;
        }
        if (top == null) {
            top = new PilhaNode(item, priority);
        } else if (priority >= top.priority) {
            PilhaNode newNode = new PilhaNode(item, priority);
            newNode.prev = top;
            top = newNode;
        } else {
            System.out.println("Rejeitado: prioridade " + priority + " < topo = " + top.priority);
            return;
        }
        size++;
    }

    public String pop() {
        if (size == 0) {
            System.out.println("Pilha vazia");
            return null;
        }
        String item = top.item;
        top = top.prev;
        size--;
        return item;
    }

    public String peek() {
        if (size == 0) {
            System.out.println("Pilha vazia");
            return null;
        }
        return top.item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int count() {
        return size;
    }

    public void display() {
        PilhaNode current = top;
        while (current != null) {
            System.out.println("Valor: " + current.item + " | Prioridade: " + current.priority);
            current = current.prev;
        }
    }
}
