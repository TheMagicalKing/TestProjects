package JavaInterfaces;

public class Pokemon {

    private String name, element, gender, evoFrom, evoTo;
    private int pokeValue;
    private short damage;


    public Pokemon(){}

    @Override
    public String toString(){
        String beskrivelse ="Pokemon " + name + pokeValue;
        return beskrivelse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
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
