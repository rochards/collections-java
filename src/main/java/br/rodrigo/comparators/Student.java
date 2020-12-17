package br.rodrigo.comparators;

public class Student implements Comparable<Student>{

    private final String name;
    private final Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{" + this.name + ", " + this.age + "}";
    }

    // vou ordenar por idade sempre que eu precisar
    @Override
    public int compareTo(Student student) {
        /*
        * > 0: o objeto atual é maior que o passado na escala de ordenação;
        * = 0: o objeto atual é igual;
        * < 0: o objeto atual é menor;
        * */
        return this.getAge() - student.getAge();
    }
}
