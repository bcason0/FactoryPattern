package io.bryantcason;

import java.util.Scanner;

/**
 * Created by bryantcason on 6/28/16.
 */
public class App {

    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of ship? U / R / B");

        if(userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeAnEnemyShip(typeOfShip);
        }

        if(theEnemy != null){
            chaseHero(theEnemy);
        }else{
            System.out.println("Enter a U, R, B next time ");
        }
    }

    public static void chaseHero(EnemyShip enemyShip){
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
