package implementacoes.armas;

import interfaces.IArma;

public class Espada implements IArma {

    @Override
    public String getArma() {
        return "\tArma: Espada";
    }

    @Override
    public double danoFisico() {
        return 18.0;
    }

    @Override
    public double danoMagico() {
        return 4.0;
    }
}
