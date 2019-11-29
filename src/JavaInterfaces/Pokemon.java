package JavaInterfaces;

public class Pokemon {

    private String name, gender, evoFrom, evoTo;
    private int pokeValue;
    private short damage;


    public Pokemon(){}

    public boolean deathStatus(){
        return false;
    }

    @Override
    public String toString(){
        String beskrivelse ="Pokemon: \n" + name+ "\n" + "Pokedex Number: \n" + pokeValue +"\n"+"Pokemon Gender: \n"+ gender +"\nCurrent Pokemon Attack damage:\n"+damage ;
        return beskrivelse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEvoFrom() {
        return evoFrom;
    }

    public void setEvoFrom(String evoFrom) {
        this.evoFrom = evoFrom;
    }

    public String getEvoTo() {
        return evoTo;
    }

    public void setEvoTo(String evoTo) {
        this.evoTo = evoTo;
    }

    public int getPokeValue() {
        return pokeValue;
    }

    public void setPokeValue(int pokeValue) {
        this.pokeValue = pokeValue;
    }

    public short getDamage() {
        return damage;
    }

    public void setDamage(short damage) {
        this.damage = damage;
    }
}
