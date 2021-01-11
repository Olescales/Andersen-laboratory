package lab.andersen.katokoleg.patterns.chain_of_responsibility.baeldung;

public abstract class AuthenticationProcessor {

    protected AuthenticationProcessor nextProcessor;

    public AuthenticationProcessor(AuthenticationProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract boolean isAuthorized (AuthenticationProvider authProvider);
}
