package beans.rooms;

import beans.AirConditioning;
import beans.RemoteControl;
import commands.airconditioning.ACOffCommand;
import commands.airconditioning.ACOnCommand;

public class Bedroom implements Room{
    private final String name;
    private final AirConditioning airConditioning;
    private final RemoteControl remote;

    public Bedroom(String name) {
        this.name = name;
        this.airConditioning = new AirConditioning();
        this.remote = new RemoteControl();
    }

    @Override
    public void enter() {
        System.out.println("Person betritt " + name);
        remote.setCommand(new ACOnCommand(airConditioning));
        remote.pressButton();
    }

    @Override
    public void leave() {
        System.out.println("Person verlässt " + name);
        remote.setCommand(new ACOffCommand(airConditioning));
        remote.pressButton();
    }
}
