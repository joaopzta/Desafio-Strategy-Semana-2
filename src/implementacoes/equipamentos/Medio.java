package implementacoes.equipamentos;

import interfaces.IEquipamento;

public class Medio implements IEquipamento {
    @Override
    public String tipoEquipamento() {
        return "\tEquipamento: Medio";
    }

    @Override
    public double defesa() {
        return 30;
    }
}
