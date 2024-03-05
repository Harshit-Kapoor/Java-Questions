public class FirstLetterOfWords {

    public static void main(String[] args) {

        String s = "This is a sample test string";

        String[] arr = s.split(" ");

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i].charAt(0) + " ");
        }

    }

}
