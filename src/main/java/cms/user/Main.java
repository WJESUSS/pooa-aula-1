package cms.user;



import cms.user.*;

public class Main {
    public static void main(String[] args) {
        User[] users = {
                new AdminUser(1, "Alice", "alice@site.com", "123"),
                new EditorUser(2, "Bob", "bob@site.com", "abc"),
                new GuestUser(3, "Carol", "carol@site.com", "guest")
        };

        for (User u : users) {
            System.out.println(u.getNome() + " é um " + u.getRole());
        }
    }
}

