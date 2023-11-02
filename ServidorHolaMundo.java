import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServidorHolaMundo extends UnicastRemoteObject implements ServicioHolaMundo {
    public ServidorHolaMundo() throws RemoteException {
        super();
    }

    public String saludar() throws RemoteException {
        return "Hola Mundo desde el servidor RMI!";
    }

    public Float sumar(float num1, float num2) throws RemoteException {
        return num1+num2;
    }

    public Float restar(float num1, float num2) throws RemoteException {
        return num1-num2;
    }
    
    public Float multiplicar(float num1, float num2) throws RemoteException {
        return num1*num2;
    }

    public Float dividir(float num1, float num2) throws RemoteException {
        return num1/num2;
    }
}
