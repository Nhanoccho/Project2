package com.java.web.ControllerAdvice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.java.web.CustomException.FieldRequiredException;
import com.java.web.Model.ErrorResponseDTO;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {
    
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<Object> handleArithmeticException(
	        ArithmeticException ex, WebRequest request) {

	    ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
	    errorResponseDTO.setError("Lỗi toán học: " + ex.getMessage());
	    
	    List<String> details = new ArrayList<>();
	    details.add("Có thể bạn đang chia cho 0.");
	    
	    errorResponseDTO.setDetails(details);
	    
	    return new ResponseEntity<>(errorResponseDTO, HttpStatus.BAD_GATEWAY);
	}

}
