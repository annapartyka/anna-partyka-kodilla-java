package com.kodilla.testing;

        import com.kodilla.testing.calculator.Calculator;
        import com.kodilla.testing.user.SimpleUser;

        import java.util.SortedMap;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        }
        else{
            System.out.println("Error!");
        }
        //Testin calculator class
        Calculator calculator = new Calculator();
        int addResult = calculator.add(5,10);
        int subResult = calculator.subtract(20,5);

        if ((addResult == 15) && (subResult == 15)){
            System.out.println("Calculator OK");
        }
        else{
            System.out.println("Calculator Error");
        }
    }
}
