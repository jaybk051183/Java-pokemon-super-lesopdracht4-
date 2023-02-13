public class GrassPokemon extends Pokemon{
    private int grassPower;
    private String grassType;

    public GrassPokemon(String name, int level, int grassPower, String grassType) {
        super(name, level);
        this.grassPower = grassPower;
        this.grassType = grassType;
    }

    public int getGrassPower() {
        return grassPower;
    }

    public void setGrassPower(int grassPower) {
        this.grassPower = grassPower;
    }

    public String getGrassType() {
        return grassType;
    }

    public void setGrassType(String grassType) {
        this.grassType = grassType;
    }

    public void LeafStorm(){
        System.out.println(getName() + " uses LeafStorm, type " + getGrassType() + " and power " + getGrassPower());
    }

    public void LeechSeed(){
        System.out.println(getName() + " uses LeechSeed, type " + getGrassType() + " and power " + getGrassPower());
    }

    @Override
    public void attack(){
        System.out.println(getName() + " is attacking with level " + getLevel()+ " and power " + getGrassPower());
    }
}
