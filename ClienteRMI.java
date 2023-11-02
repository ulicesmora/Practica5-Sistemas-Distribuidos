import java.rmi.Naming;

public class ClienteRMI {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println(
                "Uso desde consola: java ClienteRMI <numero 1> <numero 2>");
            System.exit(1);
        }

        float num1 = Float.parseFloat(args[0]);
        float num2 = Float.parseFloat(args[1]);

        try {
            ServicioHolaMundo servicio = (ServicioHolaMundo) Naming.lookup("rmi://localhost/ServicioHolaMundo");
            String saludo = servicio.saludar();
            Float sumar = servicio.sumar(num1,num2);
            Float restar = servicio.restar(num1,num2);
            Float multiplicar = servicio.multiplicar(num1,num2);
            Float dividir = servicio.dividir(num1,num2);
            System.out.println(saludo);
            String rsuma = "El resultado de la suma es: " + sumar;
            String rresta = "El resultado de la resta es: " + restar;
            String rmultiplicar = "El resultado de la multiplicación es: " + multiplicar;
            String rdividir = "El resultado de la divición es: " + dividir;
            System.out.println(rsuma);
            System.out.println(rresta);
            System.out.println(rmultiplicar);
            System.out.println(rdividir);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
