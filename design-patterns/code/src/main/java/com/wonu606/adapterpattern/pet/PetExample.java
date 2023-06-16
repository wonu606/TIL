package com.wonu606.adapterpattern.pet;

import java.util.ArrayList;
import java.util.List;

public class PetExample {

    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Dog("강아지"));
        pets.add(new Cat("고양이"));
//        pets.add(new Quokka("쿼카")); // error
        pets.add(new KangarooAdapter(new Quokka("쿼카")));

        for (Pet pet : pets) {
            pet.sound();
        }
    }
}
