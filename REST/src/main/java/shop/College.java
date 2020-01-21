package shop;

import shop.entity.Student;
import shop.entity.StudentList;

import java.util.LinkedHashMap;
import java.util.Map;

public class College {
    private static Map<Integer, Student> items;
    private static int key;
    private static College instance;

    public College() {
    }

    static {
        items = new LinkedHashMap<>();
        items.put(++key, new Student(key, "Петров А.А", 10));
        items.put(++key, new Student(key, "Иванов П.П", 20));
        items.put(++key, new Student(key, "Сидоров Р.Р", 30));
        items.put(++key, new Student(key, "Качалов Г.Г", 40));
        items.put(++key, new Student(key, "Мочалов В.В", 50));
        items.put(++key, new Student(key, "Кучеров А.А", 10));
        items.put(++key, new Student(key, "Назаров П.П", 20));
        items.put(++key, new Student(key, "Липинский Р.Р", 30));
        items.put(++key, new Student(key, "Горелов", 30));
        items.put(++key, new Student(key, "Горелов", 50));
    }

    public StudentList searchByName(String name){

        StudentList studentList = new StudentList();

        for(Student student: items.values()){
            if (student.getName().equals(name))
                studentList.addStudent(student);
        }

        return studentList;
    }

    public StudentList searchByAge(int age){
        StudentList studentList = new StudentList();

        for(Student student: items.values()){
            if (student.getAge() == age)
                studentList.addStudent(student);
        }

        return studentList;
    }

    public StudentList searchByNameAndAge(String name, int age){
        StudentList studentList = new StudentList();

        for(Student student: items.values()){
            if (student.getAge() == age && student.getName().equals(name))
                studentList.addStudent(student);
        }

        return studentList;
    }

    public Student gerStudentById(int id) {
        return items.get(id);
    }

}
