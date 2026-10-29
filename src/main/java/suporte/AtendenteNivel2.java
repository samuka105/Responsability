package suporte;

public class AtendenteNivel2 extends Atendente {

    public AtendenteNivel2(Atendente superior) {
        listaTipos.add(TipoChamadoSoftware.getTipoChamadoSoftware());
        setAtendenteSuperior(superior);
    }

    public String getNivel() {
        return "Nível 2";
    }
}
