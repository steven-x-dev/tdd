public class Mommifier {


    private static final String VOWELS = "aeiou";
    private static final String MOMMY = "mommy";


    public String mommify(String str) {

        StringBuilder sb = new StringBuilder();

        boolean isPrevVowel = false;

        for (char c : str.toCharArray()) {

            if (isVowel(c)) {

                sb.append(c);
                isPrevVowel = true;

            } else {

                if (isPrevVowel)
                    sb.append(MOMMY);

                sb.append(c);

                isPrevVowel = false;
            }
        }

        if (isVowel(str.charAt(str.length() - 1)))
            sb.append(MOMMY);

        return sb.toString();
    }


    private static boolean isVowel(char c) {
        return VOWELS.indexOf(c) != -1;
    }

}
