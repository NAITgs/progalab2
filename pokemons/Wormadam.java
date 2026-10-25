package pokemons;
import moves.status.SunnyDay;
import moves.status.Telekinesis;
import moves.physical.BodySlam;
import moves.special.TrumpCard;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Wormadam extends Pokemon{
    public Wormadam(String name, int level){
        super(name, level);
        setType(Type.BUG, Type.GRASS);
        setStats(60, 59, 85, 79, 105, 36);
        Telekinesis tel = new Telekinesis();
        TrumpCard tc = new TrumpCard();
        BodySlam bs = new BodySlam();
        SunnyDay sd = new SunnyDay();
        setMove(tel, tc, bs, sd);
    }
}