package implementacoes.armas;

import interfaces.IArma;

public class Adaga implements IArma {
    @Override
    public String getArma() {
        return "\tArma: Adaga";
    }

    @Override
    public double danoFisico() {
        return 19;
    }

    @Override
    public double danoMagico() {
        return 0;
    }
}
