package lesson_5;

import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class Test {

    private StudentService studentService;

    public Test() {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        StudentRepository studentRepository = new StudentRepositoryImpl(factory);
        studentService = new StudentService(studentRepository, factory);
    }

    public void start() {

        //Создаем список из 1000 студентов и добавляем в БД
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            students.add(new Student("Student_" + "0".repeat(4 - Integer.toString(i).length()) + i, (int) (Math.random() * 10)));
        }
        studentService.addStudents(students);

        studentService.removeAllStudents();


        List<Student> studentsList = studentService.findAllStudents();
        Long id = studentsList.get(2).getId();
        //Удаление записи в таблице
        studentService.deleteStudentById(id);

        String newName = "NEW";
        //Изменить имя предпоследнего в списке студента
        studentService.renameStudent(id, newName);

        //Удалить все записи из таблицы
        studentService.removeAllStudents();

        //Закрыть фабрику HibernateUtil
        HibernateUtil.shutdown();
    }

}