package homework.java.homework28;

class Page {
    Page() {
        System.out.println("Page constructor");
    }

    void loadPage() {
        System.out.println("Load page");
    }

    void isPageLoaded() {
        System.out.println("Is page loaded?");
    }
}
class LoginPage extends Page {
        LoginPage(){
            System.out.println("Login constructor");
        }
        void doLogin() {
            System.out.println("Login");
        }

        void logout() {
            System.out.println("Logout");
        }
    }
class HomePage extends Page {
        HomePage(){
            System.out.println("Home page");
        }
        void openHomePage() {
            System.out.println("Open home page");
        }

        void verifyLogo() {
            System.out.println("Verify logo");
        }
    }
public class Homework28 {
    public static void main(String[] args) {

        LoginPage user1 = new LoginPage();
        user1.doLogin();
        user1.logout();
        HomePage user2 = new HomePage();
        user2.openHomePage();
        user2.verifyLogo();

    }

}
