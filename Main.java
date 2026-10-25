import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public final class Main{
    public static void main(String[] args){
        Battle b = new Battle();
        Monferno mon = new Monferno("Монферно", 1);
        Wormadam wor = new Wormadam("Вормадам", 1);
        Grovyle gro = new Grovyle("Гровайл", 1);
        Torchic tor = new Torchic("Торчик", 1);
        Tympole tym = new Tympole("Таймпол", 1);
        Marill mar = new Marill("Мэрилл", 1);
        b.addAlly(wor);
        b.addAlly(mon);
        b.addAlly(tym);

        b.addFoe(gro);
        b.addFoe(mar);
        b.addFoe(tor);
        b.go();
    }
}