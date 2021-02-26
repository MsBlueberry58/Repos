package builders;

public class Conta {
    private final int id;
    private final String nome_pessoa;
    private final String email;
    private final String senha;
    private final String nome_mae; //opcional
    private final String url_foto;  //opcional

    public int getId() {
        return id;
    }

    public String getNome_pessoa() {
        return nome_pessoa;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public String getUrl_foto() {
        return url_foto;
    }

    private Conta(Builder contaBuilder) {
        this.id = contaBuilder.id;
        this.nome_pessoa = contaBuilder.nome_pessoa;
        this.email = contaBuilder.email;
        this.senha = contaBuilder.senha;
        this.nome_mae = contaBuilder.nome_mae;
        this.url_foto = contaBuilder.url_foto;


    }

    public static class Builder{
        private  int id;
        private String nome_pessoa;
        private String email;
        private String senha;
        private String nome_mae; //opcional
        private String url_foto;  //opcional

        public Builder id( final int id){
            this.id = id;
            return this;
        }
        public Builder nome( final String nome_pessoa){
            this.nome_pessoa = nome_pessoa;
            return this;
        }
        public Builder email( final String email){
            this.email = email;
            return this;
        }
        public Builder senha( final String senha){
            this.senha = senha;
            return this;
        }
        public Builder nomeMae( final String nome_mae){
            this.nome_mae = nome_mae;
            if(nome_mae.equals(null)){
                System.out.println("Sem nome mae");
                return this;
            }
            return this;
        }
        public Builder foto( final String url_foto){
            this.nome_mae = url_foto;
            if(url_foto.equals(null)){
                System.out.println("Sem foto");
                return this;
            }
            return this;
        }

        public Conta build(){
            return new Conta(this);
        }


    }


}
