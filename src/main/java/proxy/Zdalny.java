package proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Author: Daniel
 * Date: 14.08.13
 */

public interface Zdalny extends Remote {
    public String powiedzHej() throws RemoteException;
}
