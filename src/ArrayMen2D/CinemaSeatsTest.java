package ArrayMen2D;

public class CinemaSeatsTest {
    public static void main(String[] args) {

        CinemaSal sal = new CinemaSal(4, 5);

        System.out.println("Ledig sal:");
        sal.print();

        sal.book(0, 2);
        sal.book(1, 1);
        sal.book(1, 3);
        sal.book(3, 4);

        System.out.println("\nEfter booking:");
        sal.print();

        System.out.println("\nLedige sæder: " + sal.countAvailable());
        System.out.println("Bookede sæder: " + sal.countBooked());
    }
}
