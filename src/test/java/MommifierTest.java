import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MommifierTest {

    @Test
    void should_insert_mommy_afterwards_given_continuous_vowels() {

        Mommifier mommifier = new Mommifier();

        List<String> expected = new ArrayList<>();
        List<String> actual = new ArrayList<>();


        /* -------------- start test cases -------------- */

        // 1. start with consonant
        expected.add(mommifier.mommify("daofpyimseddauuid"));

        actual.add(
                "dao" + "mommy" +
                "fpyi" + "mommy" +
                "mse" + "mommy" +
                "ddauui" + "mommy" +
                "d" +
                "");


        // 2. start with vowel
        expected.add(mommifier.mommify("aofpyimseddauuid"));

        actual.add(
                "ao" + "mommy" +
                "fpyi" + "mommy" +
                "mse" + "mommy" +
                "ddauui" + "mommy" +
                "d" +
                "");


        // 3. end with vowel
        expected.add(mommifier.mommify("aofpyimseddauui"));

        actual.add(
                "ao" + "mommy" +
                "fpyi" + "mommy" +
                "mse" + "mommy" +
                "ddauui" + "mommy" +
                "");


        // 4. no vowel
        expected.add(mommifier.mommify("qwrtyp"));

        actual.add("qwrtyp");


        // 5. all vowels
        expected.add(mommifier.mommify("aeiou"));

        actual.add(
                "aeiou" + "mommy" +
                "");

        /* -------------- end test cases -------------- */


        assertIterableEquals(expected, actual);
    }
}
