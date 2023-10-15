package com.devsuperior.demo.controller.exceptions;

import java.io.Serializable;
/* está classe irá carregar de cada campo a mensagem
 * que coloquei no DTO
 */
@SuppressWarnings("serial")
public class FieldMessage implements Serializable{ 

	private String fieldName;
	private String message;
	
	public FieldMessage() {
		
	}

	public FieldMessage(String fieldName, String message) {
		this.fieldName = fieldName;
		this.message = message;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
