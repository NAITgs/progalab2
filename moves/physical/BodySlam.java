package moves.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;

public final class BodySlam extends PhysicalMove{
    public BodySlam(){
        super(Type.NORMAL, 85, 1.0);
    } 
    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random() < 0.3){
            Effect.paralyze(p);
        }
    }
    @Override
    protected String describe(){
        return "использует Body Slam";
    }
}