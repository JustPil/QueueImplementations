package QI;

public class FullQueueEnqueueException extends RuntimeException {
    /**
     * Constructor uses no error message.
     */
    public FullQueueEnqueueException() {
        super();
    }

    /**
     * Constructor specifies an error message.
     * @param message The error message.
     */
    public FullQueueEnqueueException(String message) {
        super(message);
    }
}
