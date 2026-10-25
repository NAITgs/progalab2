package moves.status;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public final class ScaryFace extends StatusMove{
    public ScaryFace(){
        super(Type.NORMAL, 0, 1.0);
    }
    @Override 
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.SPEED, -2).turns(-1);
        p.addEffect(e);
    }
    @Override 
    protected String describe(){
        return "использует Scary Face";
    }
}