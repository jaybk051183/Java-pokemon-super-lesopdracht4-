public class FirePokemon extends Pokemon{

    private int firePower;
    private String fireType;

    public FirePokemon(String name, int level, int firePower, String fireType) {
        super(name, level);
        this.firePower = firePower;
        this.fireType = fireType;
    }

    public int getFirePower() {
        return firePower;
    }

    public void setFirePower(int firePower) {
        this.firePower = firePower;
    }

    public String getFireType() {
        return fireType;
    }

    public void setFireType(String fireType) {
        this.fireType = fireType;
    }

    public void FlameThrower(){
        System.out.println(getName() + " uses FlameThrower, type " + getFireType() + " and power " + getFirePower());
    }

    @Override
    public void attack(){
        System.out.println(getName() + " is attacking with level " + getLevel()+ " and power " + getFirePower());
    }
}
