package sef.module17.activity;

import junit.framework.TestCase;
//extend this class to TestCase
public class AnimalsTest extends TestCase {

   // Create private attribute Animals
    private Animals animals;
    private String expectedText = "Animals species is: %s and color: %s";

    //Create set up and in set up initialize Animals
    protected void setUp () throws Exception {
        super.setUp();
        animals = new Animals();
    }
        // Create test which will validate that d=Dog text is returned
        public void testBlueDogAnimal() {
            animals.setColor("blue");
            assertEquals(String.format(expectedText, "Dog", "blue"), animals.getColorAndSpecies("blue",0));

        }


        //Create test which will validate that Cat text is returned
        public void testBlueCatAnimal() {
            animals.setColor("blue");
            assertEquals(String.format(expectedText,"Cat","blue"), animals.getColorAndSpecies("blue",1));
        }
        //Create test which will validate that Mouse text is returned

        //Create a test were you need to add new species and validate that the
        //species has been added to the list

        public void testAddSpecies () {
            animals.setSpecies("baby shark");
            int sizeOfAnimals = animals.getSpecies().size();
            assertEquals("baby shark", animals.getSpecies(sizeOfAnimals - 1));
        }
    }




