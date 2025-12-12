package beans.rooms;

import beans.AirConditioning;
import beans.AudioControl;
import beans.RemoteControl;
import commands.airconditioning.ACOffCommand;
import commands.airconditioning.ACOnCommand;
import commands.audio.AudioOffCommand;
import commands.audio.AudioOnCommand;

public class LivingRoom implements Room {
    private final String name;
    private final AirConditioning airConditioning;
    private final AudioControl audioControl;
    private final RemoteControl remote;

    public LivingRoom(String name) {
        this.name = name;
        this.airConditioning = new AirConditioning();
        this.audioControl = new AudioControl();
        this.remote = new RemoteControl();
    }

    @Override
    public void enter() {
        System.out.println("Person betritt " + name);
        remote.setCommand(new ACOnCommand(airConditioning));
        remote.pressButton();

        remote.setCommand(new AudioOnCommand(audioControl));
        remote.pressButton();
    }

    @Override
    public void leave() {
        System.out.println("Person verlässt " + name);
        remote.setCommand(new ACOffCommand(airConditioning));
        remote.pressButton();

        remote.setCommand(new AudioOffCommand(audioControl));
        remote.pressButton();
    }
}
