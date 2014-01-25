package cn.dayutianfei.egret;

import cn.dayutianfei.egret.api.Service;

/**
 * Hello world!
 *
 */
public class App 
{
	private Service service = null;
	public String name = null;
	
	public void sayHello(){
		this.getService().sayHello("dayu");
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        app.service.sayHello("dayu");
    }
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
