package br.com.alura.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable{

    private final String nomeArquivo;
    private final String nome;

    public TarefaBuscaTextual(String nomeArquivo, String nome) {
            this.nomeArquivo = nomeArquivo;
            this.nome = nome;
    }

    @Override

    public void run() {

        try {
            Scanner scanner = new Scanner(new File(nomeArquivo));
            int n_linha = 1;

            while(scanner.hasNextLine()){
                String linha = scanner.nextLine();


                if(linha.toLowerCase().contains(nome.toLowerCase())){
                    System.out.println(nomeArquivo + " - " + n_linha + " - " + linha);
                }

                n_linha++;

            }

            scanner.close();


        } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
        }

    }
}
