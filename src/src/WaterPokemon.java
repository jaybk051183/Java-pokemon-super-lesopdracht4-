public class WaterPokemon extends Pokemon{
    private int waterPower;
    private String waterType;

    public WaterPokemon(String name, int level, int waterPower, String waterType) {
        super(name, level);
        this.waterPower = waterPower;
        this.waterType = waterType;
    }

    public int getWaterPower() {
        return waterPower;
    }

    public void setWaterPower(int waterPower) {
        this.waterPower = waterPower;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public void HydroPump(){
        System.out.println(getName() + " uses HydroPump, type " + getWaterType() + " and power " + getWaterPower());
    }

    public void Surf(){
        System.out.println(getName() + " uses Surf, type " + getWaterType() + " and power " + getWaterPower());
    }

    @Override
    public void attack(){
        System.out.println(getName() + " is attacking with level " + getLevel()+ " and power " + getWaterPower());
    }
}
