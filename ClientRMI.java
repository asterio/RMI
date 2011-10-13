import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.RMISecurityManager;
import java.util.List;
import javax.swing.*;
 
public class ClientRMI { 
    public static void main(String args[]) {
	System.setProperty("java.security.policy", "client.policy");

        if (System.getSecurityManager() == null) 
            System.setSecurityManager(new RMISecurityManager());

	try {
	    ServerIntf obj = (ServerIntf) Naming.lookup("//localhost/some_name");
         String tekst = JOptionPane.showInputDialog("Podaj tekst");
	    System.out.println(obj.getMessage(tekst));
            List<String> lista = obj.getList();
            for(int i = 0; i < lista.size(); i++)
            {
                System.out.println(i + " " + lista.get(i).toString());
            }
	} catch (Exception e) {
	    System.out.println(e.getMessage());	    
	}
        System.exit(0);
    }
}

