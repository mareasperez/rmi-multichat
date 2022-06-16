import java.rmi.RemoteException;

public interface ChatInterface extends java.rmi.Remote {
    boolean checkClientCredintials(ChatInterface ci, String name) throws RemoteException;

    void broadcastMessage(String name, String message) throws RemoteException;

    void sendMessageToClient(String message) throws RemoteException;
}