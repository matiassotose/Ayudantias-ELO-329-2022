/**
 * Clase con las definiciones generales para cada monstruo
 */
public abstract class Monster {
    protected String name;
    protected int hp;
    protected int attk;

    /* Complete aquí su código de la pregunta 2a)*/

    /**
     * Constructor para inicializar atributos internos
     * @param name Nombre del Monster
     * @param hp Puntos de salud del Monster
     * @param attk Puntos de ataque del Monster
     */
    public Monster(String name, int hp, int attk){
        this.name = name;
        this.hp = hp;
        this.attk = attk;
    }
    /**
     * Metodo para obtener la cantidad de puntos de salud
     * @return Puntos de salud del Monster
     */
    public int getHP(){
        return hp;
    }
    /**
     * Metodo para obtener la cantidad de puntos de ataque
     * @return Puntos de ataque del Monster
     */
    public int getAttk(){
        return attk;
    }
    /**
     * Metodo para obtener el nombre
     * @return Nombre del Monster
     */
    public String getName() {
        return name;
    }
    /**
     * Método abstracto encargado de recibir el ataque producido por un Monster m.
     * @param m Monster atacante
     */
    public abstract void attackedBy(Monster m);
}
