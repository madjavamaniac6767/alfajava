package org.example.AlfaJava;
/*Создайте класс "Студент" с полями для имени, возраста и среднего балла.
  Напишите методы для установки и получения значений полей, а также метод для вывода информации о студенте.
 */
public class Task2 {
    public static void main(String[] args) {
        Student Shurick = new Student();
        Shurick.setName("Сашка");
        Shurick.setAge( (byte) 20);
        Shurick.setAverageScore(4.12);

        System.out.println(Shurick);
    }

    private static class Student {
        private String name;
        private byte age;
        private double averageScore;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public byte getAge() {
            return age;
        }

        public void setAge(byte age) {
            this.age = age;
        }

        public double getAverageScore() {
            return averageScore;
        }

        public void setAverageScore(double averageScore) {
            this.averageScore = averageScore;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", averageScore=" + averageScore +
                    '}';
        }
    }
}
