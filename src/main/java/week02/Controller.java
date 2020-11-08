package week02;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Controller {

    private Office office;

    public void readOffice() {
        office = new Office();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hány tárgyalót szeretne rögzíteni?");
        int meetingRoomsNumber = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= meetingRoomsNumber; i++) {
            System.out.println("Kérem a(z) " + i + ". tárgyaló nevét.");
            String name = scanner.nextLine();
            System.out.println("Kérem a hosszát.");
            int length = scanner.nextInt();
            System.out.println("Kérem a szélességét.");
            int width = scanner.nextInt();
            scanner.nextLine();

            MeetingRoom meetingRoom = new MeetingRoom(name, length, width);
            office.addMeetingRoom(meetingRoom);
        }

    }

    public void printMenu(){
        System.out.println();
        System.out.println("Választható menüpontok:");
        System.out.println();
        System.out.println("1. Tárgyalók sorrendben");
        System.out.println("2. Tárgyalók visszafele sorrendben");
        System.out.println("3. Minden második tárgyaló");
        System.out.println("4. Területek");
        System.out.println("5. Keresés pontos név alapján");
        System.out.println("6. Keresés névtöredék alapján");
        System.out.println("7. Keresés terület alapján");
    }

    public void runMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem válaszon menüpontot");
        int menuNumber = scanner.nextInt();
        scanner.nextLine();

        switch(menuNumber){
            case 1: this.office.printNames();
            break;
            case 2: this.office.printNamesReverse();
            break;
            case 3: this.office.printEventNames()
            break;
            case 4: this.office.printAreas();
            break;
            case 5: this.office.printMeetingRoomsWithName();
            break;
            case 6: this.office.printMeetingRoomsContains();
            break;
            case 7: this.office.printAreasLargerThan();
            break;
        }
    }


    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();
        controller.runMenu();








        /*MeetingRoom targyalo = new MeetingRoom("Tárgyaló", 10, 7);
        MeetingRoom kistargyalo = new MeetingRoom("KisTárgyaló", 4, 5);
        MeetingRoom fonokitargyalo = new MeetingRoom("Főnöki tárgyaló", 2, 8);
        MeetingRoom muszakiIroda = new MeetingRoom("Műszaki iroda", 12, 8);
        MeetingRoom penzugyiIroda = new MeetingRoom("Pénzügyi iroda", 2, 18);

        System.out.println(targyalo.getArea());
        System.out.println(kistargyalo.getArea());
        System.out.println(fonokitargyalo.getArea());
        System.out.println();

        Office meetingRooms = new Office();

        meetingRooms.addMeetingRoom(targyalo);
        meetingRooms.addMeetingRoom(fonokitargyalo);
        meetingRooms.addMeetingRoom(kistargyalo);
        meetingRooms.addMeetingRoom(muszakiIroda);
        meetingRooms.addMeetingRoom(penzugyiIroda);

        meetingRooms.printNames();
        System.out.println();
        meetingRooms.printNamesReverse();
        System.out.println();
        meetingRooms.printEventNames();
        System.out.println();
        meetingRooms.printAreas();
        System.out.println();
        meetingRooms.printMeetingRoomsWithName("tárgyaló");
        meetingRooms.printMeetingRoomsWithName("tárgyalo");
        meetingRooms.printMeetingRoomsWithName("MŰSZAKI IRODA");
        System.out.println();
        meetingRooms.printMeetingRoomsContains("Iroda");
        System.out.println();
        meetingRooms.printAreasLargerThan(20);*/

    }
}