package packagepackage;

/**
 * Created by HP on 08.11.2016.
 */
public class Human {
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }

    public String name;
        private int age;
        public int[] marks;

        public void setAge(int age) {
            if (age >= 0 && age <= 110) {
                this.age = age;
            } else {
                this.age = 0;
            }
        }
        public double averageMark;

        public int getAge() {
            return this.age;
        }
}
