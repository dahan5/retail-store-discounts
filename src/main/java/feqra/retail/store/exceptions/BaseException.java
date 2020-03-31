package feqra.retail.store.exceptions;

/**
 * @author Taleb DAHAN
 */
public class BaseException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2251581226061359169L;

	/**
     * Constructs an instance of {@link BaseException} with the specified detail message.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public BaseException(String message)
    {
        super(message);
    }

    /**
     * Constructs an instance of {@link BaseException} with the specified detail message and {@link Throwable} cause.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     * @param cause   the cause (which is saved for later retrieval by the
     *                {@link #getCause()} method).  (A <tt>null</tt> value is
     *                permitted, and indicates that the cause is nonexistent or
     *                unknown.)
     */
    public BaseException(String message, Throwable cause)
    {
        super(message, cause);
    }

}
