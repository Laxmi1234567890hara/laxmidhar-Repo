package abstractionProgram;

public class MobileDriver {
public static void main(String[] args) {
	Mobile obj1=new Oppo();//upcasting
	obj1.call();
	obj1.camera();
	obj1.text();
	obj1.gps();
	obj1.browser();
	
	Mobile obj2=new Vivo();//upcasting
	obj2.call();
	obj2.camera();
	obj2.text();
	obj2.gps();
	obj2.browser();
	
	Oppo o1=(Oppo)obj1;//downcasting
	o1.call();
	o1.text();
	o1.gps();
	o1.browser();
	o1.camera();
	
	Vivo v1=(Vivo)obj2;//downcasting
	v1.call();
	v1.camera();
	v1.text();
	v1.browser();
	v1.gps();
}
}
