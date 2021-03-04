
/*
É preciso implementar a interface remota criada previamente, sendo que é possível
implementá-la a partir de uma classe ou diretamente no programa do servidor.
 */

public class ClasseImplementar implements RemoteInterface{

    @Override public void DarRecado() throws Exception {
        System.out.println("Olá! Isso é um exemplo de programa usando RMI.");

    }

    @Override public void Somar(double n1, double n2) throws Exception {
        double resultado;
        resultado = n1 + n2;
        System.out.println(resultado);

    }
}
