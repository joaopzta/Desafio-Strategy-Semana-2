package implementacoes.levels;

import interfaces.ILevel;

public class LevelDois implements ILevel {
    @Override
    public String getLevel() {
        return "\tLevel: 2";
    }
    @Override
    public double aumentarHp() {
        return 13;
    }
    @Override
    public double aumentarMana() {
        return 13;
    }
    @Override
    public double aumentarDanoAtaque() {
        return 15;
    }

    @Override
    public double aumentarDefesa() {
        return 16;
    }
}
