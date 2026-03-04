public class PilhaSequencial {
    private static final int INITIAL_SIZE = 5;

    private String[] internalQueue;

    private int currentSize;
    private int currentCapacity;

    public PilhaSequencial() {
        currentCapacity = INITIAL_SIZE;
        internalQueue = new String[currentCapacity];
    }

    public void push(String item) {
        if (currentCapacity == currentSize) {
            resize();
        }
        internalQueue[currentSize] = item;
        currentSize++;
    }

    private void resize() {
        currentCapacity *= 2;
        String[] newInternalQueue = new String[currentCapacity];
        for (int i = 0; i < currentSize; i++) {
            newInternalQueue[i] = internalQueue[i];
        }
        internalQueue = newInternalQueue;
    }

    public String pop() {
        if (currentSize == 0) {
            return null;
        }
        String item = internalQueue[currentSize - 1];
        internalQueue[currentSize - 1] = null;
        currentSize--;
        return item;
    }

    public String peek() {
        return internalQueue[currentSize - 1];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }
}
