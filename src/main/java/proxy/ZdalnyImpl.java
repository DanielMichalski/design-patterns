package proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Author: Daniel
 * Date: 14.08.13
 */

public class ZdalnyImpl extends UnicastRemoteObject implements Zdalny {
    protected ZdalnyImpl() throws RemoteException {}

    @Override
    public String powiedzHej() throws RemoteException {
        return "Serwer mówi \"Hej\"";
    }

    public static void main(String[] args) {
        try {
            Zdalny usluga = new ZdalnyImpl();
            Naming.rebind("ZdalneHej", usluga);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
