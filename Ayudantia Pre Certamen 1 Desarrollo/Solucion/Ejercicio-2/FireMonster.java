/**
 * Clase FireMonster que hereda de Monster para MonsterType Fire
 */
public class FireMonster extends Monster {

    public FireMonster(String name, int hp, int atk) {
        super(name,hp,atk);
    }
    /**
     * Implementacion del metodo attackedBy para MonsterType Fire
     * @param m Monster atacante
     */
    public void attackedBy(Monster m){
        if(m instanceof WaterMonster){
            super.hp -= 2*m.getAttk();
        }else {
            super.hp -= m.getAttk();
        }
    }
}
