package feqra.retail.store.exceptions;

/**
 * @author Taleb DAHAN
 */
public class NotFoundException extends BaseException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8256835953372736497L;

	/**
     *Constructs an instance of {@link NotFoundException} with the specified detail message.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public NotFoundException(String message)
    {
        super(message);
    }
}
