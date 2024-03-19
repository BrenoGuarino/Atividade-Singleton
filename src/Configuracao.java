public class Configuracao {

    private Configuracao() {};
    private static Configuracao instance = new Configuracao();
    public static Configuracao getInstance() {
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