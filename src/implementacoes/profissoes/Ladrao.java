package implementacoes.profissoes;

import implementacoes.armas.Adaga;
import implementacoes.equipamentos.Medio;
import interfaces.IArma;
import interfaces.IEquipamento;
import interfaces.IProficao;

public class Ladrao implements IProficao {
    @Override
    public void getProficao() {
        System.out.println("\tProfissão: Ladrão");
    }

    @Override
    public IArma arma() {
        return new Adaga();
    }

    @Override
    public IEquipamento equipamento() {
        return new Medio();
    }
}
