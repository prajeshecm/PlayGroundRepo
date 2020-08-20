package com.sample.design.pattern.structural.Bridge;

public class BridgeClient {
	/**
	 * De-couple the interface(IORMFramework) & concrete class(ORMFramework)using the bridge interface(IJPA->Hibernate & EclipseLink)without any impact.
	 * @param args
	 */
	public static void main(String[] args) {
		IJPA hibernate = new Hibernate();
		IJPA eclipseLink = new EclipseLink();
		
		//Decoupling the interface & concrete class using the IJPA interface (hibernate)
		ORMFramework framework = new ORMFramework(hibernate);
		framework.saveObj("prasad");

		//Decoupling the interface & concrete class using the IJPA interface (eclipseLink)
		framework = new ORMFramework(eclipseLink);
		framework.saveObj("kharkar");
	}


}
