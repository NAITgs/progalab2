package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import moves.special.Overheat;
import moves.status.Swagger;


public final class Grovyle extends Pokemon{
    public Grovyle(String name, int level){
        super(name, level);
        setType(Type.GRASS);
        setStats(50, 65, 45, 85, 65, 95);
        Overheat oh = new Overheat();
        Swagger sw = new Swagger();
        setMove(oh, sw);
    }
}
