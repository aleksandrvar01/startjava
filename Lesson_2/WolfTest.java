public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "мужской";
        wolf.name = "Джанго";
        wolf.weight = 70.5f;
        wolf.age = 5;
        wolf.color = "черный";
        System.out.println("У объекта: пол - " + wolf.gender + ", кличка - " + wolf.name + ", вес - " + wolf.weight + ", возраст - " + wolf.age + ", цвет - " + wolf.color + ".");

        wolf.howl();
        wolf.sit();
        wolf.run();
        wolf.go();
        wolf.hunt();
    }
}
