package src.practice_aspora;

public class MainClass {
    public static void main(String[] args) {
        SingletonInstance s1 = SingletonInstance.getInstance();
        SingletonInstance s2 = SingletonInstance.getInstance();
        if(s1 == s2){
            System.out.println("Singlton works " + s1 + " == " + s2);
        }
    }
}
