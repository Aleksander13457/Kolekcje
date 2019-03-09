public class tab {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        double sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum = sum + tab[i];
            System.out.println("Elementy tablicy " + i + " równy jest " + tab[i]);
        }

        double average = sum / tab.length;
        System.out.println("Wartość średniej z elementów tablicy wynosi " + average);
    }
}