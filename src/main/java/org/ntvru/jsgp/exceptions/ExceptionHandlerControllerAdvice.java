package org.ntvru.jsgp.exceptions;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.RollbackException;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ControllerAdvice
public class ExceptionHandlerControllerAdvice {

	
	//@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(RollbackException.class)
	public Map<String, String> handleValidationExceptions(
			RollbackException ex) {
	    Map<String, String> errors = new HashMap<>();
	    System.out.println("ROLLBACK EX: "+ex.getMessage());
//	    .forEach((error) -> {
//	        String fieldName = ((FieldError) error).getField();
//	        String errorMessage = error.getMessage();
	        errors.put("mensagem", ex.getLocalizedMessage());
//	    });
	    return errors;
	}
	
	@ExceptionHandler(Exception.class)
    public String defaultErrorHandler(Exception exception) throws Exception {
		System.out.println("EXCEPTION "+exception.getMessage());
        if (AnnotationUtils.findAnnotation(exception.getClass(), ResponseStatus.class) != null) {
            throw exception;
        }

        return "redirect:/material";
    }
}
