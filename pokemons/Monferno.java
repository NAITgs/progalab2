package pokemons;
import moves.physical.Waterfall;
import moves.special.IceBeam;
import moves.special.Overheat;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Monferno extends Pokemon {
    public Monferno(String name, int level){
        super(name, level);
        setType(Type.FIRE, Type.FIGHTING);
        setStats(64, 78, 52, 78, 52, 81);
        Waterfall wat = new Waterfall();
        IceBeam ib = new IceBeam();
        Overheat oh = new Overheat();
        setMove(wat, ib, oh);
    }
}
