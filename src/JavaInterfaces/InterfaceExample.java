package JavaInterfaces;

public class InterfaceExample {
    public static void main(String[] args) {
        FireTypes pikachu = new FireTypes();
        pikachu.setDamage((short) 80);
        pikachu.setName("Pikachu");
        pikachu.setEvoTo("Raichu");
        pikachu.setPokeValue(25);
        pikachu.setGender("Male");
        System.out.println(pikachu.toString());
    }
}
