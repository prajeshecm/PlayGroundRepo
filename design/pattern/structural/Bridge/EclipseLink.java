package com.sample.design.pattern.structural.Bridge;

	public class EclipseLink implements IJPA {

		@Override
		public void persistObj(Object object) {
			System.out.println("INFO : EclipseLink persisObj :"+object);
			
		}

	}