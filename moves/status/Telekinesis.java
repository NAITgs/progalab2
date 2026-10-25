package moves.status;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public final class Telekinesis extends StatusMove{
    public Telekinesis(){
        super(Type.PSYCHIC, 0, 1.0);
    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    } 
    @Override 
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(1).turns(3).stat(Stat.EVASION, -6);
        p.addEffect(e);
    }
    @Override 
    protected String describe(){
        return "использует Telekinesis";
    }
}
