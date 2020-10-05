package implementacoes.equipamentos;

import interfaces.IEquipamento;

public class Pesado implements IEquipamento {
    @Override
    public String tipoEquipamento() {
        return "\tEquipamento: Pesado";
    }

    @Override
    public double defesa() {
        return 35;
    }
}
