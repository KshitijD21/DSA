public class SortingtheSentence {

    private static void swapSentence(int firstElement, int secondElement, String[] arr) {

        String temp = arr[secondElement];
        arr[secondElement] = arr[firstElement];
        arr[firstElement] = temp;
    }

    private static void sortingtheSentence(String s) {

        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            int index = Character.getNumericValue(arr[i].charAt(arr[i].length() - 1)) ;

            while (index - 1 != i) {
                swapSentence(i, index -1, arr );

                index = Character.getNumericValue(arr[i].charAt(arr[i].length() - 1));
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].substring(0, arr[i].length() - 1);
        }

        String ans = String.join(" ", arr);

        System.out.println(ans);

    }

    public static void main(String[] args) {

        String s = "KTFkUVVrmYMSo2 wXlQraUqblfhCfDLK3 IfTuftYVualQ6 NhpQ5 HlRjClVtQrTFcwbx4 fi1";
        sortingtheSentence(s);

    }
}
