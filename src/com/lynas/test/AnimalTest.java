package com.lynas.test;

import com.lynas.model.Animal;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lynas on 11/6/15.
 */
public class AnimalTest {

    @Test
    public void testAnimalGetName() {
        //given
        String name = "cat";
        //when
        Animal animal = new Animal(1,"cat",22);
        //then
        Assert.assertTrue("cat".equals(animal.getName()));
    }
}
