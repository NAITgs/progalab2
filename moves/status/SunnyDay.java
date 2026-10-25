package moves.status;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public final class SunnyDay extends StatusMove{
    public SunnyDay(){
        super(Type.FIRE, 0, 1.0);
    }
    @Override 
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }
    @Override 
    protected String describe(){
        return "использует Sunny Day";
    }
}
