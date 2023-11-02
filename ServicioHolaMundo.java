import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServicioHolaMundo extends Remote {
    String saludar() throws RemoteException;

    Float sumar(float num1, float num2) throws RemoteException;
    Float restar(float num1, float num2) throws RemoteException;
    Float multiplicar(float num1, float num2) throws RemoteException;
    Float dividir(float num1, float num2) throws RemoteException;
}
