public class Main {
    public static void main(String[] args) {
        FirePokemon charmander = new FirePokemon("Charmander", 10, 20, "Fire");
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 12, 15, "Water");
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 15, 25, "Grass");
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 20, 30, "Electric");
        charmander.FlameThrower();
        squirtle.Surf();
        bulbasaur.LeafStorm();
        pikachu.Thunder();
        System.out.println();
        charmander.attack();
        squirtle.attack();
        bulbasaur.attack();
        pikachu.attack();
        System.out.println();
        charmander.defend();
        squirtle.defend();
        bulbasaur.defend();
        pikachu.defend();
    }

}



