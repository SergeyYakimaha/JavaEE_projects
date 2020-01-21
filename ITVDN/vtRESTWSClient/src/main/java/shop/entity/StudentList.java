package shop.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="students")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentList", propOrder = {"student"})
public class StudentList {
    protected List<Student> student = new ArrayList<Student>();

    public StudentList() {
    }

    public StudentList(List<Student> students) {
        this.student = students;
    }

    public void addStudent(Student student) {
        this.student.add(student);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(Student student : this.student) {
            stringBuilder.append("Id = " + student.getId() + " name = " + student.getName() + " age = " + student.getAge() + "\n");
        }
        return stringBuilder.toString().trim();
    }
}
