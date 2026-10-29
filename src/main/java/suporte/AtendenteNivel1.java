package suporte;

public class AtendenteNivel1 extends Atendente {

    public AtendenteNivel1(Atendente superior) {
        listaTipos.add(TipoChamadoSenha.getTipoChamadoSenha());
        setAtendenteSuperior(superior);
    }

    public String getNivel() {
        return "Nível 1";
    }
}
