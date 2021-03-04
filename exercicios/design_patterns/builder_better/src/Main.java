import java.util.ArrayList;
import java.util.List;

import builders.Conta;

public class Main {
    public static void main(String[] args) {
        List<Conta> listaContas = new ArrayList<>();


        Conta
                contaComFoto =
                new Conta.Builder()
                        .foto("www.google.com")
                        .nome("Bruna")
                        .email("brunagguedes4@gmail.com")
                        .id(12345)
                        .senha("45678")
                        .build();

        Conta
                contaMae =
                new Conta.Builder().nome("Alessandra")
                        .email("ale.galastri@gmail.com")
                        .id(12564)
                        .senha("uyetbs")
                        .nomeMae("Sueli")
                        .build();

        Conta
                contaSemNadaOpcional =
                new Conta.Builder().nome("Camila")
                        .senha("283737jdsd")
                        .email("camilagguedes8@gmail.com")
                        .id(34562)
                        .build();

        listaContas.add(contaComFoto);
        listaContas.add(contaMae);
        listaContas.add(contaSemNadaOpcional);

        for (Conta conta : listaContas) {
            System.out.println("ID - "); System.out.println(conta.getId()+"\n");
            System.out.println("Nome - ");System.out.println(conta.getNome_pessoa()+"\n");
            System.out.println("Email - ");System.out.println(conta.getEmail()+"\n");
            System.out.println("Nome da mae - ");System.out.println(conta.getNome_mae()+'\n');
            System.out.println("Foto - ");System.out.println(conta.getUrl_foto()+ "\n");
            System.out.println("Senha - ");System.out.println(conta.getSenha() + "\n");

        }


    }
}
