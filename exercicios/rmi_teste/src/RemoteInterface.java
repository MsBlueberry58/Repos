import java.rmi.Remote;

/*
Criando a interface remota para a aplicação (passo 1) - Descreve todos os métodos de
de um objeto remoto específico
Tem que sempre estender Remote, e todos os métodos devem throw Exception, pois
existe a chance de ocorrerem problemas de conexão
*/

public interface RemoteInterface extends Remote {
    void DarRecado() throws Exception;
    void Somar(double n1, double n2) throws Exception;
}
