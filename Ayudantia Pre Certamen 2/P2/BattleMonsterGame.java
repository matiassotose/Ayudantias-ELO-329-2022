import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que ejecuta el programa (contiene el main)
 */
public class BattleMonsterGame {



    public static void main(String[] args) throws FileNotFoundException {
        Monster playerA;
        Monster playerB;

        Scanner playerAFile = new Scanner(new File(args[0]));
        Scanner playerBFile = new Scanner(new File(args[1]));

        playerA = setPlayer(playerAFile);
        playerB = setPlayer(playerBFile);

        BattleResult res = battleMonsters(playerA,playerB);

        switch(res){
            case WinnerA:
                System.out.println("¡Ganador " + playerA.getName() + "!");
                break;
            case WinnerB:
                System.out.println("¡Ganador " + playerB.getName() + "!");
                break;
            case Tie:
                System.out.println("¡Empate!");
        }


    }

    public static BattleResult battleMonsters(Monster mA, Monster mB) {
        System.out.print("¡Batalla! ");
        System.out.println(mA.getName() + " vs " + mB.getName());
        
	/* Complete aquí su código de la pregunta 2c)*/
	
    }

    private static Monster setPlayer(Scanner teamFile) {
        Monster m =null ;
        teamFile.nextLine();
        while(teamFile.hasNext()) {
            String nameChar = teamFile.next();
            MonsterType typeChar = MonsterType.values()[teamFile.nextInt()]; // Obtención del MonsterType
            int hpChar = teamFile.nextInt();
            int atkChar = teamFile.nextInt();
            switch (typeChar){ // Se crea el Monster segun su MonsterTypes
                case Fire:
                    m = new FireMonster(nameChar,hpChar,atkChar);
                    break;
                case Water:
                    m = new WaterMonster(nameChar,hpChar,atkChar);
                    break;
            }

        }
        return m;
    }



}
