package feqra.retail.store.api.rest;


import feqra.retail.store.dtos.ErrorMessage;
import feqra.retail.store.exceptions.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Class GlobalControllerExceptionHandler
 * 
 * Handles all the exceptions thrown by the applications.
 * Handler method for more specific Exceptions must be added here.
 * <p>
 *
 * @author Taleb DAHAN
 *
 */
@ControllerAdvice(basePackages = "feqra.retail.store.api.rest.controller")
class GlobalControllerExceptionHandler
{

    private static final Logger log = LoggerFactory.getLogger(GlobalControllerExceptionHandler.class);

    /**
     * @param ex
     * @return
     */
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    @ResponseBody
    public ErrorMessage notFoundExceptionHandler(NotFoundException ex)
    {
        log.error(ex.getMessage(), ex);
        return new ErrorMessage(String.valueOf(HttpStatus.NOT_FOUND.value())
                ,HttpStatus.NOT_FOUND.getReasonPhrase()
                ,ex.getMessage());
    }

}