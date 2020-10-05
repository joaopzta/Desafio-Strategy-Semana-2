package implementacoes.armas;

import interfaces.IArma;

public class Cajado implements IArma {
    @Override
    public String getArma() {
        return "\tArma: Cajado";
    }

    @Override
    public double danoFisico() {
        return 4;
    }

    @Override
    public double danoMagico() {
        return 20;
    }
}
