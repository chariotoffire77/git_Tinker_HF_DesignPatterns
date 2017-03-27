package maestro.headfirst.experiments2.proxy.rmi.tutorial;

import java.rmi.Naming;

public class MyRemoteClient {

	public static void main(String[] args) {
		new MyRemoteClient().go();

	}
	
	public void go(){
		try{
			MyRemote service = (MyRemote)Naming.lookup("rmi://127.0.1.1/RemoteHello");
			String s2 = service.sayHello();
			System.out.print(s2);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
