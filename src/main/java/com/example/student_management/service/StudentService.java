package com.example.student_management.service;

import com.example.student_management.exception.StudentNotFoundException;
import com.example.student_management.model.Student;
import com.example.student_management.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElseThrow(() ->
                new StudentNotFoundException(
                        "Student not found with id: " + id
                ));
    }

    public Student updateStudent(Integer id, Student student){
        Student existingStudent =
                studentRepository.findById(id).orElseThrow(() ->
                        new StudentNotFoundException(
                                "Student not found with id: " + id
                        ));


            existingStudent.setName(student.getName());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setAge(student.getAge());
            existingStudent.setCourse(student.getCourse());

            return studentRepository.save(existingStudent);


    }

    public void deleteStudent(Integer id) {

        if (!studentRepository.existsById(id)) {
            throw new StudentNotFoundException(
                    "Student not found with id: " + id
            );
        }

        studentRepository.deleteById(id);
    }

}
