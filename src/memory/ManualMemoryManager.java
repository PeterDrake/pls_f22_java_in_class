package memory;

public class ManualMemoryManager extends MemoryManager {
    
    public ManualMemoryManager(int capacity) {
        super(capacity);
    }

    public void release(int address) {
        set(address, getFree());
        setFree(address);
    }

    /** Release the linked list starting at address. */
    private void releaseList(int address) {
        if (address == NONE) {
            return;
        }
        releaseList(get(address));
        release(address);
    }

    public static void main(String[] args) {
        ManualMemoryManager m = new ManualMemoryManager(10);
        // Build a linked list
        m.setRoot(m.allocate());
        int next = m.getRoot();
        m.setRoot(m.allocate());
        m.set(m.getRoot(), next);
        next = m.getRoot();
        m.setRoot(m.allocate());
        m.set(m.getRoot(), next);
        // Free up the linked list
        m.releaseList(m.getRoot());
        // How much memory is now available?
        System.out.println(m.unusedCount());
    }

}
