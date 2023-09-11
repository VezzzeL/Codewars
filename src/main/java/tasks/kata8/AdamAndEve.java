package tasks.kata8;

//According to the creation myths of the Abrahamic religions, Adam and Eve were the first Humans to wander the Earth.
//You have to do God's job. The creation method must return an array of length 2 containing objects (representing Adam
// and Eve). The first object in the array should be an instance of the class Man. The second should be an instance of
// the class Woman. Both objects have to be subclasses of Human. Your job is to implement the Human, Man and Woman
// classes.
public class AdamAndEve {
    public static Human[] create() {
        return new Human[]{new Man(), new Woman()};
    }

    static class Human {
    }

    static class Man extends Human {
    }

    static class Woman extends Human {
    }
}
