import beans.rooms.Bedroom;
import beans.rooms.Kitchen;
import beans.rooms.LivingRoom;
import beans.rooms.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main{
    public static void main() throws InterruptedException {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new LivingRoom("Wohnzimmer"));
        rooms.add(new Kitchen("Küche"));
        rooms.add(new Bedroom("Schlafzimmer"));
        rooms.add(new Bedroom("Schlafzimmer"));

        Random rand = new Random();
        Room currentRoom = null;

        for (int i = 0; i < 10; i++) {
            int roomIndex = rand.nextInt(rooms.size());
            Room nextRoom = rooms.get(roomIndex);

            if (currentRoom != null) {
                currentRoom.leave();
            }

            nextRoom.enter();
            currentRoom = nextRoom;

            Thread.sleep(500);
        }

        currentRoom.leave();
    }
}