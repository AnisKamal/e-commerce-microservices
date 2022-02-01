package com.clientui.exceptions;

import com.clientui.configuration.ProductBadRequestException;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder  {
	
	private final ErrorDecoder defaultErrorDecoder = new Default();
	

	@Override
	public Exception decode(String methodKey, Response response) {
		
		if(response.status() >400 && response.status() <= 499) {
			return new ProductBadRequestException(
					"Requete incorrecte "
					);
		}
		return defaultErrorDecoder.decode(methodKey, response);

	}

}
