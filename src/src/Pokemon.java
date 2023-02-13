public class Pokemon {

    //Private variabelen aanmaken:
    private String name;
    private int level;

    //Constructor maken en variabelen als parameters meegeven:
    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    //Getters & Setters per variable aanmaken:

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    //Twee methodes meegeven:

    public void attack(){
        System.out.println(name + " is attacking with level " + level);
    }

    public void defend(){
        System.out.println(name + " is defending with level " + level);
    }
}
