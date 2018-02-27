package io.zipcoder;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class PetTest {
    Pet pet;

    @Before
    public void setUp() {
        pet = new Pet();
    }

    @Test
    public void getPetNameTest(){
        String petName = "Doug";
        pet.setPetName(petName);
        boolean nameHasBeenSet = pet.getPetName().contains(petName);
        assertTrue(nameHasBeenSet);
        }
    }

