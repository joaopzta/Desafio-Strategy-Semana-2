package abstracts;

import interfaces.IArma;
import interfaces.IEquipamento;
import interfaces.ILevel;
import interfaces.IProficao;

public abstract class Races {

    protected IProficao proficao;
    protected ILevel level;
    protected IArma arma;
    protected IEquipamento equipamento;

    public abstract double hp();
    public abstract double mp();
    public abstract double dano();
    public abstract double defesa();
    public abstract void display();
}
