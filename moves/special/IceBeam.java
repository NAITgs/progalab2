package moves.special;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;

public final class IceBeam extends SpecialMove{
    public IceBeam(){
        super(Type.ICE, 90, 1.0);
    }
    @Override 
    protected void applyOppEffects(Pokemon p){
        if(Math.random() < 0.1){
            Effect.freeze(p);
        }
    }
    @Override 
    protected String describe(){
        return "использует Ice Beam";
    }
}
