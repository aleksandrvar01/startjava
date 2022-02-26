public class WolfTest {
	public static void main(String[] args) {
		Wolf w = new Wolf();
		w.gender = "мужской";
		w.name = "Джанго";
		w.weight = 70.5f;
		w.age = 5;
		w.color = "черный";

		System.out.println("У объекта: пол - " + w.gender + ", кличка - " + w.name + ", вес - " + w.weight + ", возраст - " + w.age + ", цвет - " + w.color + ".");

		w.howls();
	    w.sit();
	    w.run();
	    w.go();
	    w.hunt();
	}
}