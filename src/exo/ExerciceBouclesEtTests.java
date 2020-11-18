package exo;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        ShowArray(array);
        ShowArrayInverse(array);
        ShowSupAtN(array, 3);
        ShowPairOrImpair(array, true);
        ShowIndexPairOrImpaire(array, true);
        ShowPairOrImpair(array, false);
    }

    public static void ShowArray(int[] array) {
        for (int n: array) {
            System.out.println(n);
        }
    }

    public static void ShowArrayInverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static void ShowSupAtN(int[] array, int nb){
        for (int i = 0; i < array.length; i++) {
            if (array[i] > nb) {
                System.out.println(array[i]);
            }
        }
    }

    public static void ShowPairOrImpair(int[] array, boolean showPair) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == (showPair ? 0 : 1)) {
                System.out.println(array[i]);
            }
        }
    }

    public static void ShowIndexPairOrImpaire(int[] array, boolean showPair){
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == (showPair ? 0 : 1)) {
                System.out.println(array[i]);
            }
        }
    }
}
