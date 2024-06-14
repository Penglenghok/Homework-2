package lesson9.Prob3;

import java.util.Stack;

public class BrowserHistory {
    Stack<String> forwardStack = new Stack<>();
    Stack<String> backwardStack = new Stack<>();
    String currentUrl;

    public BrowserHistory(String initialUrl) {
        currentUrl = initialUrl;
        backwardStack.push(currentUrl);
    }

    public void visit(String url) {
        if (url != null){
            backwardStack.push(url);
            currentUrl = url;
            forwardStack.clear();
        }
    }

    public void back(){
        if (!backwardStack.isEmpty()){
            forwardStack.push(currentUrl);
            int index = backwardStack.search(currentUrl);
            if (index == -1){
                currentUrl = backwardStack.pop();
            }else {
                currentUrl = backwardStack.elementAt(index);
                backwardStack.pop();
                backwardStack.remove(index);
            }
        }else {
            System.out.println("No more history to go back!");
        }
    }

    public void forward(){
        if (!forwardStack.isEmpty()){
            backwardStack.push(currentUrl);
            currentUrl = forwardStack.pop();
        }else {
            System.out.println("No more history to go forward!");
        }
    }

    public String getCurrentUrl() {
        return currentUrl;
    }
}
