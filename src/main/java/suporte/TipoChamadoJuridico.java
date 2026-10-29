package suporte;

public class TipoChamadoJuridico implements TipoChamado {

    private static TipoChamadoJuridico tipoChamadoJuridico = new TipoChamadoJuridico();

    private TipoChamadoJuridico() {};

    public static TipoChamadoJuridico getTipoChamadoJuridico() {
        return tipoChamadoJuridico;
    }
}
