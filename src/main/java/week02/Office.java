package week02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getName());
        }
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size() - 1; i > -1; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEventNames() {
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (i % 2 != 0) {
                System.out.println(meetingRooms.get(i).getName());
            }
        }
    }

    public void printAreas() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getName() + ": " + meetingRoom.getWidth() + "m " + meetingRoom.getLength() + "m " + meetingRoom.getArea() + "m2");
        }
    }

    public void printMeetingRoomsWithName(String name) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (name.equals(meetingRoom.getName())) {
                System.out.println(meetingRoom.getWidth() + "m " + meetingRoom.getLength() + "m " + meetingRoom.getArea() + "m2");
            }
        }
    }

    public void printMeetingRoomsContains(String part) {
        String lowerPart = part.toLowerCase();
        for (MeetingRoom meetingRoom : meetingRooms) {
            String lowerRoom = meetingRoom.getName().toLowerCase();
            if (lowerRoom.indexOf(lowerPart) > -1) {
                System.out.println(meetingRoom.getWidth() + "m " + meetingRoom.getLength() + "m " + meetingRoom.getArea() + "m2");
            }
        }
    }

    public void printAreasLargerThan(int area) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getArea() > area) {
                System.out.println(meetingRoom.getName() + ": " + meetingRoom.getWidth() + "m " + meetingRoom.getLength() + "m " + meetingRoom.getArea() + "m2");
            }
        }
    }
}
