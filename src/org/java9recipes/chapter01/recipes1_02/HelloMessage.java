package org.java9recipes.chapter01.recipes1_02;

public class HelloMessage {

		private String message;
		
		public HelloMessage() {
			this.message="Default Message";
		}

		public String getMessage() {
			return message.toUpperCase();
		}

		public void setMessage(String message) {
			this.message = message;
		}


}
