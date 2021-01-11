package lab.andersen.katokoleg.patterns.chain_of_responsibility;

public class ValidationFilter extends Filter {

    public ValidationFilter(Filter nextFilter) {
        super(nextFilter);
    }

    @Override
    public boolean isAuthenticated(Request request) {
        boolean result;
        result = request.getLogin().matches("([A-Z])\\w+")
                && request.getPassword().matches("([A-Z])\\w+");

        if (nextFilter == null || !result) {
            return result;
        } else {
            return nextFilter.isAuthenticated(request);
        }
    }
}
