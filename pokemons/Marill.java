package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import moves.physical.Headbutt;
import moves.special.Overheat;
import moves.status.Swagger;

public final class Marill extends Pokemon{
    public Marill(String name, int level){
        super(name, level);
        setType(Type.WATER, Type.FAIRY);
        setStats(70, 20, 50, 20, 50, 40);
        Overheat oh = new Overheat();
        Swagger sw = new Swagger();
        Headbutt hb = new Headbutt();
        setMove(oh, sw, hb);
    }
}
