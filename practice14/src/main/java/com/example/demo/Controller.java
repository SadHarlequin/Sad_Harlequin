package com.example.demo;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    private ArrayList<PatientAble> list = new ArrayList<>();

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getTestPage() {
        return "index.html";
    }

    @PostMapping(value = "/create-patient")
    @ResponseBody
    public void createPatient(@RequestBody Patient patient) {
        list.add(patient);
    }

    @PostMapping(value = "/create-patient2")
    @ResponseBody
    public void createPatient2(@RequestBody Patient2 patient2) {
        list.add(patient2);
    }

    @GetMapping(value = "/delete-patient")
    @ResponseBody
    public void deletePatient(String firstName, String lastName) {
        List<PatientAble> rList = new ArrayList<>();
        list.stream()
                .filter(item -> item instanceof Patient)
                .map(Patient.class::cast)
                .filter(patient -> patient.getFirstName().equals(firstName) && patient.getLastName().equals(lastName))
                .forEach(rList::add);
        list.removeAll(rList);
    }

    @GetMapping(value = "/delete-patient2")
    @ResponseBody
    public void deleteAuthor(String firstName, String lastName, String position) {
        List<PatientAble> rList = new ArrayList<>();
        list.stream()
                .filter(item -> item instanceof Patient2)
                .map(Patient2.class::cast)
                .filter(patient2 -> patient2.getFirstName().equals(firstName) && patient2.getLastName().equals(lastName) && patient2.getPosition().equals(position))
                .forEach(rList::add);
        list.removeAll(rList);
    }

    @GetMapping(value = "/show-patient")
    @ResponseBody
    public Object[] showPatient() {
        return list.stream()
                .filter(item -> item instanceof Patient).toArray();
    }

    @GetMapping(value = "/show-patient2")
    @ResponseBody
    public Object[] showPatient2() {
        return list.stream()
                .filter(item -> item instanceof Patient2).toArray();
    }

    @GetMapping(value = "/show-all")
    @ResponseBody
    public Object[] showAll() {
        return list.toArray();
    }
}
