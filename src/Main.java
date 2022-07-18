public class Main {
    public static void main(String[] args) {
        int [] newArray = adg(new int [] {3, 5, -6, 7, 2, 4, 4, 3, 2, 1, 3, -8});
        for (int number : newArray) {
            System.out.println(number);
        }
    }
    private static int[] adg(int [] array) {
        int [] res = new int [array.length];

        for (int a = 0; a < res.length; a++) {
            res[a] = array[a] > 0 ? array [a] : -1 * array [a];
        }
        return res;
    }
}