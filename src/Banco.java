public class Banco {

    private Banco() {};
    private static Banco instance = new Banco();
    public static Banco getInstance() {
        return instance;
    }
    private String usuarioBanco;
    private String senhaBanco;



    public String getUsuarioBanco() {

        return usuarioBanco;
    }

    public void setUsuarioBanco(String usuarioBanco) {

        this.usuarioBanco = usuarioBanco;
    }

    public String getSenhaBanco() {

        return senhaBanco;
    }

    public void setSenhaBanco(String senhaBanco) {

        this.senhaBanco = senhaBanco;
    }
}