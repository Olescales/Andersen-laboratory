package lab.andersen.katokoleg.patterns.abstractfactory;

import java.util.Map;

public class HardwareShop {

    private Map<String, AbstractFactory> abstractFactory;

    public HardwareShop(Map<String, AbstractFactory> abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public TV buyTV(String brandName) {
        AbstractFactory abstractFactory = this.abstractFactory.get(brandName);
        return abstractFactory.createTV();
    }

    public SoundSystem buySoundSystem(String brandName) {
        AbstractFactory abstractFactory = this.abstractFactory.get(brandName);
        return abstractFactory.createSoundSystem();
    }
}