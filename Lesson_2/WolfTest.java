public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("мужской");
        wolf.setName("Джанго");
        wolf.setWeight(70.5f);
        wolf.setAge(35);
        wolf.setColor("черный");
        System.out.println("У объекта: пол - " + wolf.getGender() + ", кличка - " + wolf.getName() + ", вес - " + wolf.getWeight() + ", возраст - " + wolf.getAge() + ", цвет - " + wolf.getColor() + ".");

        wolf.howl();
        wolf.sit();
        wolf.run();
        wolf.go();
        wolf.hunt();
    }
}