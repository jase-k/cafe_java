public class CafeJava {
    public static void main(String[] args){
        System.out.println("Hello jase");

        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $"; 

        //Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 8.99;
        double latte = 5.75;
        double cappuccino = 4.99;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;


        //App Interaction Simulation (Add your code for the challenges below)
        //Example: 
        System.out.println(generalGreeting + customer1); 
        if(isReadyOrder1){
            System.out.println(readyMessage);
        }
        else {
            System.out.println(pendingMessage);
        }

        System.out.println(displayTotalMessage + String.valueOf(dripCoffee));
        
        //Prints Noahs
        System.out.println(generalGreeting + customer4); 
        if(isReadyOrder4){
            System.out.println(readyMessage);
        }
        else {
            System.out.println(pendingMessage);
        }
        System.out.println(displayTotalMessage + String.valueOf(cappuccino));

        //Prints Sam
        System.out.println(generalGreeting + customer2); 
        if(isReadyOrder2){
            System.out.println(readyMessage);
        }
        else {
            System.out.println(pendingMessage);
        }
        System.out.println(displayTotalMessage + String.valueOf(latte * 2));

        //Prints Jimmy
        System.out.println(generalGreeting + customer3); 
        if(isReadyOrder3){
            System.out.println(readyMessage);
        }
        else {
            System.out.println(pendingMessage);
        }
        System.out.println(displayTotalMessage + String.valueOf(latte - dripCoffee));
        

    }
}