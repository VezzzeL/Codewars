package tasks.kata7;

//Write push() and buildOneTwoThree() functions to easily update and initialize linked lists.
// Try to use the push() function within your buildOneTwoThree() function.
public class PushBuildOneTwoThree {
    int data;
    PushBuildOneTwoThree next = null;

    PushBuildOneTwoThree(int data) {
        this(null, data);
    }

    PushBuildOneTwoThree(PushBuildOneTwoThree child, int data) {
        this.next = child;
        this.data = data;
    }

    static PushBuildOneTwoThree push(PushBuildOneTwoThree head, int data) {
        return new PushBuildOneTwoThree(head, data);
    }

    static PushBuildOneTwoThree buildOneTwoThree() {
        return new PushBuildOneTwoThree(new PushBuildOneTwoThree(new PushBuildOneTwoThree(3), 2), 1);
    }
}
