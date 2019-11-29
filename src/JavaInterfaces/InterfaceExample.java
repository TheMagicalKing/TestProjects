package JavaInterfaces;

public class InterfaceExample {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        pikachu.setDamage((short) 80);
        pikachu.setName("Pikachu");
        pikachu.setElement("Electric");
        pikachu.setEvoTo("Raichu");
        pikachu.setPokeValue(25);
        System.out.println("hey");
    }
}
