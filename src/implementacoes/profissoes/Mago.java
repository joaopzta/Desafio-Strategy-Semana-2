package implementacoes.profissoes;

import implementacoes.armas.Cajado;
import implementacoes.equipamentos.Leve;
import interfaces.IArma;
import interfaces.IEquipamento;
import interfaces.IProficao;

public class Mago implements IProficao {

    @Override
    public void getProficao() {
        System.out.println("\tProfissão: Mago");
    }

    @Override
    public IArma arma() {
        return new Cajado();
    }

    @Override
    public IEquipamento equipamento() {
        return new Leve();
    }

}
