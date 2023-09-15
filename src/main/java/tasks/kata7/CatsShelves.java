package tasks.kata7;

//An infinite number of shelves are arranged one above the other in a staggered fashion.
//The cat can jump either one or three shelves at a time: from shelf i to shelf i+1 or i+3 (the cat cannot climb on
// the shelf directly above its head), according to the illustration:
//                 ┌────────┐
//                 │-6------│
//                 └────────┘
//┌────────┐
//│------5-│
//└────────┘  ┌─────► OK!
//            │    ┌────────┐
//            │    │-4------│
//            │    └────────┘
//┌────────┐  │
//│------3-│  │
//BANG!────┘  ├─────► OK!
//  ▲  |\_/|  │    ┌────────┐
//  │ ("^-^)  │    │-2------│
//  │ )   (   │    └────────┘
//┌─┴─┴───┴┬──┘
//│------1-│
//└────────┘
public class CatsShelves {
    public static int solution(int start, int finish) {
        return (finish - start) / 3 + ((finish - start) % 3);
    }
}
