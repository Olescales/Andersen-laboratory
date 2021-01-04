package lab.andersen.katokoleg.patterns.chain_of_responsibility;

public class FilterInitializer {

    private Filter initFilter;

    public FilterInitializer(Filter initFilter) {
        this.initFilter = initFilter;
    }

    public boolean authUser(Request request) {
        return initFilter.isAuthenticated(request);
    }
}
