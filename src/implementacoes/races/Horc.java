package implementacoes.races;

import abstracts.Races;
import implementacoes.levels.LevelUm;
import interfaces.ILevel;
import interfaces.IProficao;

public class Horc extends Races {

    public Horc(IProficao proficao) {
        this.proficao = proficao;
        arma = proficao.arma();
        equipamento = proficao.equipamento();
        level = new LevelUm();
    }

    public Horc(IProficao proficao, ILevel level) {
        this.proficao = proficao;
        arma = proficao.arma();
        equipamento = proficao.equipamento();
        this.level = level;
    }

    @Override
    public double hp() {
        return 55 * level.aumentarHp();
    }

    @Override
    public double mp() {
        return 7 * level.aumentarMana();
    }

    @Override
    public double dano() {
        return 40 + arma.danoMagico() + arma.danoFisico() + level.aumentarDanoAtaque();
    }

    @Override
    public double defesa() {
        return 37 + equipamento.defesa() + level.aumentarDefesa();
    }

    @Override
    public void display() {
        System.out.println("\tRaça: Horc");
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
