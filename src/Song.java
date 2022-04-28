import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Song {

    public void printSong(PrintStream ps) throws FileNotFoundException {

        for (int day = 1; day <= 12; day++) {

            ps.print("On the ");
            ps.print(day);

            switch (day) {
                case 1 ->  ps.print("st");
                case 2 ->  ps.print("nd");
                case 3 ->  ps.print("rd");
                default -> ps.print("th");
            }

            ps.println(" day of Christmas my true love gave to me");

            switch (day) {
                case 12: ps.println("Twelve drummers drumming,");
                case 11: ps.println("Eleven pipers piping,");
                case 10: ps.println("Ten lords a leaping,");
                case 9:  ps.println("Nine ladies dancing,");
                case 8:  ps.println("Eight maids a milking,");
                case 7:  ps.println("Seven swans a swimming,");
                case 6:  ps.println("Six geese a laying,");
                case 5:  ps.println("Five golden rings,");
                case 4:  ps.println("Four calling birds,");
                case 3:  ps.println("Three French hens,");
                case 2:  ps.println("Two turtle doves, and");
                default: ps.println("A partridge in a pear tree.");
            }

            ps.println();
        }
    }


    public static void main(String[] args) throws FileNotFoundException {

        PrintStream ps = new PrintStream("sang.txt");

        Song song = new Song();
        song.printSong(ps);

        song.printSong(System.out);

        System.out.println("Hallo");
    }
}
