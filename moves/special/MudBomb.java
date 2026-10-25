package moves.special;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public final class MudBomb extends SpecialMove {
    public MudBomb(){
        super(Type.GROUND, 65, 0.85);
    }
    @Override 
    protected void applyOppEffects(Pokemon p){
        if (Math.random() < 0.3){
            Effect e = new Effect().stat(Stat.ACCURACY, -1).turns(-1);
            p.addEffect(e);
        }
    }
    @Override 
    protected String describe(){
        return "использует Mud Bomb";
    }
}
