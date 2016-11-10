package packagepackage;
/**
 * Created by HP on 08.11.2016.
 */

public class Program {

        public static void main(String[] args) {
            Human valera;
            valera = new Human();
            valera.name = "valera";
            valera.setAge(22);

            int marksOfValera[] = {4, 4, 5};
            valera.marks = marksOfValera;
            double getAverageMarks7 = getAverageMarks (valera.marks);
            valera.averageMark = getAverageMarks7;
            Human galera;
            galera = new Human();
            galera.name = "galera";
            galera.setAge(22);

            int marksOfGalera[] = {5, 4, 2};
            galera.marks = marksOfGalera;
            double getAverageMarks6 = getAverageMarks(galera.marks);
            galera.averageMark = getAverageMarks6;

            Human kostia;
            kostia = new Human();
            kostia.name = "kostia";
            kostia.setAge(22);

            int marksOfKostia[] = {3, 3, 5};
            kostia.marks = marksOfKostia;
            double getAverageMarks5 = getAverageMarks (kostia.marks);
            kostia.averageMark = getAverageMarks5;
            Human saimon;
            saimon = new Human();
            saimon.name = "Saimon";
            saimon.setAge(22);

            int marksOfSaimon[] = {2, 2, 2};
            saimon.marks = marksOfSaimon;
            double getAverageMarks4 = getAverageMarks (saimon.marks);
            saimon.averageMark = getAverageMarks4;
            Human vasia;
            vasia = new Human();
            vasia.name = "Vasia";
            vasia.setAge(22);

            int marksOfVasia[] = {2, 3, 2};
            vasia.marks = marksOfVasia;
            double getAverageMarks3 = getAverageMarks (vasia.marks);
            vasia.averageMark = getAverageMarks3;
            Human petia;
            petia = new Human();
            petia.name = "Petia";
            petia.setAge(22);

            int marksOfPetia[] = {1, 1, 2};
            petia.marks = marksOfPetia;
            double getAverageMarks2 = getAverageMarks (petia.marks);

            petia.averageMark = getAverageMarks2;

            Human students[] = {valera, galera, saimon, vasia, petia, kostia};
            System.out.println(students[0].name);
            System.out.println(students[1].name);
            System.out.println(students[2].name);
            System.out.println(students[3].name);
            System.out.println(students[4].name);
            System.out.println(students[5].name);

            sortPeople(students);

            System.out.println(getAverageMarks7);
            System.out.println(getAverageMarks6);
            System.out.println(getAverageMarks5);
            System.out.println(getAverageMarks4);
            System.out.println(getAverageMarks3);
            System.out.println(getAverageMarks2);

            System.out.println(students[0]);
            System.out.println(students[1]);
            System.out.println(students[2]);
            System.out.println(students[3]);
            System.out.println(students[4]);
            System.out.println(students[5]);

        }
        public static double getAverageMarks (int[] a) {
            double b=0;
            for (int i = 0; i < a.length; i++) {
                b+= a[i];
            }
            double c = (b/a.length);
            return c;

        }

        private static void sortPeople (Human arr[]) {
            for (int i = arr.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr[j].averageMark > arr[j + 1].averageMark){
                        Human tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
            }
        }}