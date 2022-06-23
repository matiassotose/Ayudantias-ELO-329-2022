/**
 * Clase FireMonster que hereda de Monster para MonsterType Water
 */
public class WaterMonster extends Monster {

    public WaterMonster(String name, int hp, int atk) {
        super(name, hp, atk);
    }

    /**
     * Implementacion del metodo attackedBy para MonsterType Water
     *
     * @param m Monster atacante
     */
    public void attackedBy(Monster m) {
        if (m instanceof FireMonster) {
            super.hp -= 0.5 * m.getAttk();
        } else {
            super.hp -= m.getAttk();
        }
    }
}
