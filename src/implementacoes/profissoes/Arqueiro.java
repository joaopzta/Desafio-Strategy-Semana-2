package implementacoes.profissoes;

import implementacoes.armas.Arco;
import implementacoes.equipamentos.Leve;
import interfaces.IArma;
import interfaces.IEquipamento;
import interfaces.IProficao;

public class Arqueiro implements IProficao {
    @Override
    public void getProficao() {
        System.out.println("\tProfissão: Arqueiro");
    }

    @Override
    public IArma arma() {
        return new Arco();
    }

    @Override
    public IEquipamento equipamento() {
        return new Leve();
    }
}
