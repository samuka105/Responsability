package suporte;

public class AtendenteNivel3 extends Atendente {

    public AtendenteNivel3(Atendente superior) {
        listaTipos.add(TipoChamadoRede.getTipoChamadoRede());
        setAtendenteSuperior(superior);
    }

    public String getNivel() {
        return "Nível 3";
    }
}
