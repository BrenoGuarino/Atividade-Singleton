import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Configuracaotest {

    @Test
    public void deveRetornarUsuarioBanco() {
        Configuracao.getInstance().setUsuarioBanco("Usuário X");
        assertEquals("Usuário X", Configuracao.getInstance().getUsuarioBanco());
    }

    @Test
    public void deveRetornarSenhaBanco() {
        Configuracao.getInstance().setSenhaBanco("Senha");
        assertEquals("Senha", Configuracao.getInstance().getSenhaBanco());
    }

}