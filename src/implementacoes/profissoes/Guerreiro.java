package implementacoes.profissoes;

import implementacoes.armas.Espada;
import implementacoes.equipamentos.Pesado;
import interfaces.IArma;
import interfaces.IEquipamento;
import interfaces.IProficao;

public class Guerreiro implements IProficao {
    @Override
    public void getProficao() {
        System.out.println("\tProfissão: Guerreiro");
    }

    @Override
    public IArma arma() {
        return new Espada();
    }

    @Override
    public IEquipamento equipamento() {
        return new Pesado();
    }

}
