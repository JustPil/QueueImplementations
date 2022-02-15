package QI;

public class EmptyQueueDequeueException extends RuntimeException {
    /**
     * Constructor uses no error message.
     */
    public EmptyQueueDequeueException() {
        super();
    }

    /**
     * Constructor specifies an error message.
     * @param message The error message.
     */
    public EmptyQueueDequeueException(String message) {
        super(message);
    }
}
