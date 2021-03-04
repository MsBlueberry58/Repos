/*

Um programa RMI servidor deve implementar a interface remota OU extender a classe
que a implementa.
Aqui, devemos criar um objeto remoto e "bind" ao RMIregistry

 */

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor extends ClasseImplementar {
    public Servidor() {}
    public static void main(String[] args) {
        try {

            //Criando um objeto remoto instanciando a classe de implementação
            ClasseImplementar ObjetoRemoto = new ClasseImplementar();

            // Exportando o objeto da classe de implementação
            // (exportando o objeto remoto para o stub)
            RemoteInterface Stub = (RemoteInterface) UnicastRemoteObject.exportObject(ObjetoRemoto, 0);


            // A interface Registry representa uma interface para o registro de objetos RMI
            // operando em uma máquina específica. Através de um objeto dessa classe, é possível
            // invocar o método bind() que associa um nome de serviço (um String) ao objeto
            // que o implementa.
            Registry registry = LocateRegistry.getRegistry();

            // Binding o objeto remoto (stub) no Registry
            registry.bind("RemoteInterface", Stub);
            System.err.println("Servidor pronto");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}



