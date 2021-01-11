package lab.andersen.katokoleg.patterns.abstractfactory.samsung;

import lab.andersen.katokoleg.patterns.abstractfactory.AbstractFactory;
import lab.andersen.katokoleg.patterns.abstractfactory.AudioSpeakers;
import lab.andersen.katokoleg.patterns.abstractfactory.SoundSystem;
import lab.andersen.katokoleg.patterns.abstractfactory.TV;

public class SamsungAbstractFactory implements AbstractFactory {
    @Override
    public TV createTV() {
        return new SamsungTV();
    }

    @Override
    public SoundSystem createSoundSystem() {
        return new SamsungSoundSystem();
    }

    @Override
    public AudioSpeakers createAudioSpeakers() {
        return new SamsungAudioSpeakers();
    }
}
