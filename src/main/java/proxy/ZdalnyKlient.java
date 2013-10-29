package proxy;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ZdalnyKlient {
    public static void main(String[] args) {
        new ZdalnyKlient().go();
    }

    private void go() {
        Zdalny usluga = null;
        try {
            usluga = (Zdalny) Naming.lookup("rmi//127.0.0.1/ZdalneHej");
            String s = usluga.powiedzHej();
            System.out.println(s);
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
