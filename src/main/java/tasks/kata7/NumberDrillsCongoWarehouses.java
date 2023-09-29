package tasks.kata7;

//Your company, Congo Pizza, is the second-largest online frozen pizza retailer. You own a number of international
// warehouses that you useto store your frozen pizzas, and you need to figure out how many crates of pizzas you can
// store at each location.
//Congo recently standardized its storage containers: all pizzas fit inside a cubic crate, 16-inches on a side. The
// crates are super tough so you can stack them as high as you want.
//Write a function box_capacity() that figures out how many crates you can store in a given warehouse. The function
// should take three arguments: the length, width, and height of your warehouse (in feet) and should return an integer
// representing the number of boxes you can store in that space.
public class NumberDrillsCongoWarehouses {
    public static int boxCapacity(int l, int w, int h) {
        return (l * 12 / 16) * (w * 12 / 16) * (h * 12 / 16);
    }
}
