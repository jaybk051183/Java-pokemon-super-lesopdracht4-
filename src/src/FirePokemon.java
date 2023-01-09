public class FirePokemon extends Pokemon {
    private int firePower;
    private int fireResistence;

    public FirePokemon(String name, int firePower, int fireResistence){
        super(name, "Fire");
        this.firePower = firePower;
        this.fireResistence = fireResistence;
    }

    public int getFirePower(){
        return this.firePower;
    }

    public void setFirePower(int firePower){
        this.firePower = firePower;
    }

    public int getFireResistence(){
        return this.fireResistence;
    }

    public void setFireResistence(int fireResistence){
        this.fireResistence = fireResistence;
    }

    @Override
    public void attack(){
        System.out.println(this.getName() + "used a fire attack");
    }

}
