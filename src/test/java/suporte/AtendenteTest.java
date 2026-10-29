package suporte;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AtendenteTest {

    private Atendente montarCadeia() {
        GerenteTI gerente = new GerenteTI(null);
        AtendenteNivel3 n3 = new AtendenteNivel3(gerente);
        AtendenteNivel2 n2 = new AtendenteNivel2(n3);
        return new AtendenteNivel1(n2);
    }

    @Test
    public void testAtendidoNoPrimeiroNivel() {
        Atendente n1 = montarCadeia();
        Chamado chamado = new Chamado(TipoChamadoSenha.getTipoChamadoSenha());
        assertEquals("Nível 1", n1.atender(chamado));
    }

    @Test
    public void testEscaladoAteNivel3() {
        Atendente n1 = montarCadeia();
        Chamado chamado = new Chamado(TipoChamadoRede.getTipoChamadoRede());
        assertEquals("Nível 3", n1.atender(chamado));
    }

    @Test
    public void testEscaladoAteGerente() {
        Atendente n1 = montarCadeia();
        Chamado chamado = new Chamado(TipoChamadoEquipamento.getTipoChamadoEquipamento());
        assertEquals("Gerente de TI", n1.atender(chamado));
    }

    @Test
    public void testSemAtendimento() {
        Atendente n1 = montarCadeia();
        Chamado chamado = new Chamado(TipoChamadoJuridico.getTipoChamadoJuridico());
        assertEquals("Sem atendimento", n1.atender(chamado));
    }
}
