
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;
 
public interface ServerIntf extends Remote {
    public String getMessage(String tekst) throws RemoteException;
    public List getList() throws RemoteException;
}
