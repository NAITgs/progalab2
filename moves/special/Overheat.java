package moves.special;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public final class Overheat extends SpecialMove{
    public Overheat(){
        super(Type.FIRE, 130, 0.9);
    }
    @Override 
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().turns(-1).chance(1).stat(Stat.SPECIAL_ATTACK, -2);
        p.addEffect(e);
    }
    @Override 
    protected String describe(){
        return "использует Overheat";
    }
}
