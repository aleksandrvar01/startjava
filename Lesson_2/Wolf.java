public class Wolf {

    private String gender;
    private String name;
    private float weight;
    private int age;
    private String color;

    public String getGender() {
        return gender;
    }

    public void setGender(String wolfGender) {
        gender = wolfGender;
    }

    public String getName() {
        return name;
    }

    public void setName(String wolfName) {
        name = wolfName;
    }
 
    public float getWeight() {
        return weight;
    }

    public void setWeight(float wolfWeight) {
        weight = wolfWeight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int wolfAge) {
        if (wolfAge > 8) {
            System.out.print("Некорректный возраст\n");
        } else {
            age = wolfAge;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String wolfColor) {
        color = wolfColor;
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void go() {
        System.out.println("Идёт");
    }

    public void hunt() {
        System.out.println("Охотится");
    }
}