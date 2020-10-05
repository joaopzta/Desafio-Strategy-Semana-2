package implementacoes.armas;

import interfaces.IArma;

public class Arco implements IArma {
    @Override
    public String getArma() {
        return "\tArma: Arco e Flecha";
    }

    @Override
    public double danoFisico() {
        return 20;
    }

    @Override
    public double danoMagico() {
        return 0;
    }
}
