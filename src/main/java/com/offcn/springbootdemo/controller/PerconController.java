package com.offcn.springbootdemo.controller;

import com.offcn.springbootdemo.bean.Person;
import com.offcn.springbootdemo.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PerconController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping(path = "addPerson")
    public void addPerson(@RequestBody Person person){
        personRepository.save(person);
    }

    @GetMapping(path = "getAllPerson")
    public List<Person> getPerson(){
        return personRepository.findAll();
    }

    @PutMapping(path="updatePerson")
    public void updatePerson(@RequestBody Person person) {
        personRepository.saveAndFlush(person);
    }

    @DeleteMapping(path="deletePerson")
    public void deletePerson(@RequestParam Long id) {
        personRepository.deleteById(id);
    }

}
