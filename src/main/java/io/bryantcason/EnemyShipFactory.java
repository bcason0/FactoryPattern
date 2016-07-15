package io.bryantcason;

/**
 * Created by bryantcason on 6/28/16.
 */
public class EnemyShipFactory {

    public EnemyShip makeAnEnemyShip(String newShipType){

        switch (newShipType){
            case "U":
                return new UFOEnemyShip();
            case "R":
                return new RocketEnemyShip();
            case "B":
                return new BossEnemyShip();
            default:
                return new UFOEnemyShip();
        }
    }
}
