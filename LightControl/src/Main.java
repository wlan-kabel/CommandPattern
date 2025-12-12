public class Main{
    public static void main() {
// Receiver
        Light livingRoomLight = new Light();

        // Commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Licht einschalten
        remote.setCommand(lightOn);
        remote.pressButton(); // Ausgabe: Licht ist AN

        // Licht ausschalten
        remote.setCommand(lightOff);
        remote.pressButton(); // Ausgabe: Licht ist AUS
    }
}