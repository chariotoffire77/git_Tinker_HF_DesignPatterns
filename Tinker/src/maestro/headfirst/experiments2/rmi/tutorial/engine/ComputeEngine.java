package maestro.headfirst.experiments2.rmi.tutorial.engine;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import maestro.headfirst.experiments2.rmi.tutorial.compute.Compute;
import maestro.headfirst.experiments2.rmi.tutorial.compute.Task;

public class ComputeEngine implements Compute {
	
    public ComputeEngine() {
        super();
    }

	@Override
	public <T> T executeTask(Task<T> t) throws RemoteException {
		// TODO Auto-generated method stub
		return t.execute();
	}

	public static void main(String[] args) {
		if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
        try {
            String name = "Compute";
            Compute engine = new ComputeEngine();
            Compute stub =
                (Compute) UnicastRemoteObject.exportObject(engine, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind(name, stub);
            System.out.println("ComputeEngine bound");
        } catch (Exception e) {
            System.err.println("ComputeEngine exception:");
            e.printStackTrace();
        }

	}

}
