package beans.rooms;

import beans.Light;
import beans.RemoteControl;
import commands.light.LightOffCommand;
import commands.light.LightOnCommand;

public class Kitchen implements Room {
    private final String name;
    private final Light light;
    private final RemoteControl remote;

    public Kitchen(String name) {
        this.name = name;
        this.light = new Light();
        this.remote = new RemoteControl();
    }

    @Override
    public void enter() {
        System.out.println("Person betritt " + name);
        remote.setCommand(new LightOnCommand(light));
        remote.pressButton();
    }

    @Override
    public void leave() {
        System.out.println("Person verlässt " + name);
        remote.setCommand(new LightOffCommand(light));
        remote.pressButton();
    }
}
