

/*

O prorama do cliente deve pegar o objeto remoto e invocar o método
desejado usando este objeto

Passos:
Get the RMI registry using the getRegistry() method of the LocateRegistry class which belongs
 to the package java.rmi.registry.

Fetch the object from the registry using the method lookup() of the class Registry which
belongs to the package java.rmi.registry.

To this method, you need to pass a string value representing the bind name as a parameter.
This will return you the remote object.

The lookup() returns an object of type remote, down cast it to the type Hello.

Finally invoke the required method using the obtained remote object.

 */

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
    private Cliente(){}

    public static void main(String[] args) {
        double a1 = 453.12;
        double a2 = 7685.94;

        try{

            // Pegando o registro RMI
            Registry registroCliente = LocateRegistry.getRegistry();

            // Pegando o objeto remoto do registro
            // O lookup() retorna um objeto do tipo Remote, então down cast para o tipo RemoteInterface
            RemoteInterface Stub = (RemoteInterface) registroCliente.lookup("RemoteInterface");

            Stub.DarRecado();
            Stub.Somar(a1, a2);

        }
        catch(Exception e){
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }


}
