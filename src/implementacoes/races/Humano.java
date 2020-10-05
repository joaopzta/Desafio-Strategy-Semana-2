package implementacoes.races;

import abstracts.Races;
import implementacoes.levels.LevelUm;
import interfaces.ILevel;
import interfaces.IProficao;

public class Humano extends Races {

    public Humano(IProficao proficao) {
        this.proficao = proficao;
        arma = proficao.arma();
        equipamento = proficao.equipamento();
        level = new LevelUm();
    }

    public Humano(IProficao proficao, ILevel level) {
        this.proficao = proficao;
        arma = proficao.arma();
        equipamento = proficao.equipamento();
        this.level = level;
    }

    @Override
    public double hp() {
        return 46 * level.aumentarHp();
    }

    @Override
    public double mp() {
        return 35 * level.aumentarMana();
    }

    @Override
    public double dano() {
        return 35 + arma.danoMagico() + arma.danoFisico() + level.aumentarDanoAtaque();
    }

    @Override
    public double defesa() {
        return 35 + equipamento.defesa() + level.aumentarDefesa();
    }

    @Override
    public void display() {
        System.out.println("\tRaça: Humano");
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
