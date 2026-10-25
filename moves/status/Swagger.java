package moves.status;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public final class Swagger extends StatusMove{
    public Swagger(){
        super(Type.NORMAL, 0, 0.85);
    }
    @Override 
    protected void applyOppEffects(Pokemon p){
        Effect.confuse(p);
        Effect e = new Effect().stat(Stat.ATTACK, 2).turns(-1);
        p.addEffect(e);
    }
    @Override 
    protected String describe(){
        return "использует Swagger";
    }
}
