package ArrayManupulation;

public class CommonPrefix {

    public static void main(String[] args) {
        String[] word = {"Fleet", "Flight", "Flower", "New",};

        String shortwr = word[0];

        for (int i = 0; i < word.length; i++) {
            if (shortwr.length() < word[i].length()) {
                shortwr = word[i];
            }
        }

        String pre = " ";

        for (int i = 0; i < shortwr.length(); i++) {
            char ch = shortwr.charAt(i);
            boolean AllMact = true;

            for (int j = 0; j < word.length; j++) {
                if (word[j].charAt(i) != ch)
                    AllMact = false;
                break;
            }

            if (AllMact) {
                pre = pre + ch;
            } else {
                break;
            }
            System.out.println(pre);
        }
    }

}
