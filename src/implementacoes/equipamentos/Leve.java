package implementacoes.equipamentos;

import interfaces.IEquipamento;

public class Leve implements IEquipamento {
    @Override
    public String tipoEquipamento() {
        return "\tEquipamento: Leve";
    }

    @Override
    public double defesa() {
        return 24;
    }
}
