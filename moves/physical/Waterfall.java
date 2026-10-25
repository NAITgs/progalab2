package moves.physical;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;

public final class Waterfall extends PhysicalMove {
    public Waterfall(){
        super(Type.WATER, 80, 1.0);
    } 
    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random() < 0.2){
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe(){
        return "использует Waterfall";
    }
}
