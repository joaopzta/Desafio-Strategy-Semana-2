package implementacoes.races;

import abstracts.Races;
import implementacoes.levels.LevelUm;
import interfaces.ILevel;
import interfaces.IProficao;

public class Elfo extends Races {

    public Elfo(IProficao proficao) {
        this.proficao = proficao;
        arma = proficao.arma();
        equipamento = proficao.equipamento();
        level = new LevelUm();
    }

    public Elfo(IProficao proficao, ILevel level) {
        this.proficao = proficao;
        arma = proficao.arma();
        equipamento = proficao.equipamento();
        this.level = level;
    }

    @Override
    public double hp() {
        return 42 * level.aumentarHp();
    }

    @Override
    public double mp() {
        return 23 * level.aumentarMana();
    }

    @Override
    public double dano() {
        return 36 + arma.danoMagico() + arma.danoFisico() + level.aumentarDanoAtaque();
    }

    @Override
    public double defesa() {
        return 32 + equipamento.defesa() + level.aumentarDefesa();
    }

    @Override
    public void display() {
        System.out.println("\tRaça: Elfo");
        proficao.getProficao();
        System.out.println(level.getLevel());
        System.out.println("\tHP: " + this.hp());
        System.out.println("\tMP: " + this.mp());
        System.out.println(arma.getArma());
        System.out.println("\tDano: " + this.dano());
        System.out.println(equipamento.tipoEquipamento());
        System.out.println("\tDefesa: " + this.defesa());
    }
}
