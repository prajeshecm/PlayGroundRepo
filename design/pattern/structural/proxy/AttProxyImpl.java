package com.sample.design.pattern.structural.proxy;

public class AttProxyImpl implements INetProvider {

	INetProvider netprovider;
	
	AttProxyImpl (INetProvider netprovider){
		this.netprovider = netprovider;
	}
	
	@Override
	public String getResource(String url) {
		System.out.println("INFO : requested website : "+url);
		//proxy preprocesing.
		logTheRequest(url);
		
		if(isWebsiteAllowed(url)){
			return netprovider.getResource(url);
		}else{
			return "these sites are blocked as per policy";
		}
	}
	
	
	public void logTheRequest(String url){
		System.out.println("INFO : logTheRequest website : "+url);
	}
	
	public Boolean isWebsiteAllowed(String url){
		/*switch (url){
			case "www.gaming.com" :
				return false;
			case "www.entertainment.com" :
				return false;
			case "www.masala.com" :
				return false;
			default :
				return true;*/
		
		if(url.equalsIgnoreCase("www.gaming.com")){
			return false;
		}else if(url.equalsIgnoreCase("www.entertainment.com")){
			return false;
		}else if(url.equalsIgnoreCase("www.masala.com")){
			return false;
		}else{
			return true;
		}
	}

}
