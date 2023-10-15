package com.devsuperior.demo.controller.exceptions;

import java.util.ArrayList;
import java.util.List;

/* junto as duas classes que trata o corpo dos erros
 * 
 */
@SuppressWarnings("serial")
public class ValidationError extends StandardError {
	
	private List<FieldMessage> errors = new ArrayList<>();

	public List<FieldMessage> getErrors() {
		return errors;
	}
	
	public void addError(String fieldName, String message) {
		errors.add(new FieldMessage(fieldName, message));
	}

}
