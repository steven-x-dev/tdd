public class Mommifier {


    public String mommify(String str) {

        StringBuilder sb = new StringBuilder();

        String vowels = "aeiou";

        boolean isPrevVowel = false;

        for (char c : str.toCharArray()) {

            if (vowels.indexOf(c) != -1) {

                sb.append(c);
                isPrevVowel = true;

            } else {

                if (isPrevVowel)
                    sb.append("mommy");

                sb.append(c);

                isPrevVowel = false;
            }
        }

        if (vowels.indexOf(str.charAt(str.length() - 1)) != -1)
            sb.append("mommy");

        return sb.toString();
    }

}
