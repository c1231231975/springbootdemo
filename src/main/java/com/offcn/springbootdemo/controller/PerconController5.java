package com.offcn.springbootdemo.controller;

import com.offcn.springbootdemo.bean.Person;
import com.offcn.springbootdemo.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person5")
public class PerconController5 {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("findFirstByNameOrderByIdDesc/{name}")
    public Person findFirstByNameOrderByIdDesc(@PathVariable String name) {

        return personRepository.findFirstByNameOrderByIdDesc(name);
    }


    @GetMapping("findFirst10ByNameLikeOrderByIdDesc/{name}")
    public List<Person> findFirst10ByNameLikeOrderByIdDesc(@PathVariable String name) {
        return personRepository.findFirst5ByNameLikeOrderByIdDesc("%"+name+"%");
    }



    @GetMapping("findTopByNameOrderByIdAsc/{name}")
    public Person findTopByNameOrderByIdAsc(@PathVariable String name) {
        return personRepository.findTopByNameOrderByIdAsc(name);
    }

    @GetMapping("findTop10ByNameLikeOrderByIdAsc/{name}")
    public List<Person> findTop10ByNameLikeOrderByIdAsc(@PathVariable String name) {
        return personRepository.findTop10ByNameLikeOrderByIdAsc("%"+name+"%");
    }

}
