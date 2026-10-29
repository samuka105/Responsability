package suporte;

import java.util.ArrayList;

public abstract class Atendente {

    protected ArrayList listaTipos = new ArrayList();
    private Atendente atendenteSuperior;

    public Atendente getAtendenteSuperior() {
        return atendenteSuperior;
    }

    public void setAtendenteSuperior(Atendente atendenteSuperior) {
        this.atendenteSuperior = atendenteSuperior;
    }

    public abstract String getNivel();

    public String atender(Chamado chamado) {
        if (listaTipos.contains(chamado.getTipoChamado())) {
            return getNivel();
        } else {
            if (atendenteSuperior != null) {
                return atendenteSuperior.atender(chamado);
            } else {
                return "Sem atendimento";
            }
        }
    }
}
