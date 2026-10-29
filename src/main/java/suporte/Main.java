package suporte;

public class Main {

    public static void main(String[] args) {
        GerenteTI gerente = new GerenteTI(null);
        AtendenteNivel3 n3 = new AtendenteNivel3(gerente);
        AtendenteNivel2 n2 = new AtendenteNivel2(n3);
        AtendenteNivel1 n1 = new AtendenteNivel1(n2);

        Chamado senha = new Chamado(TipoChamadoSenha.getTipoChamadoSenha());
        Chamado rede = new Chamado(TipoChamadoRede.getTipoChamadoRede());
        Chamado equipamento = new Chamado(TipoChamadoEquipamento.getTipoChamadoEquipamento());
        Chamado juridico = new Chamado(TipoChamadoJuridico.getTipoChamadoJuridico());

        System.out.println("Reset de senha -> " + n1.atender(senha));
        System.out.println("Falha de rede -> " + n1.atender(rede));
        System.out.println("Compra de equipamento -> " + n1.atender(equipamento));
        System.out.println("Pendência jurídica -> " + n1.atender(juridico));
    }
}
