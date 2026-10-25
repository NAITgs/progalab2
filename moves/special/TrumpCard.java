package moves.special;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Pokemon;

public final class TrumpCard extends SpecialMove {
    private int pp = 5;
    public TrumpCard(){
        super(Type.NORMAL, 0, 1.0);
    }
    private void calculatePow(){
        switch(pp){
            case (0):
                this.power = 200;
                break;
            case (1):
                this.power = 80;
                break;
            case (2):
                this.power = 60;
                break;
            case (3):
                this.power = 50;
                break;
            default:
                this.power = 40;
                break;
        }
    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return pp>=1;
    }
    @Override 
    protected double calcBaseDamage(Pokemon att, Pokemon def){
        pp--;
        calculatePow();
        return super.calcBaseDamage(att, def);
    }
    @Override 
    protected String describe(){
        return "использует Trump Card";
    }
}
