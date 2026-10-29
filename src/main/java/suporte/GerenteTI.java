package suporte;

public class GerenteTI extends Atendente {

    public GerenteTI(Atendente superior) {
        listaTipos.add(TipoChamadoEquipamento.getTipoChamadoEquipamento());
        setAtendenteSuperior(superior);
    }

    public String getNivel() {
        return "Gerente de TI";
    }
}
