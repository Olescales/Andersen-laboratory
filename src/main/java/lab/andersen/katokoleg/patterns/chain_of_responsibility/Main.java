package lab.andersen.katokoleg.patterns.chain_of_responsibility;

import java.util.Scanner;

public class Main {

    private static FilterInitializer filterInitializer;

    public static void initFilters() {
        Filter filter = new RoleFilter();
        Filter filter1 = new ValidationFilter(filter);
        filterInitializer = new FilterInitializer(filter1);
    }

    public static void main(String[] args) {
        initFilters();
        Scanner sc = new Scanner(System.in);
        String login = sc.nextLine();
        String password = sc.nextLine();
        String role = sc.nextLine();

        Request request = new Request(login, password, role);

        boolean userAuthenticate = filterInitializer.authUser(request);
        if (userAuthenticate) {
            System.out.println("Welcome");
        } else {
            System.out.println("Not authenticated");
        }

    }
}
