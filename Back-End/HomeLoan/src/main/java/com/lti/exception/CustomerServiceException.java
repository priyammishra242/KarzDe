package com.lti.exception;

@SuppressWarnings("serial")
public class CustomerServiceException extends RuntimeException {
	
		public CustomerServiceException() {
			super();
		}

		public CustomerServiceException(String message, Throwable cause, boolean enableSuppression,
				boolean writableStackTrace) {
			super(message, cause, enableSuppression, writableStackTrace);
		}

		public CustomerServiceException(String message, Throwable cause) {
			super(message, cause);
		}

		public CustomerServiceException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}

		public CustomerServiceException(Throwable cause) {
			super(cause);
		}

		
	}


