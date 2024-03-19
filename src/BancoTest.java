import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bancotest {

    @Test
    public void deveRetornarUsuarioBanco() {
        Banco.getInstance().setUsuarioBanco("Usuário X");
        assertEquals("Usuário X", Banco.getInstance().getUsuarioBanco());
    }

    @Test
    public void deveRetornarSenhaBanco() {
        Banco.getInstance().setSenhaBanco("Senha");
        assertEquals("Senha", Banco.getInstance().getSenhaBanco());
    }

}