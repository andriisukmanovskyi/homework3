package com.epam.lab;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    public static final String FILE_NAME = "logs/personInfo.txt";

    private String name;
    private int age;
    private List<Pet> pets;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        pets = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void addPet(Pet pet) throws WrongPetInfoException {
        if (pet.getAge() < 1)
            throw new WrongPetInfoException("Wrong age value = " + pet.getAge());
        if (pet.getName().length() < 1 || !Objects.nonNull(pet.getName()))
            throw new WrongPetInfoException("Wrong name value = " + pet.getName());
        pets.add(pet);
    }

    private void writeFilePersonInfo() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(FILE_NAME)))) {
            bufferedWriter.write("Name: " + name + "; Age: " + age);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}