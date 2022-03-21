public class wolfolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "мужской";
        wolf.name = "Джанго";
        wolf.wolfeight = 70.5f;
        wolf.age = 5;
        wolf.color = "черный";
        System.out.println("У объекта: пол - " + wolf.gender + ", кличка - " + wolf.name + ", вес - " + wolf.wolfeight + ", возраст - " + wolf.age + ", цвет - " + wolf.color + ".");

        wolf.howolfls();
        wolf.sit();
        wolf.run();
        wolf.go();
        wolf.hunt();
    }
}