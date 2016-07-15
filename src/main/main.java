package main;

import factory.ActiveSonobuoyFactory;
import factory.PassiveSonobuoyFactory;
import factory.SpecialSonobuoyFactory;

public class main {
	public static void main(String[] args) {
		MissionSettings settings = new MissionSettings();
        Sonobuoy sonobuoy = null;
        switch (settings.getDeploymentType()) {
            case 0:
                sonobuoy = new Sonobuoy(new ActiveSonobuoyFactory());
                break;
            case 1:
                sonobuoy = new Sonobuoy(new PassiveSonobuoyFactory());
                break;
            case 2:
                sonobuoy = new Sonobuoy(new SpecialSonobuoyFactory());
                break;
            default:
                break;
        }

        if (sonobuoy != null) {
            sonobuoy.run();
        }

	}

}
