package lesson_5;

import org.hibernate.SessionFactory;

import java.util.List;

public class StudentService {

    private final StudentRepository studentRepository;
    private final SessionFactory factory;

    public StudentService(StudentRepository studentRepository, SessionFactory factory) {
        this.studentRepository = studentRepository;
        this.factory = factory;
    }

    public Student findStudentById(Long id){
        return studentRepository.findById(id);
    }

    public List<Student> findAllStudents(){
        return studentRepository.findAll();
    }

    public void printAllStudents(){
        System.out.println("Список студентов:");
        studentRepository.findAll().forEach(System.out::println);
    }

    public void addStudents(List<Student> studentsList) {
        System.out.println("Добавление новых записей: " + studentsList.size());
        studentRepository.mergeBatch(studentsList);
    }

    public void removeAllStudents() {
        System.out.println("Удаление всех записей");
        studentRepository.removeAll();
    }

    public void deleteStudentById(Long id){
        studentRepository.deleteById(id);
    }

    public Student renameStudent(Long id, String newName){

        if (studentRepository.countAll() == 0) return null;
        Student student = studentRepository.findById(id);
        if (student != null) {
            student.setName(newName);
            studentRepository.merge(student);
            return student;
        }
        return null;
    }


}
