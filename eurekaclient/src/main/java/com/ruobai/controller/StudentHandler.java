package com.ruobai.controller;

import com.ruobai.entity.Student;
import com.ruobai.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Autowired
    private StudentRepository studentRepository;
//    获取yml中的值
    @Value("${server.port}")
    private String port;
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentRepository.findAll();
    }
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return studentRepository.findById(id);
    }
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }
    @PutMapping("update")
    public void update(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }
    @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable("id") Long id){
        studentRepository.deleteById(id);
    }
    @GetMapping("/index")
    public String index(){
        return "当前端口:"+this.port;
    }
}
