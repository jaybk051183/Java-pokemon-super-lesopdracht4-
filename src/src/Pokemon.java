public class Pokemon {
    private String type;
    private String name;

    public Pokemon(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public void attack(){
        System.out.println(this.name + "used a basic attack");
    }

    public void defend(){
        System.out.println(this.type + "used a basic defense");
    }
}
