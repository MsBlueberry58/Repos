package br.com.alura.servidor;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class DistribuirTarefas implements Runnable {

	private Socket socket;
	private ServidorTarefas servidor;
	private BlockingQueue filaComandos;
	private ExecutorService threadPool;

	public DistribuirTarefas(ExecutorService threadPool, Socket socket, ServidorTarefas servidor, BlockingQueue filaComandos) {
		this.threadPool = threadPool;
		this.socket = socket;
		this.servidor = servidor;
		this.filaComandos = filaComandos;
	}



	@Override
	public void run() {

		try {

			System.out.println("Distribuindo as tarefas para o cliente " + socket);

			Scanner entradaCliente = new Scanner(socket.getInputStream());

			PrintStream saidaCliente = new PrintStream(socket.getOutputStream());

			while (entradaCliente.hasNextLine()) {

				String comando = entradaCliente.nextLine();
				System.out.println("Comando recebido " + comando);

				switch (comando) {
					case "c1": {						
						saidaCliente.println("Confirmação do comando c1");
		                ComandoC1 c1 = new ComandoC1(saidaCliente);
		                this.threadPool.execute(c1);
						break;
					}
					case "c2": {
						saidaCliente.println("Confirmação do comando c2");
		                ComandoC2ChamaWS c2WS = new ComandoC2ChamaWS(saidaCliente);
		                ComandoC2ChamaBanco c2Banco = new ComandoC2ChamaBanco(saidaCliente);

						Future<String> futureC2WS = this.threadPool.submit(c2WS);
						Future<String> futureC2Banco = this.threadPool.submit(c2Banco);

						this.threadPool.submit(new JuntaResultadosFutureWSFutureBanco(futureC2WS, futureC2Banco, saidaCliente));

						break;
					}
					case "c3":{
						this.filaComandos.offer(comando);
						System.out.println("Comando c3 adicionado à fila");

						break;

					}
					case "fim": {
						saidaCliente.println("Desligando o servidor");
						servidor.parar();
						return;
					}
					default: {
						saidaCliente.println("Comando não encontrado");
					}
				}

			}

			saidaCliente.close();
			entradaCliente.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

}
