package com.sample.design.pattern.Creational.Builder;

public class Phone {
	
	
	 public static class PhoneBuilder {
		 
	 	private String frontPanel;
	    private String backPanel;
	    private String processor;
	    private String camera;
	    
	    public PhoneBuilder() {
        }
	    
	    public Phone build() {
            return new Phone(this);
        }
	    
	    
	 }
	 
	 
		private String frontPanel;
	    private String backPanel;
	    private String processor;
	    private String camera;
	    
	    //This is a private constructor where the phone only be accessed by phoneBuilder..
	    private Phone(PhoneBuilder builder) {
	        this.frontPanel = builder.frontPanel;
	        this.backPanel = builder.backPanel;
	        this.processor = builder.processor;
	        this.camera = builder.camera;
	    }
	    
	    
	    public String getFrontPanel() {
	        return frontPanel;
	    }

	    public String getBackPanel() {
	        return backPanel;
	    }

	    public String getProcessor() {
	        return processor;
	    }

	    public String getCamera() {
	        return camera;
	    }

	    @Override
	    public String toString() {
	        final StringBuffer sb = new StringBuffer("Phone{");
	        sb.append("frontPanel='").append(frontPanel).append('\'');
	        sb.append(", backPanel='").append(backPanel).append('\'');
	        sb.append(", processor='").append(processor).append('\'');
	        sb.append(", camera='").append(camera).append('\'');
	        sb.append('}');
	        return sb.toString();
	    }

}
