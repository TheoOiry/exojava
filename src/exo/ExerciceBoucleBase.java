package exo;

public class ExerciceBoucleBase {
    public static void main(String[] args) {
        AllNumbersOneToTen();
        TwentyName("OIRY Théo");
        Pair();
        Impaire();
    }

    public static void AllNumbersOneToTen(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void TwentyName(String name){
        for (int i = 0; i < 20; i++) {
            System.out.println(name);
        }
    }

    public static void Pair(){
        for (int i = 2; i <= 100; i+=2) {
            System.out.println(i);
        }
    }

    public static void Impaire(){
        for (int i = 1; i < 100; i+=2) {
            System.out.println(i);
        }
    }
}
