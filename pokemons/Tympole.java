package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import moves.physical.Waterfall;
import moves.special.IceBeam;
import moves.special.Overheat;
import moves.status.ScaryFace;

public final class Tympole extends Pokemon {
    public Tympole(String name, int level){
        super(name, level);
        setType(Type.WATER);
        setStats(50, 50, 40, 50, 40, 64);
        Waterfall wat = new Waterfall();
        IceBeam ib = new IceBeam();
        Overheat oh = new Overheat();
        ScaryFace sf = new ScaryFace();
        setMove(wat, ib, oh, sf);
    }
}
