package lab.andersen.katokoleg.patterns.abstractfactory.sony;

import lab.andersen.katokoleg.patterns.abstractfactory.AbstractFactory;
import lab.andersen.katokoleg.patterns.abstractfactory.AudioSpeakers;
import lab.andersen.katokoleg.patterns.abstractfactory.SoundSystem;
import lab.andersen.katokoleg.patterns.abstractfactory.TV;

public class SonyAbstractFactory implements AbstractFactory {
    @Override
    public TV createTV() {
        return new SonyTV();
    }

    @Override
    public SoundSystem createSoundSystem() {
        return new SonySoundSystem();
    }

    @Override
    public AudioSpeakers createAudioSpeakers() {
        return new SonyAudioSpeakers();
    }
}
