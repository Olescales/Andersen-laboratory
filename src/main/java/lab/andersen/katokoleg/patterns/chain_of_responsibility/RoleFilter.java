package lab.andersen.katokoleg.patterns.chain_of_responsibility;

public class RoleFilter extends Filter {

    public RoleFilter(Filter nextFilter) {
        super(nextFilter);
    }

    public RoleFilter() {
    }

    @Override
    public boolean isAuthenticated(Request request) {
        boolean result = request.getRole().equals("User");
        if (nextFilter == null || !result) {
            return result;
        } else {
            return nextFilter.isAuthenticated(request);
        }
    }

}
