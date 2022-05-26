/**
 * Clase con las definiciones generales para cada monstruo
 */
public abstract class Monster {
    protected String name;
    protected int hp;
    protected int attk;

    /* Complete aquí su código de la pregunta 2a)*/

    /**
     * Método abstracto encargado de recibir el ataque producido por un Monster m.
     * @param m Monster atacante
     */
    public abstract void attackedBy(Monster m);
}
