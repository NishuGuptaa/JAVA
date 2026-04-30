public class a10Function {
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        printSpace(); //pass --> arguments
        System.out.println("Main Method Ended");
    }
    public static void printSpace(){ //catch --> parameters
        System.out.println("Print Space Method Started");
        System.out.println("Total Memeory: " + Runtime.getRuntime().totalMemory());
        System.out.println("Print Space Method Ended");
    }
}
