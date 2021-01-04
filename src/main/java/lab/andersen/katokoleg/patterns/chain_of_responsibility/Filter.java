package lab.andersen.katokoleg.patterns.chain_of_responsibility;

public abstract class Filter {

    protected Filter nextFilter;


    public Filter() {
    }

    public Filter(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }

    public abstract boolean isAuthenticated (Request request);
}