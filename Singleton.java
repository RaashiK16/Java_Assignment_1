public class Singleton {
    
    private static Singleton instance = new Singleton();
    private Singleton(){
        instance = null;
    }
    //the constructor here is private so as to make sure it cannot be accessed from outside the class.

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    //this method is publically accessible and is used to create objects of this class. This method ensures that not more than one object of the class can be created

    public static void main(String[] args) {

        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();

        System.out.println("Object1 hashCode=" + object1.hashCode());
        System.out.println("Object2 hashCode=" + object2.hashCode());

        System.out.println();

        // To check if both objects are the same
        if (object1 == object2) {
            System.out.println("Hence, Both objects are the same");
        } else {
            System.out.println("Both objects are NOT the same");
        }
    }

}

