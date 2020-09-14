public class Mommifier {


    private static final String VOWELS = "aeiou";
    private static final String MOMMY = "mommy";


    public String mommify(String str) {

        if (calculateVowelPercentage(str) <= 0.3) return str;

        StringBuilder sb = new StringBuilder();

        boolean isPrevVowel = false;

        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                sb.append(c);
                isPrevVowel = true;
            } else {
                if (isPrevVowel) {
                    sb.append(MOMMY);
                }
                sb.append(c);
                isPrevVowel = false;
            }
        }

        if (isVowel(str.charAt(str.length() - 1))) {
            sb.append(MOMMY);
        }

        return sb.toString();
    }


    private static double calculateVowelPercentage(String str) {

        int vowelCount = 0;

        for (char c : str.toCharArray()) {
            if (isVowel(c)) vowelCount++;
        }

        return (double) vowelCount / str.length();
    }


    private static boolean isVowel(char c) {
        return VOWELS.indexOf(c) != -1;
    }

}
