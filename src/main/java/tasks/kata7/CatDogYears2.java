package tasks.kata7;

//I have a cat and a dog which I got as kitten / puppy.
//I forget when that was, but I do know their current ages as catYears and dogYears.
//Find how long I have owned each of my pets and return as a list [ownedCat, ownedDog]
//NOTES:
//Results are truncated whole numbers of "human" years
public class CatDogYears2 {
    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        return new int[]{animalToHuman(catYears, 4), animalToHuman(dogYears, 5)};
    }

    private static int animalToHuman(int aY, int multi) {
        int hY = 0;
        for (int i = 0; aY > 0; i++) {
            if (i == 0) aY -= 15;
            if (i == 1) aY -= 9;
            if (i > 1) aY -= multi;
            if (aY >= 0) hY++;
        }
        return hY;
    }
}
