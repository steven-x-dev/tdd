import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MommifierTest {

    private static final String INSERT = "mommy";

    private static final String START_WITH_CONSONANT_LT_30_PERC_EXP = "daofpyimseddauuid";
    private static final String START_WITH_CONSONANT_LT_30_PERC_ACT =
            "dao"    + INSERT +
            "fpyi"   + INSERT +
            "mse"    + INSERT +
            "ddauui" + INSERT +
            "d";

    private static final String END_WITH_CONSONANT_LT_30_PERC_EXP = "aofpyimseddauuid";
    private static final String END_WITH_CONSONANT_LT_30_PERC_ACT =
            "ao"     + INSERT +
            "fpyi"   + INSERT +
            "mse"    + INSERT +
            "ddauui" + INSERT +
            "d";

    private static final String END_WITH_VOWEL_LT_30_PERC_EXP = "aofpyimseddauui";
    private static final String END_WITH_VOWEL_LT_30_PERC_ACT =
            "ao"     + INSERT +
            "fpyi"   + INSERT +
            "mse"    + INSERT +
            "ddauui" + INSERT;

    private static final String NO_VOWEL_EXP = "qwrtyp";
    private static final String NO_VOWEL_ACT = "qwrtyp";

    private static final String ALL_VOWELS_EXP = "aeiou";
    private static final String ALL_VOWELS_ACT = "aeiou" + INSERT;


    @Test
    void should_insert_mommy_afterwards_given_continuous_vowels() {

        Mommifier mommifier = new Mommifier();

        List<String> expected = new ArrayList<>();
        List<String> actual = new ArrayList<>();

        expected.add(mommifier.mommify(START_WITH_CONSONANT_LT_30_PERC_EXP));
        actual.add(START_WITH_CONSONANT_LT_30_PERC_ACT);

        expected.add(mommifier.mommify(END_WITH_CONSONANT_LT_30_PERC_EXP));
        actual.add(END_WITH_CONSONANT_LT_30_PERC_ACT);

        expected.add(mommifier.mommify(END_WITH_VOWEL_LT_30_PERC_EXP));
        actual.add(END_WITH_VOWEL_LT_30_PERC_ACT);

        expected.add(mommifier.mommify(NO_VOWEL_EXP));
        actual.add(NO_VOWEL_ACT);

        expected.add(mommifier.mommify(ALL_VOWELS_EXP));
        actual.add(ALL_VOWELS_ACT);

        assertIterableEquals(expected, actual);
    }
}
