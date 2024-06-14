package lesson9.Prob3;

public class TestBrowserHistory {
    public static void main(String[] args) {
        // Start with home.html
        BrowserHistory browser = new BrowserHistory("home.html");
        System.out.println("Goto home.html: " + browser.getCurrentUrl());

        browser.visit("page1.html"); // Current URL
        System.out.println("Current URL: " + browser.getCurrentUrl());

        browser.visit("page2.html"); // Current URL
        System.out.println("Current URL: " + browser.getCurrentUrl());

        browser.back(); // Goto page1.html
        System.out.println("Goto page1.html: " + browser.getCurrentUrl());

        browser.back(); // Goto home.html
        System.out.println("Goto home.html: " + browser.getCurrentUrl());

        browser.forward(); // Goto page1.html
        System.out.println("Goto page1.html: " + browser.getCurrentUrl());

        browser.forward(); // Goto page2.html
        System.out.println("Goto page2.html: " + browser.getCurrentUrl());

        browser.visit("page3.html"); // Current URL
        System.out.println("Goto page3.html: " + browser.getCurrentUrl());
    }
}
