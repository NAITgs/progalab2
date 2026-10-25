package pokemons;
import moves.physical.Headbutt;
import moves.special.Overheat;
import moves.status.Swagger;
import moves.special.MudBomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Torchic extends Pokemon {
    public Torchic(String name, int level){
        super(name, level);
        setType(Type.FIRE);
        setStats(45, 60, 40, 70, 50, 45);
        Overheat oh = new Overheat();
        Swagger sw = new Swagger();
        Headbutt hb = new Headbutt();
        MudBomb mb = new MudBomb();
        setMove(oh, sw, hb, mb);
    }
}
