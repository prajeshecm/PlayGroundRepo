package com.sample.design.pattern.Creational.Builder;

public class PhoneApp {
	
	 public static void main(String[] args) {

		 Phone.PhoneBuilder builder = new Phone.PhoneBuilder().backPanel;
		// builder.

		 Phone phone = builder.build();

	     System.out.println(phone);
	        /*
	        1. String Builder
	        2. Document Builder
	        3. Locale.Builder
	        4. Spring Reactive
	        5. MockMvcBuilders
	         */
	    }

}
