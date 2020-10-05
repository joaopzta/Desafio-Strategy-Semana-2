package implementacoes.levels;

import interfaces.ILevel;

public class LevelUm implements ILevel {
    @Override
    public String getLevel() {
        return "\tLevel: 1";
    }
    @Override
    public double aumentarHp() {
        return 10;
    }

    @Override
    public double aumentarMana() {
        return 10;
    }

    @Override
    public double aumentarDanoAtaque() {
        return 12;
    }

    @Override
    public double aumentarDefesa() {
        return 14;
    }
}
