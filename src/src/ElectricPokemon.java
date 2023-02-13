public class ElectricPokemon extends Pokemon{
    private int electricPower;
    private String electricType;

    public ElectricPokemon(String name, int level, int electricPower, String electricType) {
        super(name, level);
        this.electricPower = electricPower;
        this.electricType = electricType;
    }

    public int getElectricPower() {
        return electricPower;
    }

    public void setElectricPower(int electricPower) {
        this.electricPower = electricPower;
    }

    public String getElectricType() {
        return electricType;
    }

    public void setElectricType(String electricType) {
        this.electricType = electricType;
    }

    public void Thunder(){
        System.out.println(getName() + " uses Thunder, type " + getElectricType() + " and power " + getElectricPower());
    }

    public void VoltTackle(){
        System.out.println(getName() + " uses VoltTackle, type " + getElectricType() + " and power " + getElectricPower());
    }

    @Override
    public void attack(){
        System.out.println(getName() + " is attacking with level " + getLevel()+ " and power " + getElectricPower());
    }
}

